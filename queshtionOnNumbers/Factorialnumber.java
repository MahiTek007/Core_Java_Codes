package queshtionOnNumbers;

/**
 * Factorialnumber
 */
public class Factorialnumber {
    public static void main(String[] args) {
        int number = 5;
        int factorial =1;
        for (int i =number; i>=1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}