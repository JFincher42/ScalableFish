import static org.junit.Assert.*;

import java.io.File;
import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ScalableFishTest
{
    //private static StringStream solutionStream = new StringStream();
    private static StringStream studentStream = new StringStream();
    private static int part1Score = 0;
    private static int part2Score = 0;
    
    // Variables to store the solution hashes, to compare the student hashes against.
    private static int part1IllegalSizesHash;
    private static int part1Size1Hash;
    private static int part1OddSizesHash;
    private static int part1EvenSizesHash;
    private static int part2OddSizeOddOffsetHash;
    private static int part2OddSizeEvenOffsetHash;
    private static int part2EvenSizeOddOffsetHash;
    private static int part2EvenSizeEvenOffsetHash;
    private static int part2FoodChainSequentialHash;
    private static int part2FoodChainOddSizesHash;
    private static int part2FoodChainEvenSizesHash;
    private static int part2FoodChainRandomHash[][] = new int[20][4];

    @BeforeClass
    public static void testBegin()
    {
        System.out.println("\nScalableFish Tests:\n");
    	try{
    		readHashes();
    	}
    	catch (Exception e) {
    		System.out.println(e);
    	}

    }   //testBegin

    @AfterClass
    public static void testEnd()
    {
        System.out.printf("\nPart 1 total score = %d\n", part1Score);
        System.out.printf("Part 2 total score = %d\n", part2Score);
    }   //testEnd

    @Test
    public void part1IllegalSizes()
    {
    	int hash;
        System.out.print("Part 1 - Test illegal fish size: ");

        studentStream.setEnabled(true);
        ScalableFish.drawFish(0);
        ScalableFish.drawFish(-1);
        ScalableFish.drawFish(-6);
        studentStream.setEnabled(false);
        hash = studentStream.hashCode();
        studentStream.reset();

        if (hash == part1IllegalSizesHash)
        {
           part1Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(hash, part1IllegalSizesHash);
    }   //part1IllegalSizes

    @Test
    public void part1Size1()
    {
    	int hash;
    	
        System.out.print("Part 1 - Test fish size 1: ");

        studentStream.setEnabled(true);
        ScalableFish.drawFish(1);
        studentStream.setEnabled(false);
        hash = studentStream.hashCode();
        studentStream.reset();

        if (hash == part1Size1Hash)
        {
           part1Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(part1Size1Hash, hash);
    }   //part1Size1

    @Test
    public void part1OddSizes()
    {
    	int hash;
    	
        System.out.print("Part 1 - Test odd fish sizes: ");

        studentStream.setEnabled(true);
        ScalableFish.drawFish(3);
        ScalableFish.drawFish(5);
        ScalableFish.drawFish(7);
        studentStream.setEnabled(false);
        hash = studentStream.hashCode();
        studentStream.reset();

        if (part1OddSizesHash == hash)
        {
           part1Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(part1OddSizesHash, hash);
    }   //part1OddSizes

    @Test
    public void part1EvenSizes()
    {
    	int hash;
    	
        System.out.print("Part 1 - Test even fish sizes: ");

        studentStream.setEnabled(true);
        ScalableFish.drawFish(2);
        ScalableFish.drawFish(4);
        ScalableFish.drawFish(6);
        studentStream.setEnabled(false);
        hash = studentStream.hashCode();
        studentStream.reset();

        if (part1EvenSizesHash == hash)
        {
           part1Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(part1EvenSizesHash, hash);
    }   //part1EvenSizes

    @Test
    public void part2OddSizeOddOffset()
    {
    	int hash;
    	
        System.out.print("Part 2 - Test odd size/odd offset: ");

        studentStream.setEnabled(true);
        ScalableFish.drawFish(3, 7);
        ScalableFish.drawFish(5, 3);
        studentStream.setEnabled(false);
        hash = studentStream.hashCode();
        studentStream.reset();

        if (part2OddSizeOddOffsetHash == hash)
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(part2OddSizeOddOffsetHash, hash);
    }   //part2OddSizeOddOfset

    @Test
    public void part2OddSizeEvenOffset()
    {
    	int hash;
    	
        System.out.print("Part 2 - Test odd size/even offset: ");

        studentStream.setEnabled(true);
        ScalableFish.drawFish(3, 6);
        ScalableFish.drawFish(5, 2);
        studentStream.setEnabled(false);
        hash = studentStream.hashCode();
        studentStream.reset();

        if (part2OddSizeEvenOffsetHash == hash)
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(part2OddSizeEvenOffsetHash, hash);
    }   //part2OddSizeEvenOffset

    @Test
    public void part2EvenSizeOddOffset()
    {
    	int hash;
    	
        System.out.print("Part 2 - Test even size/odd offset: ");

        studentStream.setEnabled(true);
        ScalableFish.drawFish(2, 9);
        ScalableFish.drawFish(4, 5);
        studentStream.setEnabled(false);
        hash = studentStream.hashCode();
        studentStream.reset();

        if (part2EvenSizeOddOffsetHash == hash)
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(part2EvenSizeOddOffsetHash, hash);
    }   //part2EvenSizeOddOffset

    @Test
    public void part2EvenSizeEvenOffset()
    {
    	int hash;
    	
        System.out.print("Part 2 - Test even size/even offset: ");

        studentStream.setEnabled(true);
        ScalableFish.drawFish(2, 8);
        ScalableFish.drawFish(4, 4);
        studentStream.setEnabled(false);
        hash = studentStream.hashCode();
        studentStream.reset();

        if (part2EvenSizeEvenOffsetHash == hash)
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(part2EvenSizeEvenOffsetHash, hash);
    }   //part2EvenSizeEvenOffset

    @Test
    public void part2FoodChainSequential()
    {
    	int hash;
    	
        System.out.print("Part 2 - Test FoodChain sequential: ");

        studentStream.setEnabled(true);
        ScalableFish.foodChain(1, 3, 1);
        studentStream.setEnabled(false);
        hash = studentStream.hashCode();
        studentStream.reset();

        if (part2FoodChainSequentialHash == hash)
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(part2FoodChainSequentialHash, hash);
    }   //part2FoodChainSequential

    @Test
    public void part2FoodChainOddSizes()
    {
    	int hash;
    	
        System.out.print("Part 2 - Test FoodChain odd sizes: ");

        studentStream.setEnabled(true);
        ScalableFish.foodChain(1, 9, 2);
        studentStream.setEnabled(false);
        hash = studentStream.hashCode();
        studentStream.reset();

        if (part2FoodChainOddSizesHash == hash)
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(part2FoodChainOddSizesHash, hash);
    }   //part2FoodChainOddSizes

    @Test
    public void part2FoodChainEvenSizes()
    {
    	int hash;
    	
        System.out.print("Part 2 - Test FoodChain even sizes: ");

        studentStream.setEnabled(true);
        ScalableFish.foodChain(2, 10, 2);
        studentStream.setEnabled(false);
        hash = studentStream.hashCode();
        studentStream.reset();

        if (part2FoodChainEvenSizesHash == hash)
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(part2FoodChainEvenSizesHash, hash);
    }   //part2FoodChainEvenSizes

    @Test
    public void part2FoodChainRandom()
    {
    	int hash;
    	
        int max = (int)(Math.random()*20) + 1;
        int step = (int)(Math.random()*4) + 1;

        System.out.printf("Part 2 - Test FoodChain(1, %d, %d): ", max, step);

        studentStream.setEnabled(true);
        ScalableFish.foodChain(1, max, step);
        studentStream.setEnabled(false);
        hash = studentStream.hashCode();
        studentStream.reset();

        if (part2FoodChainRandomHash[max-1][step-1] == hash)
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(part2FoodChainRandomHash[max-1][step-1],hash);
    }   //part2FoodChainRandom
    
	private static void readHashes() throws Exception {
    	
    	Scanner hashFile = new Scanner(new File("test/ScalableFishHashes.txt"));
    	String desc;
    	int max, step;
    	
    	// Each hash starts with a description, so we should check it matches...
    	desc = hashFile.nextLine();
    	if (0==desc.compareToIgnoreCase("part1IllegalSizes"))
    		part1IllegalSizesHash = hashFile.nextInt();
    	hashFile.nextLine();				// Skip the newline
    	
    	desc = hashFile.nextLine();
    	if (0==desc.compareToIgnoreCase("part1Size1"))
			part1Size1Hash = hashFile.nextInt();
    	hashFile.nextLine();				// Skip the newline

    	desc = hashFile.nextLine();
    	if (0==desc.compareToIgnoreCase("part1OddSizes"))
    		part1OddSizesHash = hashFile.nextInt();
    	hashFile.nextLine();				// Skip the newline

    	desc = hashFile.nextLine();
    	if (0==desc.compareToIgnoreCase("part1EvenSizes"))
    		part1EvenSizesHash = hashFile.nextInt();
    	hashFile.nextLine();				// Skip the newline

    	desc = hashFile.nextLine();
    	if (0==desc.compareToIgnoreCase("part2OddSizeOddOffset"))
    		part2OddSizeOddOffsetHash = hashFile.nextInt();
    	hashFile.nextLine();				// Skip the newline
        
    	desc = hashFile.nextLine();
    	if (0==desc.compareToIgnoreCase("part2OddSizeEvenOffset"))
    		part2OddSizeEvenOffsetHash = hashFile.nextInt();
    	hashFile.nextLine();				// Skip the newline

    	desc = hashFile.nextLine();
    	if (0==desc.compareToIgnoreCase("part2EvenSizeOddOffset"))
    		part2EvenSizeOddOffsetHash = hashFile.nextInt();
    	hashFile.nextLine();				// Skip the newline

    	desc = hashFile.nextLine();
    	if (0==desc.compareToIgnoreCase("part2EvenSizeEvenOffset"))
    		part2EvenSizeEvenOffsetHash = hashFile.nextInt();
    	hashFile.nextLine();				// Skip the newline

    	desc = hashFile.nextLine();
    	if (0==desc.compareToIgnoreCase("part2FoodChainSequential"))
    		part2FoodChainSequentialHash = hashFile.nextInt();
    	hashFile.nextLine();				// Skip the newline

    	desc = hashFile.nextLine();
    	if (0==desc.compareToIgnoreCase("part2FoodChainOddSizes"))
    		part2FoodChainOddSizesHash = hashFile.nextInt();
    	hashFile.nextLine();				// Skip the newline

    	desc = hashFile.nextLine();
    	if (0==desc.compareToIgnoreCase("part2FoodChainEvenSizes"))
    		part2FoodChainEvenSizesHash = hashFile.nextInt();
    	hashFile.nextLine();				// Skip the newline
    
    	// Now read in the array of hashes for part2FoodChainRandom
    	// In this case, we need three ints - two for the array indices, and one for the hash
    	// There are 80 of them as well, so we keep reading until we're done
    	desc = hashFile.nextLine();
    	if (0==desc.compareToIgnoreCase("part2FoodChainRandom")) {
    		for (int i=0; i<80; i++) {
    			max = hashFile.nextInt();
    			step = hashFile.nextInt();
    			part2FoodChainRandomHash[max-1][step-1] = hashFile.nextInt();
    			hashFile.nextLine();
    		}
    	}
    	hashFile.close();
    }


}   //class ScalableFishTest
