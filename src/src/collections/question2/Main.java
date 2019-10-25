package src.collections.question2;

/**
 * This class will input a command line argument from the user and will display array index out of bounds
 */
public class Main {
    public static void main(String[] args) {
        // check if the user entered any command line argument
        if (args.length < 0) {
            // the user did not enter any command line arguments
            System.out.println("No command line argument given!");
        } else {
            int sizeOfArray = Integer.parseInt(args[0]);
        }
    }
}
