package GeeksProblems;



/*
        WRITE A JAVA PROGRAM TO REVERSE A STRING
*/



public class ReverseString2 {
    public static void main(String[] args) {
        String string = "sqsd.dqwdqed.deewde.dff.fff";
        String reverseString= reverseString(string);
        System.out.println("reverseString:\t"+reverseString);

    }

    private static String reverseString(String string) {
        String [] strArray= string.split("\\.");
        String reverseString = "";
        for (int i =strArray.length-1;i>=0 ; i--) {
            if (i== strArray.length-1||i==0){
                reverseString+=strArray[i];
            }else {
                reverseString+=".";
                reverseString += strArray[i];
            }
        }
        return reverseString;
    }
}
