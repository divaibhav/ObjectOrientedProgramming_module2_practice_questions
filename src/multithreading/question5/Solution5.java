/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 02-Nov-19
 *  Time: 1:24 AM
 */
package multithreading.question5;

public class Solution5 {
    public static void main(String[] args) {
        Thread t = new Thread();
        //setting priority to 100
        t.setPriority(100); //no error at compilation, but generate exception IllegalArgumentException

    }
}
/*
Output:
Exception in thread "main" java.lang.IllegalArgumentException
	at java.base/java.lang.Thread.setPriority(Thread.java:1142)
	at multithreading.question5.Solution5.main(Solution5.java:13)

 */