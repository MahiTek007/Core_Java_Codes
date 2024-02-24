package GeeksProblems;

import java.util.Scanner;

/**
 * DataTypesWithMethod
 */
public class DataTypesWithMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(javaIntType(sc));
        System.out.println(javaStringType(sc));
        System.out.println(javaFloatType(sc));
    }

     static int javaIntType(Scanner sc) {
        // code here
        return sc.nextInt();
    }
    
    static String javaStringType(Scanner sc) {
        // code here
        return sc.next();

    }
    
    static float javaFloatType(Scanner sc) {
        // code here
        return sc.nextFloat();
    }
}