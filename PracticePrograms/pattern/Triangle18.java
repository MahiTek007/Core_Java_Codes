package pattern;

public class Triangle18 {
    public static void main(String[] args) {
        int row=9,space=0,col=5;
        int i=0;
        while (i<row){
            int j=0;
            while (j<col){
                System.out.print("*");
                j++;
            }
            int k=0;
            while (k<space){
                System.out.print(" ");
                k++;
            }
            int l=0;
            while (l<col){
                System.out.print("*");
                l++;
            }
            System.out.print("\n");
            if (i<4){
                space+=2;col--;
            }else{
                space-=2;col++;
            }
            i++;
        }
    }
}
