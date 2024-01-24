package withoutOperator;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringWithoutBuiltInFunction {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter String input");
        String string=scanner.next();

        String reverseString=reverseString(string);
        System.out.println("Reverse String:\t"+reverseString);
    }

    private static String reverseString(String string) {
        char [] ch= new char[string.length()];
        for (int i=0;i<ch.length;i++){
            ch[i]=string.charAt(i);
        }
        char ch1[]= new char[ch.length];
        for (int i=ch.length-1;i>=0;i--){
            ch1[i]=ch[i];
        }
        System.out.println(ch1);
        String string1 ="";

        return string1;
    }
}
