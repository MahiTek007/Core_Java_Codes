package pattern2;

public class P25 {
    public static void main(String[] args) {
        char ch='A';int row=5,col=1, i=0;
        while (i<row){
            int j=0;
            char ch1=ch;
            while (j<col){
                System.out.print(ch1+++"\t");
                j++;
            }
            System.out.print("\n\n");
            col++;i++;
        }
    }
}
