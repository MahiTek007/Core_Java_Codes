package PracticePrograms.GeeksProblems;

/**
 * Substring
 */
public class Substring {
    public static void main(String[] args) {
        System.out.println(javaSub("sssdsdxdasebdfbwjhchb", 1, 5));
    }
    static String javaSub(String S, int L, int R) {
        // code here
        return S.substring(L, R+1);
    }
    
}