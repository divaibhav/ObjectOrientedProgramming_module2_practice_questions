/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 02-Nov-19
 *  Time: 2:31 AM
 */
package stringhandling.question1;

public class Solution1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hello");
        StringBuffer buffer = new StringBuffer("programming");

        // there is no concat method either in StringBuilder or in StringBUffer,
        // we can use append or String class concat method

        //using String class concat() mehtod
        String result = builder.toString().concat(buffer.toString());

        System.out.println(result);
    }
}
/*
Output:
helloprogramming
 */
