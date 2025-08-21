package entities;

public class Student {
	public String name;
	public double valueOne, valueTwo, valueThree;
	
	public double finalGrade() {
		return valueOne + valueTwo + valueThree;
	}
	
	public String valueValidation() {
		double average = 60;
		
		if(finalGrade() >= average) {
			return "\nPASS";
		} else {
			return "\nFAILED\nMISSING " + String.format("%.2f", (average - finalGrade())) + " POINTS";
		}
	}
}
