package queshtionOnNumbers;

import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        System.out.println(randomNumber);
        System.out.println(Math.round(Math.random()*100));

        long min=10000000;
        long max=999999999;
        System.out.println(Math.round(Math.random()*(max-min)+min));
    }
}
