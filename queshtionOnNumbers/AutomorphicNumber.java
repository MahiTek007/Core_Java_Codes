package queshtionOnNumbers;

public class AutomorphicNumber {

    // The square of the given number ends with the same number itself.
    // example --> 25 = > 25*25 =6_25==25

    public static void main(String[] args) {
        int number = 25;
        if (number == 0) {
            System.out.println(number + " is an automorphic number");
        } else {
            int squareOfNumber = number * number;
            int temp = number;
            int count = 0;
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
            int remainder = squareOfNumber % (int) Math.pow(10, count);
            System.out.println(remainder);
            if (remainder == number) {
                System.out.println(number + " is an Automorphic Number");
            } else {
                System.out.println(number + " is not an Automorphic Number");
            }

        }
    }
}
