/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 10:51 PM
 */
package generic.question2;

public class Solution2 {
    public static void main(String[] args) {
        Integer[] arr = {57,61,41,56,47,71,64,43,66,4,54,30};
        Solution2 obj= new Solution2();
        System.out.println("sum = " + obj.sum(arr));

    }
    public <T extends Number>double sum(T[] arr){
        double response = 0.0;
        for (T t : arr) {
            response = response + t.doubleValue();
        }
        return response;

    }
}
