package withoutOperator;

import java.util.Scanner;

public class CheckEVEN_ODD_WithoutModulusOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :\t");
        int i = sc.nextInt();
        String checkEvenOdd=checkEvenOdd(i);
        System.out.println("Number is:\t"+checkEvenOdd);
    }

    private static String checkEvenOdd(int i) {
        String str= null;
        int result=0;

        result=i-2*(i/2);

        if (result==0){
            str="Number is even";
        }else{
            str="Number is Odd";
        }
        return str;
    }
}
