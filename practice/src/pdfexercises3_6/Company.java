package pdfexercises3_6;

import java.util.Scanner;

public abstract class Company {
    public int companyId;
    public String companyName;
    public float wagesPerHour;
    public int no_of_weeks;

    Company() {
        companyId = 1;
        companyName = "ABC";
        wagesPerHour = 10;
        no_of_weeks = 40;
    }

    abstract void wagesCalculation();

}

class Employee extends Company {
    public int employeeId;
    public String employeeName;
    public int total_duration;

    Employee() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id: ");
        employeeId = sc.nextInt();
        System.out.println("Enter employee name: ");
        employeeName = sc.next();
        System.out.println("Enter total duration: ");
        total_duration = sc.nextInt();
        sc.close();
    }
    @Override
    public void wagesCalculation() {
        float wages = wagesPerHour * no_of_weeks * total_duration;
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Wages: " + wages);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.wagesCalculation();
    }
}

