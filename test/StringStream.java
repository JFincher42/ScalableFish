import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StringStream
{
    private ByteArrayOutputStream stringStream = new ByteArrayOutputStream();
    private PrintStream stringOut = new PrintStream(stringStream);
    private PrintStream old = null;

    public void setEnabled(boolean enabled)
    {
        if (enabled)
        {
            if (old == null)
            {
                old = System.out;
                System.setOut(stringOut);
            }
        }
        else
        {
            if (old != null)
            {
                System.out.flush();
                System.setOut(old);
                old = null;
            }
        }
    }   //setEnabled

    public boolean isEnabled()
    {
        return old != null;
    }   //isEnabled

    public String toString()
    {
        return stringStream.toString();
    }   //toString
    
    public int hashCode(){
    	return stringStream.toString().hashCode();
    }   //hashCode
    
    public void reset() {
    	stringStream.reset();
    }

}   //class StringStream
