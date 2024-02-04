package Demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * CheackTheUSerDefineSubstringPresentOrNot
 */
public class CheackTheUSerDefineSubstringPresentOrNot {
     public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String string1 ="MADAM";
       ArrayList<String> string3= new ArrayList<>();
        for (int i=0;i<=string1.length();i++){
            for (int j=i+1;j<=string1.length();j++){
                string3.add(string1.substring(i,j));
            }
        }
        for (String string : string3) {
            System.out.println(string);
        }
        System.out.println("Enter the string");
        String string2= scanner.next();
        if (string3.contains(string2.toUpperCase())) {
            System.out.println("Substring is present");
        }else{
            System.out.println("Substring is not present");
        }
        // for (int i = 0; i < string3.size(); i++) {
        //     if (string3.get(i).equals(string2)) {
        //         System.out.println("Substring is present");
        //     }
        // }
     }
}