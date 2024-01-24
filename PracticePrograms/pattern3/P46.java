package pattern3;

import java.util.Scanner;

public class P46 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Number Of Rows"); int row= scanner.nextInt();
        System.out.println("Enter Number Of Columns");int col= scanner.nextInt();
        System.out.println("Enter any Number");int num= scanner.nextInt();
        pattern(row,col,num);scanner.close();
    }

    private static void pattern(int row, int col,int num) {
        int i=0;
        while (i<row){
            int j=0;int num1=num;
            while (j<col){
                System.out.print(" "+num1);
                j++;
            }
            i++;
            col++;
            num++;
            System.out.print("\n");
        }
    }
}
