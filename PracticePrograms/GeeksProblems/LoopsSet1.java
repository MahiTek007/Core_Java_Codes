package GeeksProblems;

import java.util.ArrayList;

/**
 * LoopsSet1
 * 
 * For a given N, return an arraylist containing the sum of even and odd integers of the first N natural numbers.

 Example 1:
 
 Input:
 N = 1
 Output:
 0 1
 Explanation:
 Natural numbers less than 1 are only 1.
 So the sum of even number = 0.
 and the sum of odd number = 1.
 Example 2:
 
 Input:
 N = 6
 Output:
 12 9  
 Explanation:
 Natural numbers less than 6 are 
 1 2 3 4 5 6
 So the sum of even number = 2 + 4 + 6 = 12.
 and the sum of odd number = 1 + 3 + 5 = 9.
 Your Task:  
 You don't need to read input or print anything. Your task is to complete the function getSum() which takes an integer N as input parameter and return an arraylist containing the sum of even and odd natural number less than equal to N.
 
 Expected Time Complexity: O(N)
 Expected Auxiliary Space: O(1)
 
 Constraints: 
 1<= N <=104
 
 
 */
public class LoopsSet1 {
    public static void main(String[] args) {
        int i=6;
        System.out.println(getSum(i));
    }
    static ArrayList<Integer> getSum(int N){
        // code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sumOfEvenNumber=0,sumOfOddNumber=0;
        
        for (int i = 0; i < N; i++) {
            if (i%2!=0) {
                sumOfEvenNumber+=(i+1);
            }else{
                sumOfOddNumber+=(i+1);
            }
        }
        arrayList.add(sumOfEvenNumber);
        arrayList.add(sumOfOddNumber);

        return arrayList;
    }
}