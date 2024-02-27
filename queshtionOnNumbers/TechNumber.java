package queshtionOnNumbers;

public class TechNumber {
    public static void main(String[] args) {
        int number=2025;

        int temp =number;
        int count=0;
        while (temp != 0) {
            temp= temp/10;
            count++;
        }
        temp=number;
        int left=0,right=0,sum=0;
        
        if (count%2==0) {
           left = temp% (int)Math.pow(10, count/2);
           right= temp / (int)Math.pow(10, count/2);
            sum=left + right;
        
            int sqrOfSum= (int)Math.pow(sum, 2);
            if (sqrOfSum==number) {
                System.out.println(number+" is Tech Number");
            }else{
                System.out.println(number+" is not Tech Number");
            }
        }else{
            System.out.println(number+" is not Tech Number");
        }
    }
}
