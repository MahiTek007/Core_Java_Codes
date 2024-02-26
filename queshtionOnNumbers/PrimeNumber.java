package queshtionOnNumbers;

public class PrimeNumber {
    // The number which is devided by 1 or itself its known as the prime number.
    public static void main(String[] args) {
        
        int num= 12;
        boolean status=false;
        if(num==1||num==0){
            System.out.println(num+" is not a prime number");
        }else{
            for (int i = 2; i < num; i++) {
                if (num%i==0) {
                    System.out.println(num+" is not a prime number");
                    status=true;
                    break;
                }
            }
            if (status==false) {
                System.out.println(num+" is  a prime");
            }
            
        }
        
    }
}
