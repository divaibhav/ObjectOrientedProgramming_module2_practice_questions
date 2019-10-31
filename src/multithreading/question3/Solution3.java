/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 11:37 PM
 */
package multithreading.question3;

public class Solution3 {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("Priority of main Thread = " +  currentThread.getPriority());

    }
}
