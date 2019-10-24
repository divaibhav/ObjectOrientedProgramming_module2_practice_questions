/*
 *    Created by IntelliJ IDEA.
 *    User: divyanshbhardwaj
 *    Date: 10/24/19
 *    Time: 3:02 PM
 */

package src.exceptionHandling;

import java.util.Scanner;

/**
 * MyMain class to perform the sum of two user given values
 */
class MyMain {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
	}
}

class MyFirstException extends Exception {

	/**
	 * Parametrized constructor for class
	 * calls the super class' constructor and passes in the 'message'
	 */
	public MyFirstException(String message) {
		super(message);
	}
}