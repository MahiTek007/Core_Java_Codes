package pattern2;

public class P29 {
    public static void main(String[] args) {
        int row=12,col=6,i=0;
        char ch='A';
        while(i<row){
            int j=0;char ch1=ch;
            while(j<col) {
                System.out.print(ch1++);
                j++;
            }
            System.out.print("\n");
            if (i<5){
                col--;
            }
            else if(i>5){
                col++;
            }
            i++;
        }
    }
}
