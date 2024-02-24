package GeeksProblems;
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {

        int[] v1={3,2,2,7,8,5,6,4};

        int[] v2={3,4,2,2,4,5};
        ArrayList<Integer> common_element = common_element(v1, v2);
        for (Integer integers:common_element){
            System.out.print(integers);
        }
    }
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        //Your code here
        Arrays.sort(v1);
        Arrays.sort(v2);
        ArrayList <Integer> integerArrayList = new ArrayList<>();
        int i = 0,j=0;
        while (i<v1.length&&j<v2.length){
            if (v1[i]==v2[j]){
                integerArrayList.add(v1[i]);
                i++;j++;
            } else if (v1[i]<v2[j]) {
                i++;
            }else{
                j++;
            }
        }
        return integerArrayList;
    }
}
