package GeeksProblems;

import java.util.Scanner;

public class ELSEIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1:\t");int num1= scanner.nextInt();
        System.out.print("Enter Number2:\t");int num2= scanner.nextInt();
        String s=checkEquality(num1,num2);
        System.out.println(num1+" is "+s+" than "+num2);
        scanner.close();
    }

    private static String checkEquality(int num1, int num2) {
//        return num1>num2?"greater":num1==num2?"equal":"smallest";
        String compairison=null;
        if (num1>num2) {
            compairison = "greater";
        } else if (num1== num2) {
            compairison="equal";
        }else{
            compairison="lesser";
        }
        return compairison;
    }
}
