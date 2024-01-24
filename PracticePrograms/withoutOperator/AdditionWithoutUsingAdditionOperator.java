package withoutOperator;

import java.util.Scanner;

public class AdditionWithoutUsingAdditionOperator {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter First Number:");
        double num1= sc.nextDouble();
        System.out.println("Enter Second Number:");
        double num2= sc.nextDouble();
        double result= addition(num1,num2);
        System.out.print("First Number + Second Number %d"+result);
    }

    private static double addition(double num1, double num2) {
        double result = 0;
        for (int i = 0; i < num2; i++) {
            num1++;
        }
//        int i=0;
//
//        while(i<num2){
//            num1++;
//        }
        result = num1;
        return result;
    }
}
