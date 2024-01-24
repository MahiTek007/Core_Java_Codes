package pattern;

public class Triangle11 {
    public static void main(String[] args) {
        int row=5,col=9,space=0;
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
            System.out.print("\n");
            space++;col-=2;i++;
        }
    }
}
