package OMFSYQueshtions;

import java.util.Scanner;
/* Write a Java Program For 
			case I)   Input: --> java 
				  Output:--> jv
			case II)  Input: --> baba 
				  Output:--> Null/NAN
			case III) Input: --> abc 
				  Output:--> abc
Give Input must Be at runtime.
 */

public class ProgramOnREmoveRepeatedCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String:\t");
        String s=scanner.nextLine();
        String s2= removeRepeaterdCharactesFromString(s);
        System.out.println("Output String:\t"+s2);
        scanner.close();
    }

    private static String removeRepeaterdCharactesFromString(String s) {
        char[] characters = s.toCharArray();   //[ j,a,v,a]   [ j,a,v,a]
        String result = ""; // 
        char ch;
        for (int i = 0; i < characters.length; i++) {               //i==0 ,1,2,3,
            ch = characters[i];
            int count = 0;
            for (int j = 0; j < characters.length; j++) {       //j==0 , j==1 , j==2 , j==3
                if (ch == characters[j]) {  
                    count+=1;
                } 
            }
            if (count == 1) {
                result += ch;
            }
            
        }
        
       if (result.isEmpty()) {
        return "Null/ Nan";
       }else{
        return result;
       }
    }
}
