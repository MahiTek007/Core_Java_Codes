package pattern3;

public class P50 {
    public static void main(String[] args) {
        int row=9,col=27,num=0;
        int i=0;
        while(i<row){
            int num1=num;
            int j=0;
            while (j<col){
                System.out.print(""+num1);
                if (j%3==0){
                    num1++;
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
