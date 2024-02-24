package GeeksProblems;

import java.util.ArrayList;
import java.util.List;

public class SwithCase {
    public static void main(String[] args) {


        List<Double> arr = new ArrayList<>();
        arr.add(5.0);arr.add(10.0);
        int choice =2;
        System.out.println(switchCase(choice,arr));
    }
    static double switchCase(int choice, List<Double> arr){
        // code here
        double area=0;
        switch (choice){
            case 1:
                area=Math.PI*Math.pow(arr.get(0),2);break;
            case 2:
                area = arr.get(0)* arr.get(1);break;
            default:
                area=-1;
        }
        return area;
    }
}
