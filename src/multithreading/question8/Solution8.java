/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 11:44 PM
 */
/*
Create 2 threads t1 and t2 by extending Thread class and print hello and world respectively by t1 and t2. Create 2 more threads t3 & t4 by implementing Runnable interface to print java & programming respectively by t3 & t4.
 */
package multithreading.question8;

public class Solution8 {
    public static void main(String[] args) {

        Thread t1 = new Task1();
        Thread t2 = new Task2();
        Runnable task3 = new Task3();
        Runnable task4 = new Task4();
        Thread t3 = new Thread(task3);
        Thread t4 = new Thread(task4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
