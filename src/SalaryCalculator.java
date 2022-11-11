import java.util.Scanner;

public class SalaryCalculator {
    // Input 1: number of hours the employee works per week
    // Input 2: amount of money the employee makes per hour
    // Output: employee's gross yearly salary
    //Bonus: can you add an input tht accounts for the vacation days?
    // The employee does not get paid for vacation days
    //One vacation day = eight hours of work

    public static double salaryCalculator (double hoursPerWeek, double amountPerHour, int vacationDays) {
        if(hoursPerWeek < 0) {
            return-1;
        }
        if(amountPerHour < 0) {
            return -1;
        }
        double weeklyPaycheck = hoursPerWeek *amountPerHour;
        double unpaidTime = vacationDays* amountPerHour *8;
        return (weeklyPaycheck *52) - unpaidTime;
    }

    public static void main(String[] args) {
        double totalSalary = salaryCalculator(40, 40, 0);
        System.out.println("The employee's gross yearly salary is " + totalSalary );

        //        System.out.println("Enter the number of hours worked per week: ");
//        Scanner hoursPerWeek = new Scanner(System.in);
//        hoursPerWeek.nextDouble();
//
//        System.out.println("Enter the amount of money made per hour: ");
//        Scanner payPerHour = new Scanner(System.in);
//        payPerHour.nextDouble();
    }
}