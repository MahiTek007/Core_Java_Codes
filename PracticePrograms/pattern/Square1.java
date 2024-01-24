package pattern;

public class Square1 {
    public static void main(String[] args) {
        int row=5,col=5,space=4;
        int i=0;
        while (i<row){
            int j=0;
            while (j<space){
                System.out.print(" ");
                j++;
            }
            int k=0;
            while (k<col){
                System.out.print("*");
                k++;
            }
            System.out.println();
            space--;
            i++;
        }
    }
}
