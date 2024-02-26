package queshtionOnNumbers;

/**
 * FibonacciSeries
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 10;
        int a=0;
        int b=1;
        int c=0;
        System.out.print(a+"\n"+b);
        for (int i = 0; i < n; i++) {
            c=a+b;
            System.out.print("\n"+c);
            a=b; 
            b=c;
            
        }
    }
}