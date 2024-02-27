package queshtionOnNumbers;


public class ReverseNumber {
    public static void main(String[] args) {
        int number=12451;
        int reverseNumber=0;
        int temp=0;
        temp=number;
        while(temp!=0){
            int reminder = temp%10;
            reverseNumber=reverseNumber*10+reminder;
            temp=temp/10;
        }
        System.out.println(reverseNumber);
    }
}
