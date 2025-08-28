package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of employee:");
		Integer numberEmployee = sc.nextInt();
		
		List<Employee> employeeList = new ArrayList<>();
		
		for(int i = 0; i < numberEmployee; i++) {
			System.out.printf(
								"\nEmployee #"
								+ (i + 1)
								+ " data:"
							);
			
			System.out.println("\nOutsourced (y/n)?");
			char response = sc.next().charAt(0);
			
			System.out.println("Name");
			sc.nextLine();
			String name = sc.nextLine();
				
			System.out.println("Hours");
			Integer hours = sc.nextInt();
				
			System.out.println("Value per hour");
			Double valuePerHour = sc.nextDouble();
			
			if(response == 'y') {
				System.out.println("Additional charge:");
				Double additionalCharge = sc.nextDouble();
				employeeList.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				employeeList.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("\nPAYMENTS:");
		for(Employee e : employeeList) {
			System.out.println(e.getName()
								+ " - $ "
								+ String.format("%.2f", e.payment())
							);
		}
		
		sc.close();

	}

}
