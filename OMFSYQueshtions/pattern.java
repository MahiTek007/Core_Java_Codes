package OMFSYQueshtions;

public class pattern {
    public static void main(String[] args) {
        int col=1,row=4,spaces=4;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            spaces--;
            col++;
            System.out.println("");
        }
    }
}
