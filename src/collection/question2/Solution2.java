/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 5:51 PM
 */
/*
Create a List of 10 Integer objects and try to access 15th index. Properly analysis the output.
 */
package collection.question2;

import java.util.ArrayList;

public class Solution2 {
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
        //to get the size of list
        int size = integers.size();
        System.out.println("size = " + size);
        // try to access the 15th index, will cause "java.lang.IndexOutOfBoundsException".
        int no = integers.get(15);
        System.out.println(no);

    }

}
