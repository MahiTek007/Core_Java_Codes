package withoutOperator;

import java.util.Scanner;

public class divisionWithoutDivisionOperator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter Dividend Number: \t");
        double dividend = scanner.nextDouble();
        System.out.print("\nEnter Divisor Number: \t");
        double divisor= scanner.nextDouble();

        double result= division(dividend,divisor);

        System.out.println("quotient is:\t" + result);
    }

    private static double division(double a,double b){
        int sign=0;
        int quat= 0;

        if ((a<0 && b<0) ||(a>0 && b>0)){
            sign=1;
        }
        a= Math.abs(a);
        b=Math.abs(b);

        while (a>=b){
            a-=b;
            quat++;
        }

        return sign*quat;
    }
}
