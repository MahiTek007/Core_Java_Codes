package GeeksProblems.workingWithAbKeyword;

import java.util.Scanner;

/**
 * MainApp
 */
public class MainApp {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int a1=scanner.nextInt();
        System.out.println("Enter your Number: ");

        int a2=scanner.nextInt();
        B b = new B();
        b.m1(a1,a2);
        b.m2();
        scanner.close();
    }
}