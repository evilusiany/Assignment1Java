package evi.assignment1.assignmentjava;

public class Subs {
	private double number1;
	private double number2;

	Subs(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public double result() {
		return number1 - number2;
	}
}
