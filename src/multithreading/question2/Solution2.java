/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 11:29 PM
 */
/*
Create two threads t1 & t2, t1 will print all the even numbers from 0 to 100 and t2 will print all the odd numbers from 100 to 0. Both threads will goto sleep for 1 sec after printing one number.
 */
package multithreading.question2;

import multithreading.question2.Task1;
import multithreading.question2.Task2;

public class Solution2 {
    public static void main(String[] args) {
        Runnable task1 = new Task1();

        Runnable task2 = new Task2();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
    }
}
