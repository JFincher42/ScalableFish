import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ScalableFishTest
{
    private static StringStream solutionStream = new StringStream();
    private static StringStream studentStream = new StringStream();
    private static int part1Score = 0;
    private static int part2Score = 0;

    @BeforeClass
    public static void testBegin()
    {
        System.out.println("\nScalableFish Tests:\n");
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
        System.out.print("Part 1 - Test illegal fish size: ");

        solutionStream.setEnabled(true);
        ScalableFishSample.drawFish(0);
        ScalableFishSample.drawFish(-1);
        ScalableFishSample.drawFish(-6);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        ScalableFish.drawFish(0);
        ScalableFish.drawFish(-1);
        ScalableFish.drawFish(-6);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part1Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part1IllegalSizes

    @Test
    public void part1Size1()
    {
        System.out.print("Part 1 - Test fish size 1: ");

        solutionStream.setEnabled(true);
        ScalableFishSample.drawFish(1);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        ScalableFish.drawFish(1);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part1Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part1Size1

    @Test
    public void part1OddSizes()
    {
        System.out.print("Part 1 - Test odd fish sizes: ");

        solutionStream.setEnabled(true);
        ScalableFishSample.drawFish(3);
        ScalableFishSample.drawFish(5);
        ScalableFishSample.drawFish(7);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        ScalableFish.drawFish(3);
        ScalableFish.drawFish(5);
        ScalableFish.drawFish(7);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part1Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part1OddSizes

    @Test
    public void part1EvenSizes()
    {
        System.out.print("Part 1 - Test even fish sizes: ");

        solutionStream.setEnabled(true);
        ScalableFishSample.drawFish(2);
        ScalableFishSample.drawFish(4);
        ScalableFishSample.drawFish(6);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        ScalableFish.drawFish(2);
        ScalableFish.drawFish(4);
        ScalableFish.drawFish(6);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part1Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part1EvenSizes

    @Test
    public void part2OddSizeOddOffset()
    {
        System.out.print("Part 2 - Test odd size/odd offset: ");

        solutionStream.setEnabled(true);
        ScalableFishSample.drawFish(3, 7);
        ScalableFishSample.drawFish(5, 3);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        ScalableFish.drawFish(3, 7);
        ScalableFish.drawFish(5, 3);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2OddSizeOddOfset

    @Test
    public void part2OddSizeEvenOffset()
    {
        System.out.print("Part 2 - Test odd size/even offset: ");

        solutionStream.setEnabled(true);
        ScalableFishSample.drawFish(3, 6);
        ScalableFishSample.drawFish(5, 2);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        ScalableFish.drawFish(3, 6);
        ScalableFish.drawFish(5, 2);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2OddSizeEvenOffset

    @Test
    public void part2EvenSizeOddOffset()
    {
        System.out.print("Part 2 - Test even size/odd offset: ");

        solutionStream.setEnabled(true);
        ScalableFishSample.drawFish(2, 9);
        ScalableFishSample.drawFish(4, 5);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        ScalableFish.drawFish(2, 9);
        ScalableFish.drawFish(4, 5);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2EvenSizeOddOffset

    @Test
    public void part2EvenSizeEvenOffset()
    {
        System.out.print("Part 2 - Test even size/even offset: ");

        solutionStream.setEnabled(true);
        ScalableFishSample.drawFish(2, 8);
        ScalableFishSample.drawFish(4, 4);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        ScalableFish.drawFish(2, 8);
        ScalableFish.drawFish(4, 4);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2EvenSizeEvenOffset

    @Test
    public void part2FoodChainSequential()
    {
        System.out.print("Part 2 - Test FoodChain sequential: ");

        solutionStream.setEnabled(true);
        ScalableFishSample.foodChain(1, 3, 1);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        ScalableFish.foodChain(1, 3, 1);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2FoodChainSequential

    @Test
    public void part2FoodChainOddSizes()
    {
        System.out.print("Part 2 - Test FoodChain odd sizes: ");

        solutionStream.setEnabled(true);
        ScalableFishSample.foodChain(1, 9, 2);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        ScalableFish.foodChain(1, 9, 2);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2FoodChainOddSizes

    @Test
    public void part2FoodChainEvenSizes()
    {
        System.out.print("Part 2 - Test FoodChain even sizes: ");

        solutionStream.setEnabled(true);
        ScalableFishSample.foodChain(2, 10, 2);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        ScalableFish.foodChain(2, 10, 2);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2FoodChainEvenSizes

    @Test
    public void part2FoodChainRandom()
    {
        int max = (int)(Math.random()*20) + 1;
        int step = (int)(Math.random()*4) + 1;

        System.out.printf("Part 2 - Test FoodChain(1, %d, %d): ", max, step);

        solutionStream.setEnabled(true);
        ScalableFishSample.foodChain(1, max, step);
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        ScalableFish.foodChain(1, max, step);
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           part2Score += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //part2FoodChainRandom

}   //class ScalableFishTest
