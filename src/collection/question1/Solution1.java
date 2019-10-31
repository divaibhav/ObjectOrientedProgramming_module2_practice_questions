/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 3:29 PM
 */
/*
Create a List & Set of 10 integers and demonstrate ordered and unordered collection as well as
duplicate allowed and not allowed. Demonstrate addAll() method also.

 */
package collection.question1;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution1 {
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
        System.out.println(integers);

        // or us can use enhanced for loop
        for (Integer integer : integers) {
            // unboxing object to primitive
            int no = integer.intValue();
            System.out.println(no);
        }
        // or with ArrayList you can use normal for loop
        for (int i = 0; i < integers.size(); i++) {
            //if you forgot to un-box object to primitive compiler will auto un-box for you
            // accessing each element by index using get()method
            int no  = integers.get(i);
            System.out.println(no);

        }

        //creating HashSet to store integers, set is unordered and cannot contain duplicate
        HashSet<Integer> integerHashSet = new HashSet<>();

        //adding elements
        integerHashSet.add(100);
        integerHashSet.add(1000);
        integerHashSet.add(350);
        integerHashSet.add(150);
        integerHashSet.add(1050);
        integerHashSet.add(3500);
        integerHashSet.add(1010);
        integerHashSet.add(10010);
        integerHashSet.add(3150);
        integerHashSet.add(1001);

        //printing the set
        System.out.println(integerHashSet);
        //printing the set using enhanced for loop
        for (Integer integer : integerHashSet) {
            System.out.println(integer);
        }









    }
}
