package evi.assignment1.assignmentjava;

public class Sum {
	private double number1;
	private double number2;

	Sum(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public double result() {
		return number1 + number2;
	}
}
