package pattern;

public class Triangle3 {
    public static void main(String[] args) {
       int row=9,col=1,i=0;
       while(i<row){
           int j=0;
           while (j<col){
               System.out.print(" *");
               j++;
           }
           if (i<4){
               col++;
           }
           else{
               col--;
           }
           System.out.println();
           i++;
       }
    }
}
