/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 11:42 PM
 */
package multithreading.question4;

public class Solution4 {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        currentThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority of main Thread = " +  currentThread.getPriority());

    }
}
