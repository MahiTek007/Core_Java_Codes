package PracticePrograms.GeeksProblems;
/**
 * Journey Today! 

banner
Given three numbers A,B and C. Find roots of quadratic equation Ax2 + Bx + C = 0. (A not equal to  0)
 

Example 1:

Input: A = 2, B = 3, C = 2
Output: -2.366025, -0.633975
Explanation: Roots of the equation
2x2+3x+2=0 are -2.366025 and -0.633975.

Example 2:

Input: A = 2, B = 3, C = 4
Output: -1
Explanation: Roots of 2x2 + 3x + 4 = 0
are not real.
 

Your Task:
You don't need to read or print anyhting. Your task is to complete the function FindRoots() which takes A, B and C as input parameters and returns a list of roots of the given equation in ascending order. If roots are not real numbers then return a list containing -1.
 

Expected Time Complexity: O(1)
Expected Space Complexity: O(1)
 

Constrains:
-100 <= A, B, C <= 100
 */

public class TofindTheSquareRootOfQuardraticEquation {
    public static void main(String[] args) {
        
        double [] squareRoot1=FindRoots(2,3,2);
        for (double d : squareRoot1) {
            System.out.println(d);
        }
    }
    public static double[] FindRoots(int A, int B, int C)
    {
        // code here
        double sqrt_b2_4ac = Math.sqrt(((B*B)-4*(A*C)));
        System.out.println(sqrt_b2_4ac);
        double x1 = (-B*B+sqrt_b2_4ac)/2*A;
        double x2 = (-B*B-sqrt_b2_4ac)/2*A;
        return new double[]{x1,x2};
    }
}
