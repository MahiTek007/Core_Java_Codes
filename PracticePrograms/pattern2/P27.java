package pattern2;

public class P27 {
    public static void main(String[] args) {
        int row = 9,col=1,i=0;
        char ch='A';
        while (i<row){
            int j=0;
            while(j<col){
                System.out.print(ch);
                j++;
            }
            System.out.print("\n");
            if(i<4) {
                col++;ch++;
            }
            else {
                col--;ch--;
            }
            i++;
        }
    }
}
