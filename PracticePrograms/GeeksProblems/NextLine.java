package GeeksProblems;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine();
        System.out.println("Enter any String");
        String s2=sc.nextLine();
        System.out.println(s2 +"-----------------------------------" +s );
        System.out.print("Enter any String");
        sc.close();
    }
}
