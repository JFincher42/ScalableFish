/*
 * Scalable Fish ASCII Art Project:
 *
 * Part 1: Create a program that prints various size ASCII art fish by calling the drawFish method specifying
 * the fish size as an integer parameter. Your main method should call the drawFish method passing a class
 * constant as the fish size parameter. The class constant is the only value that should change in order to
 * print different size fish! The drawFish method must be able to handle illegal sizes (e.g. 0, negative sizes)
 * in which case it should do nothing.
 *
 * Part 2: Modify your main method to call the foodChain method. The foodChain method takes three integer
 * parameters: minSize, maxSize and sizeStep that are defined as class constants. It will call the drawFish
 * method to print several fishes from maxSize to minSize decreasing the fish size by sizeStep on each fish
 * so that the resulting output should look like the big fish is chasing and eating the smaller fish. The
 * following example demonstrates a call to foodChain(1, 5, 2) with 1 as minSize, 5 as maxSize and 2 as sizeStep.
 * This will print the fishes sized 5, 3, and 1. The foodChain method may assume the parameters are valid.
 * In other words, it doesn't need to check for parameter error. It is important to note that all the fishes
 * printed must be center justified. In order to do this, the drawFish method must accept a second integer
 * parameter leftPadding that specifies the number of spaces inserted to the left of the fish so that it will
 * be aligned with bigger fishes at the center column.
 *
 * Size 1 fish with leftPadding 4
 *        vvv
 *         v
 *        vov
 *       vooov
 *      vooooov
 *     vooooooov
 *      voo oov
 *       v   v
 *
 * Size 2 fish with left padding 2
 *       vvvvv
 *        vvv
 *         v
 *        vov
 *       vooov
 *      vooooov
 *     vooooooov
 *    vooooooooov
 *   vooooooooooov
 *    voooo oooov
 *     voo   oov
 *      v     v
 *
 * Size 3 fish with left padding 0
 *      vvvvvvv
 *       vvvvv
 *        vvv
 *         v
 *        vov
 *       vooov
 *      vooooov
 *     vooooooov
 *    vooooooooov
 *   vooooooooooov
 *  vooooooooooooov
 * vooooooooooooooov
 *  voooooo oooooov
 *   voooo   oooov
 *    voo     oov
 *     v       v
 */

public class ScalableFish
{
	public static void drawFish(int size) {
		
	}
	
	public static void drawFish(int size, int leftPadding) {
		
	}
	
	public static void foodChain(int minSize, int maxSize, int sizeStep) {
		
	}
	
}   //class ScalableFish

