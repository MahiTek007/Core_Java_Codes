package GeeksProblems;
import java.util.Arrays;

/**
 * AnagramString
 */
public class AnagramString {
    public static void main(String[] args) {
        String string1 = "gksee";
        String string2 = "geeks";
        int i=areAnagram(string1, string2);
        System.out.println(i);
    }
    static int areAnagram(String S1, String S2) {
        // code here
        int integer =0;
        if (S1.length()!=S2.length()) {
            return integer;
        }

         char  s1 []= S1.toCharArray();
         char  s2 []= S2.toCharArray();
         sort(s1);
         sort(s2);
         
        if (Arrays.equals(s1, s2)) {
            integer =1;
        }else{
            integer =0;
        }
        return integer;
    }
    static void sort(char[] s1){
        for (int i = 0; i < s1.length-1; i++) {
            for (int j = 0; j <s1.length-i-1; j++) {
                
                if (s1[j]>s1[j+1]) {
                    //swapping 
                    char temp = s1[j];
                    s1[j] = s1[j+1];
                    s1[j+1] = temp;
                }
            }
        }      
    }
}