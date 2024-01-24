package pattern2;

public class P31 {
    public static void main(String[] args) {
        int row =6,col=1,sapce=5,i=0;char ch='A';
        while(i<row){
            int j=0,k=0;char ch1=ch;
            while (k<sapce){
                System.out.print(" ");
                k++;
            }
            while (j<col){
                System.out.print(" "+ch1++);
                j++;
            }
            System.out.print("\n");
            sapce--;
            col++;
            i++;
        }
    }
}
