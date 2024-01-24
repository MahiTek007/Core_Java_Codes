package pattern2;

public class P26 {
    public static void main(String[] args) {
        int row =5,col=1,i=0;char ch='A';
        while (i<row){
            int j=0;
            while (j<col){
                System.out.print(ch);
                j++;
            }
            System.out.println();
            col++;
            ch++;
            i++;
        }
    }
}
