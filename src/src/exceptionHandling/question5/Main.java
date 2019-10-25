package src.exceptionHandling.question5;

public class Main {
    public static void main(String[] args) {
        //  create an reference variable of Obejct-type that stores the object of a Double-type
        Object object = 3.0;
        //  try to print the object as an Integer-type value instead of a Double-type value
        System.out.println(Integer.valueOf((String) object));
    }
}
