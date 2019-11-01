/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 02-Nov-19
 *  Time: 1:38 AM
 */
package multithreading.question7;

public class Solution7 {
    public static void main(String[] args) {
        Runnable task2 = new Task2();
        Thread t1 = new Task1();

        Thread t2 = new Thread(task2);

        Thread currentThread = Thread.currentThread();
        t1.start();
        t2.start();
        while(t2.isAlive()){


            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("State of current thread " + currentThread.getState());
            System.out.println("State of t1 thread " + t1.getState());
            System.out.println("State of t2 thread " + t2.getState());
        }
    }
}
