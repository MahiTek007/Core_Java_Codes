package LEETCodePrograms;

/**
 * TwoSum
 */
public class TwoSum {

    public static void main(String[] args) {
        int Number= 12;
        int[] nums = {2, 7, 11, 15, 1, 2, 3,6};
        int[] sumNumbers= twoSum(nums, Number);
        System.out.println("Index 1\t\tIndex 2");
        for(int i=0; i<sumNumbers.length; i++){
            System.out.print(sumNumbers[i]+"\t\t");
        }
        System.out.println();
    }
    
    public  static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(target==nums[i]+nums[j]){
                    return new int []{
                       
                        i,j
                    };
                }
            }
        } 
        return new int[]{-1,-1};
    }
}