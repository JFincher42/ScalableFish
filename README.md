# Scalable Fish ASCII Art Project
Two parts, 45 total points.

## Part 1
Create a program that prints various size ASCII art fish by calling the `drawFish()` method specifying the fish size
as an integer parameter. Your `main()` method should call the `drawFish()` method, passing the fish size parameter. 
The fish size parameter is the only value that should change in order to print different size fish! The `drawFish()` 
method must be able to handle illegal sizes (e.g. 0, negative sizes).  If it receives an illegal size, it should print 
nothing.

**Size 1 fish**

       vvv
        v  
       vov  
      vooov  
     vooooov  
    vooooooov  
     voo oov  
      v   v  

**Size 2 fish**

        vvvvv  
         vvv  
          v  
         vov  
        vooov  
       vooooov  
      vooooooov  
     vooooooooov  
    vooooooooooov  
     voooo oooov  
      voo   oov  
       v     v

**Size 3 fish**

         vvvvvvv  
          vvvvv  
           vvv  
            v  
           vov  
          vooov  
         vooooov  
        vooooooov  
       vooooooooov  
      vooooooooooov  
     vooooooooooooov  
    vooooooooooooooov  
     voooooo oooooov  
      voooo   oooov  
       voo     oov  
        v       v  

**Part 1 Grading Scheme/Rubric**

**Functional Correctness - 10 points**
---------------------------------------
1 point: Correctly define a fish size parameter    
1 point: Correctly define the `main()` method.  
1 point: Correctly call the `drawFish()` method in main.    
1 point: Correctly define the `drawFish()` method with correct parameter.    
2 points: Procedural Decomposition  
  - 0 point: All work done in `drawFish()`  
  - 1 point: Partial procedural decomposition    
  - 2 points: Full procedure decomposition    

4 points: Correctness of output  
  - Correct output for illegal sizes    
  - Correct output for size 1  
  - Correct output for odd sizes    
  - Correct output for even sizes  
    

**Coding Style - 10 points**  
-----------------------------  
- Good: 2 points
- Fair: 1 point
- Poor: 0 point  

2 points: Readability: Indentation  
2 points: Readability: Meaningful method and variable names.  
2 points: Readability: Comments/Documentation.  
2 points: Efficiency: Code duplication.  
2 points: Efficiency: Smart algorithm.  

##Part 2##
Modify your main method to call the `foodChain()` method. The `foodChain()` method takes three integer parameters: 
minSize, maxSize and sizeStep that are defined as class constants. It will call the `drawFish()` method to print 
several fishes from maxSize to minSize decreasing the fish size by sizeStep on each fish. The resulting output will 
look like the big fish is chasing and eating the smaller fish.

The following example demonstrates a call to `foodChain(1, 5, 2)` with 1 as minSize, 5 as maxSize and 2 as sizeStep. 
This will print the fishes sized 5, 3, and 1.

Example output of `foodChain(1, 5, 2)`

           vvvvvvvvvvv
            vvvvvvvvv
             vvvvvvv
              vvvvv
               vvv
                v
               vov
              vooov
             vooooov
            vooooooov
           vooooooooov
          vooooooooooov
         vooooooooooooov
        vooooooooooooooov
       vooooooooooooooooov
      vooooooooooooooooooov
     vooooooooooooooooooooov
    vooooooooooooooooooooooov
     voooooooooo oooooooooov
      voooooooo   oooooooov
       voooooo     oooooov
        voooo       oooov
         voo         oov
          v           v

             vvvvvvv
              vvvvv
               vvv
                v
               vov
              vooov
             vooooov
            vooooooov
           vooooooooov
          vooooooooooov
         vooooooooooooov
        vooooooooooooooov
         voooooo oooooov
          voooo   oooov
           voo     oov
            v       v

               vvv
                v
               vov
              vooov
             vooooov
            vooooooov
             voo oov
              v   v

The `foodChain()` method may assume the parameters are valid. In other words, it doesn’t need to check for parameter 
error. It is important to note that all the fishes printed *must be center justified*. In order to do this, the 
`drawFish()` method must accept a second integer parameter leftPadding that specifies the number of spaces inserted to 
the left of the fish so that it will be aligned with bigger fishes at the center column.

##Grading Scheme/Rubric##

**Functional Correctness - 15 points**
---------------------------------------

2 points: Correctly define the minSize, maxSize, sizeStep class constants.  
- 2 points: Fully correct  
- 1 points: Partially correct  
- 1 point: Missing or incorrect  

1 point: Correctly call the `foodChain()` method in main.  
1 point: Correctly define the `foodChain()` method with correct parameters.  
1 point: Correct implementation of the for-loop in the `foodChain()` method.  
2 points: Proper use of procedural decomposition.  
- 0 points: All work done in `foodChain()`  
- 1 point: Partial procedural decomposition  
- 2 points: Full procedure decomposition  

8 points: Correctness of output.  
- Correct alignment for odd size, odd center column  
- Correct alignment for odd size, even center column  
- Correct alignment for even size, odd center column  
- Correct alignment for even size, even center column  
- foodChain(1, 3, 1)  
- foodChain(1, 9, 2)  
- foodChain(2, 10, 2)  
- minSize 1, random maxSize up to 20, random step between 1 and 4  

**Coding Style - 10 points**  
-----------------------------  
- Good: 2 points
- Fair: 1 point
- Poor: 0 point  

2 points: Readability: Indentation  
2 points: Readability: Meaningful method and variable names.  
2 points: Readability: Comments/Documentation.  
2 points: Efficiency: Code duplication.  
2 points: Efficiency: Smart algorithm. 
