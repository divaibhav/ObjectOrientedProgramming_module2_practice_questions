/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 5:59 PM
 */
package collection.question3;
//custom Book class
public class Book {
    //instance fields
    private String bookName;
    private String author;
    private long isbn;
    private double price;
    //parameterized constructor
    public Book(String bookName, String author, long isbn, double price) {
        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }
    //no-argument constructor
    public Book() {
        super();
    }
    //getter and setter
    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public long getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    //overriding toString() method

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }
}
