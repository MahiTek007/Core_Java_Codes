package Demo;
import java.util.ArrayList;
import java.util.Collections;

public class reverse {
    public static <Intager> void main(String[] args) {
        int arr[]= {20,30,40};
        ArrayList<Integer> integers= new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            integers.add(arr[i]);
        }
        for (Integer i:integers){
            System.out.println(i);
        }

        ArrayList<Intager> list= new ArrayList<>();
        for (int i = integers.size()-1; i>=0 ; i--) {
            list.add((Intager)integers.get(i));
        }
        Collections.reverse(list);
        for (Intager i:list){
            System.out.println(i);
        }

    }
}
