package queshtionOnNumbers;

/**
 * FactorialUsingRecursion
 */
public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int num = 5;
        int factorial=1;
        factorial=factorialUsingRecursion(num);
        System.out.println(factorial);
    }

    private static int factorialUsingRecursion(int num) {
        // TODO Auto-generated method stub
        if (num>=1) {
           return num*factorialUsingRecursion(num-1);
        }
        return 1;
    }

    
}