package withoutOperator;

import java.util.Scanner;

public class MultiplicationWithoutOperator {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter First Number:");
        double num1= sc.nextDouble();
        System.out.println("Enter Second Number:");
        double num2= sc.nextDouble();
        double result= multiplication( num1,num2);
        System.out.print("First_Number * Second_Number is:\t"+result);
    }

    private static double multiplication(double num1, double num2) {
        double result=0;

        for (int i=0;i<=num1;i++){
            result+=num2;
        }

        return result;
    }
}
