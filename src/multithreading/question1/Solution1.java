/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 11:22 PM
 */
/*
Write a program to demonstrate multi threading.
 */
package multithreading.question1;

public class Solution1 {
    public static void main(String[] args) {
        Runnable task1 = new Task1();

        Runnable task2 = new Task2();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();

    }
}
