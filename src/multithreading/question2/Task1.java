/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 11:23 PM
 */
package multithreading.question2;
// creating a task for thread, which will be executed by separate thread
public class Task1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
            if(i % 2  == 0){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
