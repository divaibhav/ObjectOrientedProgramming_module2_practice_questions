/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 02-Nov-19
 *  Time: 2:36 AM
 */
package stringhandling.question2;

public class Solution2 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("hello programming");
        String result = buffer.substring(5);
        System.out.println(result);
    }
}
/*
Output:
 programming
 */