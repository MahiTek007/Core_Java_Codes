package pattern;

public class Triangle7 {
    public static void main(String[] args) {
    int row =9,col=1,space=4;
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
        if (i<4) {
            space--;
            col++;
        }else if (i>3){
            space++;
            col--;
        }
        i++;
    }
    }
}
