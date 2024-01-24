package pattern3;

public class P40 {
    public static void main(String[] args) {
        int row=5,col=5,num=1;
        int i=0;
        while (i<row){
            int j=0;
            int num1=num;
            while (j<col){
                System.out.print(" "+num1++);
                j++;
            }
            System.out.print("\n");
            col--;
            i++;
        }

    }
}
