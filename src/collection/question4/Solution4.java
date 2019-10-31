/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 10:26 PM
 */
package collection.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        ArrayList<Student> studentList= new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            Student s = new Student();
            s.setName(sc.nextLine());
            s.setRollNo(sc.nextInt());
            s.setCpi(sc.nextDouble());
            sc.nextLine();
            studentList.add(s);
        }
        System.out.println("printing student list");
        for (Student student : studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList);
        System.out.println("sorted list");
        for (Student student : studentList) {
            System.out.println(student);
        }

        for (Student student : studentList){
            if(student.getName().startsWith("A") || student.getName().startsWith("J")){
                studentList.remove(student);
            }
        }
        System.out.println("printing student list");
        for (Student student : studentList) {
            System.out.println(student);
        }



    }
}
