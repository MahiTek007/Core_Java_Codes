package queshtionOnNumbers;

public class FibonacciSeriesUsingRecursion {
    static int a=0,b=1,c=0;
    public static void main(String[] args) {
        int n=10;
        
        System.out.println(a);
        System.out.println(b);
        
        recussion(n-1);
    }

    private static void recussion(int n) {
        if (n>=0) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            recussion(n-1);
        }
    }
}
