package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the student's name");
		student.name = sc.nextLine();
		
		System.out.println("Enter the notes in sequence:");
		student.valueOne = sc.nextDouble();
		student.valueTwo = sc.nextDouble();
		student.valueThree = sc.nextDouble();
		
		System.out.printf("FINAL GRANDE: " + String.format("%.2f", student.finalGrade()));
		System.out.println(student.valueValidation());
		
		sc.close();
	}

}
