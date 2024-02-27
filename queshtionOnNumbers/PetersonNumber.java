package queshtionOnNumbers;

public class PetersonNumber {
    public static void main(String[] args) {
        int number = 145;
        if (number == 0) {
            System.out.println("This is not a valid number");
            // Exiting the program if the number is 0
        }
        
        int temp = number;
        int sum=0;
        while (temp!=0) {
            int lastDigit=0;
            lastDigit=temp%10;
            
            int factorial=1;
            for (int i =lastDigit; i>0; i--) {
                factorial= factorial*i;
            }
            temp=temp/10;
            sum=sum+factorial;
        }
        if (sum==number) {
            System.out.println(number+" Peterson number");
        }else{
         System.out.println(number+" is not a Peterson number");
        }


    }
    
}
