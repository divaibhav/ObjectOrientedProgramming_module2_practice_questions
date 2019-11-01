/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 02-Nov-19
 *  Time: 1:29 AM
 */
package multithreading.question6;

public class Solution6 {
    public static void main(String[] args) {
        //printing number from 1 to 10 with gap of 2 sec using Thread.sleep() method
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
            try {
                //sleep() will generate an checked exception InterruptedException
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
