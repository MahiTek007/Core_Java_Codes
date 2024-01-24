package pattern3;

public class P41 {
    public static void main(String[] args) {
        int row=10,col=5,num=1,space=1;
        int i=0;
        while (i<row){
            int num1=num,j=0,k=0;
            while (j<space){
                System.out.print(" ");
                j++;
            }
            while (k<col){
                System.out.print(" "+num1++);
                k++;
            }
            System.out.print("\n");

            if(i<4) {
                col--;
                num++;
                space++;
            }else if(i>4){
                col++;
                num--;
                space--;
            }

            i++;
        }
    }
}
