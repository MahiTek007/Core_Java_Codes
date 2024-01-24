package withoutOperator;

import java.util.Scanner;

public class SubtractionWithoutUsingSubtractionOperator {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter First Number:");
        double num1= sc.nextDouble();
        System.out.println("Enter Second Number:");
        double num2= sc.nextDouble();
        double result= subtraction((int) num1, (int) num2);
        System.out.print("First_Number - Second_Number is:\t"+result);
    }

    private static double subtraction(int num1, int num2) {
        double result=0;
        if (num2==0){
            result=num1;
            return result;
        }

        result=subtraction((num1^num2),(~num1 & num2)<<1);
        return result;
    }
}
