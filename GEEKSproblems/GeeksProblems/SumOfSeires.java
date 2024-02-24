package GeeksProblems;

import java.util.Scanner;

public class SumOfSeires {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Number");
        long N=scanner.nextLong();
        System.out.println(seriesSum(N));
        scanner.close();
    }

    private static long seriesSum(long n) {
//        long sum=0;
//        for (int i = 0; i <n ; i++) {
//            sum+=i;
//        }
//        return sum;
        return  (long)n * (n + 1) / 2;
    }
}
