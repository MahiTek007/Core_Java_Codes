package queshtionOnNumbers;

public class ArmstrongNumber {
    // Check whether the number is Armstrong number or not
    public static void main(String[] args) {
        int number = 2;
        if (number == 0) {
            System.out.println("This is not a valid number");
             // Exiting the program if the number is 0
        }
        
        int numberOfDigitsPresentInsideNumber = 0;
        int temp = number;
        
        // Counting the number of digits in the given number
        while (temp > 0) {
            temp = temp / 10;
            numberOfDigitsPresentInsideNumber++;
        }
        
        temp = number;
        int sum = 0;
        
        // Calculating the sum of digits raised to the power of the number of digits
        while (temp > 0) {
            int last = temp % 10;
            sum += Math.pow(last, numberOfDigitsPresentInsideNumber);
            temp = temp / 10;
        }

        if (sum == number) {
            System.out.println(number+" Number is Armstrong");
        } else {
            System.out.println(number+" Number is not Armstrong");
        }
    }
}
