import java.util.Scanner;

public class VeriableDemo {
    public static void main(String[] args) {
        //Employee net salary
        // Increment salary of employee by 50%
        //increment pf amount by 5%
        //updated net salary

        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter Your Basic Salary amount:");
        double basicSalary=scanner.nextDouble();
        System.out.print("\nEnter your Incentive amount:");
        double incentive=scanner.nextDouble();
        System.out.print("\nEnter Your pf amount: ");
        double pf=scanner.nextDouble();

        double netSalary=netSalary(basicSalary,incentive);
        double incermentedSalary=incermentedSalaryBy50Percent(basicSalary);
        double incrementedPf=incrementedPf(pf);
        double updatedNetSalary=updatedNetSalary(incermentedSalary,incentive,incrementedPf);
         
        System.out.println(
            "\nNet Salary Of Employee:\t"+netSalary+
            "\nIncremented Salary of Employee:\t"+incermentedSalary+
            "\nIncrenmented Pf Of Employee:\t"+incrementedPf+
            "\nUpdated Salary Of Employee:\t"+updatedNetSalary
        );
    }

    private static double updatedNetSalary(double incermentedSalary, double incentive, double incrementedPf) {
        return incermentedSalary+incentive-incrementedPf;
    }

    private static double incrementedPf(double pf) {
        return pf+(pf*0.05);
    }

    private static double incermentedSalaryBy50Percent(double basicSalary) {
        return basicSalary+(basicSalary*0.5);
    }

    private static double netSalary(double basicSalary, double incentive) {
        double netSalary=basicSalary+incentive;
        return netSalary;
    }
    
}
