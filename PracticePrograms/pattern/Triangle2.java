package pattern;

public class Triangle2 {
    public static void main(String[] args) {
        int row=5,col=1;
        int i=0;
        while (i<row){
            int j=0;
            while (j<col){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            col++;i++;
        }
    }
}
