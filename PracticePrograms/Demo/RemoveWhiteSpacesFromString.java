package Demo;

/**
 * RemoveWhiteSpacesFromString
 */
public class RemoveWhiteSpacesFromString {

   public static void main(String[] args) {
    String str= "Im Mahendra Tekude";
    char character1[]= new char[str.length()];
    //String is converted into char array;
    int i0=0;
    while ( i0 < str.length()) {
        character1[i0]=str.charAt(i0++);
    }
    char chr[]= character1;
    String str2="";
    for (int i = 0; i < str.length(); i++) {
        if (chr[i]==' ') {
            continue;
        }else{
            str2 += chr[i];
        }
    }
    System.out.println(str2);
   }
}