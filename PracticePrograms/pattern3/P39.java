package pattern3;

public class P39 {
    public static void main(String[] args) {
        int row =5,col=1,num1=5;
        for (int i=0;i<row;i++){
            int num=num1;
            for (int j=0;j<col;j++){
                System.out.print(" "+num--);
            }
            col++;
            System.out.print("\n");
        }
    }
}
