package trickyCodes;

public class TrickyCode4 {
    // write a program to print numbers from 1 to 10 without using loops;
    public static void main(String[] args) {
        int i =1;
        numbers(i);
    }

    private static void numbers(int i) {
        System.out.println(i);
        i++;
        if (i<=10){
            numbers(i);
        }

    }
}
