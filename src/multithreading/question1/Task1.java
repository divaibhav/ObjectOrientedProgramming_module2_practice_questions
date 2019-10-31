/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 11:23 PM
 */
package multithreading.question1;
// creating a task for thread, which will be executed by separate thread
public class Task1 implements Runnable {

    @Override
    public void run() {
        System.out.println("hello");

    }
}
