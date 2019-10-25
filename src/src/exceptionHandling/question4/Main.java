package src.exceptionHandling.question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        //  import the Scanner class and create an object
        final Scanner scanner = new Scanner(System.in);
        //  input a String from the user
        String stringValue = scanner.nextLine();
        //  close the scanner reference
        scanner.close();
        try {
            int counter = 0;
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Array Indices Went Out Of Bounds!");
        }
    }
}
