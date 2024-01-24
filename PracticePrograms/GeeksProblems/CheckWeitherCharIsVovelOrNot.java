package GeeksProblems;

public class CheckWeitherCharIsVovelOrNot {
    public static void main(String[] args) {
        char ch='E';
        String s=isVovel(ch);
        System.out.println(s);
    }

    private static String isVovel(char ch) {
        return (ch=='a'||ch=='A')||(ch=='e'||ch=='E')||(ch=='i'||ch=='I')||(ch=='o'||ch=='O')||(ch=='u'||ch=='U')?"is vowel" :"is Not Vowel";
    }
}
