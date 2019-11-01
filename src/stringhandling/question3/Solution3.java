/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 02-Nov-19
 *  Time: 2:41 AM
 */
package stringhandling.question3;

public class Solution3 {
    public static void main(String[] args) {
        String string = new String("Hello");
        StringBuffer buffer = new StringBuffer("Java");
        StringBuilder builder = new StringBuilder("Programming");

        //for string capacity is always similar to length and there no specific method to get capacity of string
        System.out.println("Length and capacity of string is " + string.length());
        System.out.println();
        System.out.println("length of StringBuffer is = " + buffer.length());
        System.out.println("Capacity of StringBuffer is = " + buffer.capacity());
        System.out.println();
        System.out.println("length of StringBuilder is = " + builder.length());
        System.out.println("Capacity of StringBuilder is = " + builder.capacity());
    }
}
/*
Output:
Length and capacity of string is 5

length of StringBuffer is = 4
Capacity of StringBuffer is = 20

length of StringBuilder is = 11
Capacity of StringBuilder is = 27
 */
