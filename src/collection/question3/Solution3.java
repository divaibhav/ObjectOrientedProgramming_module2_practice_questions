/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 5:59 PM
 */
/*
Create a List of 10 Book objects, where Book is a user defined or custom class.
Book class contains following field String bookName, String author, long isbn, & double price.
Book class must be properly encapsulated and must implement data hiding.
Book class contains parameterized constructors and no-argument constructor.
Book class must override String toString() of Object class to represent Book object as string
while printing. Kindly sort the list of book by price.
 */
package collection.question3;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        //created list of books
        ArrayList<Book> bookList = new ArrayList<>();
        // taking user input by using Scanner class
        Scanner sc = new Scanner(System.in);
        // to add 10 books
        for (int i = 0; i < 10; i++) {
            //reading input from user
            String bookName = sc.nextLine();
            String author = sc.nextLine();
            long isbn = sc.nextLong();
            double price = sc.nextDouble();
            sc.nextLine();
            // creating book object using parameterized constructor
            Book book = new Book(bookName,author,isbn,price);
            //adding bookmto list
            bookList.add(book);
        }
        //printing bookList using enhanced for loop
        System.out.println("books");
        for (Book book : bookList) {
            System.out.println(book);

        }

        //sorting books by using Collections.sort() method
        Collections.sort(bookList);

        System.out.println("sorted book");
        for (Book book : bookList) {
            System.out.println(book);

        }


    }
}
