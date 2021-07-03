package evi.assignment1.assignmentjava;

import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) throws Exception {

		Double number1 = null;
		Double number2 = null;
		char operator = 0;

		// Scanner class to input number
		Scanner input = new Scanner(System.in);

		// Users can enter numbers with this
		do {
			try {
				System.out.println("Enter number 1 :");
				number1 = input.nextDouble();
			} catch (Exception e) {
				System.out.println("Invalid number 1 \n");
				input.nextLine();
			}
			if (number1 != null) {
				break;
			}
		} while (true);

		// User can choose operator with this
		do {
			System.out.println("Choose an operator: +, -, *, or /");
			operator = input.next().charAt(0);
			if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
				break;
			} else
				System.out.println("Invalid operator \n");
		} while (true);

		// ask users to enter operator
		do {
			try {
				System.out.println("Enter number 2");
				number2 = input.nextDouble();
			} catch (Exception e) {
				System.out.println("Invalid number 2 \n");
				input.nextLine();
			}
			if (number2 != null) {
				break;
			}
		} while (true);

		// create object from another class
		Sum sum = new Sum(number1, number2);
		Subs subs = new Subs(number1, number2);
		Multi multi = new Multi(number1, number2);
		Div div = new Div(number1, number2);

		switch (operator) {

		// performs addition between numbers
		case '+':
			System.out.println(sum.result());
			break;

		// performs subtraction between numbers
		case '-':
			System.out.println(subs.result());
			break;

		// performs multiplication between numbers
		case '*':
			System.out.println(multi.result());
			break;

		// performs division between numbers
		case '/':
			System.out.println(div.result());
			break;

		default:
			break;
		}

		input.close();
	}

}