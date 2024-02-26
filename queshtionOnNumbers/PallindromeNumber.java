package queshtionOnNumbers;

public class PallindromeNumber {
    public static void main(String[] args) {
            int num=121;
            int num2 =num;
            int sum=0;
            int temp=0;
            while(num>0){
                temp=num%10;
                sum=sum*10+temp;
                num=num/10;
            }
            if(num2==sum){
                System.out.println(num2+" is a pallindrome number");
            }else{
                System.out.println(num2+" is not a pallindrome number");
            }


    }
}
