/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 03-Nov-19
 *  Time: 2:17 PM
 */
package stringhandling.question5;

import java.util.Arrays;

public class Solution5 {
    public static void main(String[] args) {
        String[] strings = {"Raman", "Aman", "Vikram", "Shyam", "Bhuvan"};
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1; j++) {
                if (strings[j].compareTo(strings[j + 1]) > 0) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}
