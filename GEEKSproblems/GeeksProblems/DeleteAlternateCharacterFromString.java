package GeeksProblems;

public class DeleteAlternateCharacterFromString {
    public static void main(String[] args) {
        String s = "dasvhjb";
        char ch[] = s.toCharArray();
        String string="";
        for (int i = 0; i < ch.length; i++) {
            if (i%2==0){
                continue;
            }else{
                string+= String.valueOf(ch[i]);
            }
        }
        System.out.println(string);
    }
}
