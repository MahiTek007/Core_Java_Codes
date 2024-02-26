package OMFSYQueshtions;

import java.util.Scanner;

public class SwappingTwoNumbersWithoutThirdVeriable {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number First:\t\n");
        int num1= sc.nextInt();//1
        System.out.print("Enter Number Two:\t\n");
        int num2= sc.nextInt();//2
        int a=num1;
        int b=num2;
        a= a+b;//3
        b=a-b;//2
        a=a-b;//1
        System.out.println("num1 "+a+"\n num2 "+b);
        sc.close();
    }
    
}
