/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 02-Nov-19
 *  Time: 1:39 AM
 */
package multithreading.question7;

public class Task1 extends Thread {
    // task is to print hello 10 times with a gap of 5 sec
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(5000);
                System.out.println("hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
