/*
 *    Created by IntelliJ IDEA.
 *    User: divyanshbhardwaj
 *    Date: 10/24/19
 *    Time: 3:02 PM
 */

package src.exceptionHandling.question1;

import java.util.Scanner;

/**
 * MyMain class to perform the sum of two user given values
 */
public class MyMain {
	public static void main(String[] args) throws MyFirstException {
		final Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		int sumOfTwoUserValues = firstNumber + secondNumber;
		if (sumOfTwoUserValues < 150) {
			throw new MyFirstException("Custom Exception Occurred");
		} else {
			System.out.println("The sum of " + firstNumber + " + " + secondNumber + " = " + sumOfTwoUserValues);
		}
	}
}