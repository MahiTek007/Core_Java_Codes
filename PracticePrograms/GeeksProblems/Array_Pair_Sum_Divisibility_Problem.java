package GeeksProblems;

/*
Given an array of integers nums and a number k, write a function that returns true if given array can be divided into pairs such that sum of every pair is divisible by k.

Example 1 :

Input :
nums = [9, 5, 7, 3]
k = 6
Output:
True
Explanation:
{(9, 3), (5, 7)} is a
possible solution. 9 + 3 = 12 is divisible
by 6 and 7 + 5 = 12 is also divisible by 6.
Example 2:

Input :
nums = [4, 4, 4]
k = 4
Output:
False
Explanation:
You can make 1 pair at max, leaving a single 4 unpaired.
*/
public class Array_Pair_Sum_Divisibility_Problem {
    public static void main(String[] args) {
        int [] nums= {4,4,4};
        int k=6;
        boolean solution=canPair(nums,k);
        System.out.println(solution);
    }

    private static boolean canPair(int[] nums, int k) {

        int [] pair1= new int[nums.length];
        int [] pair2= new int[nums.length];
        int sumPair1=0;
        int sumPair2=0;
        int n=nums[0];
        boolean status=false;
        for (int i = 0; i < nums.length; i++) {
            if (i % 3 == 0) {
                pair1[i]=nums[i];
            } else if (n==i) {
                status=false;
            } else{
                pair2[i]=nums[i];
            }
        }

        for (int i = 0; i < pair1.length; i++) {
            sumPair1+=pair1[i];
            sumPair2+=pair2[i];
        }
        if (sumPair1 % k == 0||sumPair2%k==0) {
            status= true;
        }
        else
            status= false;

        return status;
    }
}
