/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 03-Nov-19
 *  Time: 4:53 PM
 */
package wrapper.question6;

public class Solution6 {
    public static void main(String[] args) {
        Integer objInteger1 = Integer.valueOf(100);
        Integer objInteger2 = Integer.valueOf(200);
        if (Integer.compare(objInteger1, objInteger2) == -1) {
            System.out.println(objInteger1);
        } else if (Integer.compare(objInteger1, objInteger2) == 1) {
            System.out.println(objInteger2);
        } else {
            System.out.println("equal");
        }
        Double objDouble1 = Double.valueOf(12.34);
        Double objDouble2 = Double.valueOf(123.43);
        if (Double.compare(objDouble1, objDouble2) == -1) {
            System.out.println(objDouble1);
        } else if (Double.compare(objDouble1, objDouble2) == 1) {
            System.out.println(objDouble2);
        } else {
            System.out.println("equal");
        }
    }
}
