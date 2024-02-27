package queshtionOnNumbers;

public class SunnyNumber {
    public static void main(String[] args) {
        int number = 10;
         number+=1;
        double number2 =Math.sqrt(number);
        if (number2==(int)Math.sqrt(number)) {
            System.out.println(number+"The  Number is sunny Number");
        }else{
            System.out.println(number+"The  Number is not sunny Number");
        }
    }

}
