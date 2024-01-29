package GeeksProblems;

/**
 * 
 * For a given array of price of items,you have to calculate the average of all prices upto 2 decimal places.
 Note: Sum is printed automatically, you only need to calculate and return the average
 
  
 
 Example 1:
 
 Input:
 5
 1 2 3 4 5
 Output:
 15 3.00 
 Explanation:
 Sum of the array is 15, hence 
 average is 15/5=3.00. 
 
 Example 2:
 
 Input:
 9
 2 55 85 656 52 554 545 5 2
 Output:
 1956 217.33 
 Explanation:
 Sum of the array is 1956, hence 
 average is 1956/9= 217.33. 
  
 
 Your Task:  
 You don't need to read input or print anything. Your task is to complete the function average() which takes the array A[] and  its size N as inputs and returns the average of all the items as a String.
 
  
 
 Expected Time Complexity: O(N)
 Expected Auxiliary Space: O(1)
 
  
 
 Constraints:
 1<=N<=100
 1<=Pi<=1000
 */

public class JAvAArraySet1 {
    public static void main(String[] args) {
            String s1="2 55 85 656 52 554 545 5 2";
            String[] str=s1.split(" ");
        int n=9;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(str[i]);
        }

        String s=average(a,n);
        System.out.println(s);
    }
    static String average(int A[], int N)
    {
        int sum=0;
        for (int i = 0; i < A.length ; i++) {
            sum+=A[i];
        }

        double avg= (double)sum/N;
        System.out.println(avg);
        return sum+" "+String.format("%.2f", avg);
    }
}
