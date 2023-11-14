import java.util.*;
public class MethodDemo1 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the radius of Circle to calculate area of circle:");
        double radius=scanner.nextDouble();
        System.out.print("\nEnter length of side to calculate area of square");
        double length=scanner.nextDouble();
        double area[]= area(radius,length);
        System.out.println(area.toString());
    }

    private static double[] area(double radius, double length) {
        double areaOfCircle= 3.142*(radius*radius);
        double areaOfSuare= length*length;
        double area[] =new double[2];
        
            area[0]=areaOfCircle;
            area[1]=areaOfSuare;
        
        return area;
    }
}