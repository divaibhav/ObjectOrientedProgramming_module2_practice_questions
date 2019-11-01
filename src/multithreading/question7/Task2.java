/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 02-Nov-19
 *  Time: 1:39 AM
 */
package multithreading.question7;

import java.util.Scanner;

public class Task2 implements Runnable {
    // task is to print world 10 times with a gap of 2 sec
    @Override
    public void run() {
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < 10 ; i++) {
            try {
                Thread.sleep(2000);
                System.out.print("world -> ");
                sc.nextLine();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
