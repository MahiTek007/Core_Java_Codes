package OMFSYQueshtions;

import java.util.Scanner;

/**
Write a Java Program to Reverse a without using an inbuilt Method /Class. 
and also check whether the string is Palindrome without using the built-in function.
 Give Input must Be at runtime.	
 
 */
public class StringReverseOrPallindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String:\t");
        String s=scanner.nextLine();
        System.out.println("Reverse String:\t"+reverseString(s));

        System.out.println(s+" String is\t"+ isPalindrome(s));
    }

    private static String isPalindrome(String s) {
    
        String str ="";
        char character []= s.toCharArray();
        int left=0;
        int right=character.length-1;
        while (left<right) {
            if (character[left]==character[right]) {
                str="Pallindrome";
            }else{
                str="Not a Pallindrome";
            }
            left++;
            right--;
        }

        //OR


        // String reverseString =reverseString(s);
        // if (reverseString.equals(s)) {
        //     str="Pallindrome";
        // }else{
        //     str="Not a Pallindrome";
        // }

        return str;
    }

    private static String reverseString(String s) {  
        String result="";
        for (int i=s.length()-1;i>=0;i--){
            result+=s.charAt(i);
        }
        return result;
    }
}