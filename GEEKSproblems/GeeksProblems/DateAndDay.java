package GeeksProblems;

import java.util.Calendar;
import java.util.Scanner;

public class DateAndDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date: ");
        String date = sc.next();
        System.out.println("Enter Month: ");
        int month = sc.nextInt();
        System.out.println("Enter Year: ");
        int year = sc.nextInt();
        String day=findDay(year, month, year);
        System.out.println("Day: "+day+"Date: " + date + " Month: " + month + " Year: " + year);

    }
    static String findDay(int Day, int Month, int Year){
        Calendar calendar = Calendar.getInstance();

        calendar.set(Day, Month, Year);

        int dayOfWeek = calendar.get(calendar.DAY_OF_WEEK_IN_MONTH);

        String workdays [] ={"","SUNDAY","TUESDAY","WEDNESDAY","THURSDAY", "FRIDAY","SATURDAY"};
        return workdays[dayOfWeek];
        //Code Here
    }
}
