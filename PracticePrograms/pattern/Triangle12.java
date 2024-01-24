package pattern;

public class Triangle12 {
    public static void main(String[] args) {
        int row=9,col=5,space=0;
        int i=0;
        while(i<row){
            int j=0,k=0;
            while(j<space){
                System.out.print(" ");
                j++;
            }
            while (k<col){
                System.out.print("*");
                k++;
            }
            System.out.println();
            if (i<4){
                space++;col--;
            }else {
                space--;col++;
            }
            i++;
        }
    }
}
