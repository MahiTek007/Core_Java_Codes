package GeeksProblems;

public class Solution {
    public double[]  FindRoots(int A, int B, int C)
    {
        // code here
       double discriminant = B * B - 4 * A * C;
        double root1=0,root2=0;
        double[] x=null;
    // Check if roots are real or complex
    if(discriminant<=-1){
        root1=-1;
        x=new double[]{root1};
       
    }else if(A==1&&C==1){
        root2 = (double)(-B + Math.sqrt(discriminant)) / (2 * A);
        root1 = (double)(-B - Math.sqrt(discriminant)) / (2 * A);
        x=new double[]{root1,root2};
    } else if (discriminant >= 0) {
        // Calculate real roots
        root1 = (double)(-B + Math.sqrt(discriminant)) / (2 * A);
        root2 = (double)(-B - Math.sqrt(discriminant)) / (2 * A);
        x=new double[]{root1,root2};
    }else  {
        // Roots are complex
        System.out.println("Roots are not real.");
    } 
        
    return x;
    }
}
