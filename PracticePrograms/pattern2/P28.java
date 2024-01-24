package pattern2;

public class P28 {
    public static void main(String[] args) {
        int row=9,col=1,i=0;
        char ch ='A';
        while(i<row){
            int j=0;char ch1=ch;
            while(j<col){
                System.out.print(ch1++);
                j++;
            }
            System.out.print("\n");
            if(i<4){
                col++;
            }else {
                col--;
            }
            i++;
        }
    }
}
