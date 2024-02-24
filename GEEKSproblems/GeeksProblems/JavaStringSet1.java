package GeeksProblems;

public class JavaStringSet1 {
    public static void main(String[] args) {
        String s = "JAVA";
        String s1= "CLASS";
        String s2=conRevstr(s,s1);
        System.out.println(s2);
    }
    static String conRevstr(String S1, String S2) {
        // code here
        String s3= S1+S2;
        char[] ch = s3.toCharArray();
        String string="";
        for (int i = ch.length-1; i >=0 ; i--) {
            string+=ch[i];
        }
        return string;
    }
}
