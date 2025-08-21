package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name:");
		employee.name = sc.nextLine();
		
		System.out.println("Gross Salary:");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Tax:");
		employee.tax = sc.nextDouble();
		
		System.out.println("Name: " + employee.name);
		System.out.printf("Gross Salary: " + String.format("%.2f", employee.grossSalary) + "%n");
		System.out.printf("Tax: " + String.format("%.2f", employee.tax) + "%n%n");
		
		System.out.printf("Employee: " + employee.name + ", $ " + String.format("%.2f",employee.netSalary()) + "%n%n");
		
		System.out.printf("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.printf("Updated data: " + employee.name + ", $ " + employee.grossSalary);
		
		sc.close();
	}

}
