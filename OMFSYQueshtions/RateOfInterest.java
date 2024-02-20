package OMFSYQueshtions;
import java.util.*;
public class RateOfInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();
        
        System.out.print("Enter the interest rate (in percentage): ");
        double rate = scanner.nextDouble();
        
        double simpleInterest = (principal * time * rate) / 100;
        double totalAmount = principal + simpleInterest;
        
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        
        scanner.close();
    }
}


