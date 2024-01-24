package pattern;

public class Triangle1 {
    public static void main(String[] args) {
        int row=5,col=5;
        int i=0;
        while (i<row){
            int j=0;
            while (j<col){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;col--;
        }

    }
}
