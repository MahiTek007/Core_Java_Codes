package withoutOperator;

import java.util.Scanner;

public class changeValueWithoutUsingThirdVariable { //swap two value without using third variable...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number First:\t\n");
        int num1= sc.nextInt();//1
        System.out.print("Enter Number Two:\t\n");
        int num2= sc.nextInt();//2
        int arr[]=changeValueWithoutUsingThirdVariable(num1,num2);
        int a=0, b=0;
        for (int i=0; i< arr.length;i++){
            if (i%2==0){
                a=arr[i];
            }else{
                b=arr[i];
            }
        }
        System.out.println("Num1:\t"+a);
        System.out.println("Num2:\t"+b);

    }
    private static int[] changeValueWithoutUsingThirdVariable(int num1, int num2){
        int a=num1;
        int b=num2;
        a= a+b;//3
        b=a-b;
        a=a-b;
        int arr[]={a,b};
        return arr;
    }
}
