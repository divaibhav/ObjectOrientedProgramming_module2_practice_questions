/*
 *    Created by IntelliJ IDEA.
 *    User: divyanshbhardwaj
 *    Date: 10/24/19
 *    Time: 3:22 PM
 */

package src.exceptionHandling.question1;

public class MyFirstException extends Exception {

	/**
	 * Parametrized constructor for class
	 * calls the super class' constructor and passes in the 'message'
	 */
	public MyFirstException(String message) {
		super(message);
	}
}