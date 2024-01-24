package pattern3;

public class P38 {
    public static void main(String[] args) {
        int row=5,col=1,num1=1;
        for (int i = 0; i<row; i++){
            int num2=num1;
            for (int j=0;j<col;j++){
                System.out.print(" "+num2++);
            }
            System.out.print("\n");
            col++;
        }
    }
}
