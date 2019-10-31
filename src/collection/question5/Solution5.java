/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 10:46 PM
 */
package collection.question5;

import java.util.ArrayList;

public class Solution5 {
    public static void main(String[] args) {
        //creating a ArrayList of 10 Integers
        ArrayList<Integer> integers = new ArrayList<>();
        // adding elements in ArrayList by using add(Element e) method
        // by passing primitive value, which will be converted to object by autoboxing
        integers.add(20);
        //creating Integer object to represent primitive value 40 by using valueOf() method
        //using boxing
        Integer obj = Integer.valueOf(40);
        //adding obj to list
        integers.add(obj);

        // likewise added 8 more elements in list
        integers.add(60);
        integers.add(70);
        integers.add(50);
        integers.add(30);
        integers.add(250);
        integers.add(3);
        integers.add(2);
        integers.add(10);
        //printing the list
        System.out.println("printing list");
        System.out.println(integers);
        int evenCount = 0;

        for (Integer integer : integers) {
            if(integer.intValue() % 2 ==0){
                evenCount++;
            }
        }
        int oddCount = integers.size()  - evenCount;
        System.out.println("odd count =  " + oddCount);
    }
}
