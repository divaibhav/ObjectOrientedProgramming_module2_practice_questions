# OOPS_Module2_practice_questions

### Exception Handling
1. Define an custom exception (i.e. user defined exception) class called "MyFirstException". This class contains a parameterized
constructor which accept one argument String message. Whenever this exception arise will print "Custom Exception Occurred".
Create another class called MyMain. This class contains main method, to perform sum of two user given values by using Scanner class.
If the sum is less than 150 throw user defined exception or else display sum.

        input
            a = 30;
            b = 40;
            sum = a + b;
            as sum is 70 .. then 
            
            output
            Custom Exception Occurred
            
2. Write a program to demonstrate exception handling for ArrayIndexOutOfBoundsException, using command line arguments.
3. Write a program to accept numbers from user and handle all the possible unchecked exception that can occur.
4. Write a program to print a given string character by character and handle StringIndexOutOfBoundsException.
5. Write a program to handle ClassCastException, by doing explicit casting of Object to Integer.

### String, StringBuilder, StringBuffer
1. Write a program to concatenate StringBuilder & StringBuffer objects.
2. Write a program to get a substring of a StringBuffer.
3. Write a program to display the length and capacity of String, StringBuilder and StringBuffer.
4. Write a program to check whether two given strings contains same set of characters as well as having same length.

        input
        String s1 = "amar";
        String s2= "rama";
        
        output : Both contains same characters
        
5. Write a program to lexicographically arrange the given strings "Raman" , "Aman" , "Vikram" , "Shyam" and "Bhuvan".

### Wrapper Classes (Integer, Byte, Short, Long, Float, Double, Character, Boolean)
1. Create objects of all the wrapper classes and print then on console, with using constructor.
2. Write a program to demonstrate boxing and un-boxing.
3. Write a program to demonstrate autoboxing and unboxing.
4. Create an array of 5 integers and print sum and average by creating Integer sum(Integer[] arr) and 
Double average(Integer sum, Integer numberOfElements). Do casting as required for getting proper result;
5. Write a program to print ASCII values of Character objects using wrapper class.
6. Write a program to print the smaller of the two given Integer, Double and Character Objects.

### Multithreading
1. Write a program to demonstrate multi threading.

    solution [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/multithreading/question1/Solution1.java]
    
    Task1 class [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/multithreading/question1/Task1.java]
    
    Task2 class[https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/multithreading/question1/Task2.java]
2. Create two threads t1 & t2, t1 will print all the even numbers from 0 to 100 and t2 will print all the odd numbers from 100 to 0.
    Both threads will goto sleep for 1 sec after printing one number.

    solution [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/multithreading/question2/Solution2.java]
    
    Task1 class [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/multithreading/question2/Task1.java]
    
    Task2 class [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/multithreading/question2/Task2.java]

3. Write a program to print the priority of main thread.

    solution [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/multithreading/question3/Solution3.java]
4. Write a program to set main thread priority to maximum.

    solution [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/multithreading/question4/Solution4.java]
5. What will happen if you accidentally set thread priority to 100?. Write program to demonstrate it.
6. Write program to demonstrate use of Thread.sleep() method.
7. Write a program to print 3 states of Thread.
8. Create 2 threads t1 and t2 by extending Thread class and print hello and world respectively by t1 and t2. Create 2 more threads
t3 & t4 by implementing Runnable interface to print java & programming respectively by t3 & t4.

    solution [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/multithreading/question8/Solution8.java]
    
    Task1 class [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/multithreading/question8/Task1.java]
    
    Task2 class [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/multithreading/question8/Task2.java]
    
    Task3 class [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/multithreading/question8/Task3.java]
    
    Task4 class [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/multithreading/question8/Task4.java]

### Generics
1. Create a generic Student class to demonstrate use of generic. Student class contains a field called name, this field will show generic behavior.
It can be of Type String or Name, where name is a class representing name by two fields String firstName and String LastName.

    solution [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/generic/question1/Solution1.java]
    
    Name class [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/generic/question1/Name.java]
    
    Student class [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/generic/question1/Student.java]

2. Create a generic method sum which accept array of any subtype of Number and return a double value by adding all the elements of the given array.

    solution [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/generic/question2/Solution2.java]

### Collection (ArrayList & HashSet)
1. Create a List & Set of 10 integers and demonstrate ordered and unordered collection as well as duplicate allowed and not allowed.
Demonstrate addAll() method also.

    solution [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/collection/question1/Solution1.java]
2. Create a List of 10 Integer objects and try to access 15th index. Properly analysis the output.

    solution [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/collection/question2/Solution2.java]
3. Create a List of 10 Book objects, where Book is a user defined or custom class. Book class contains following field String bookName,
String author, long isbn, & double price. Book class must be properly encapsulated and must implement data hiding. Book class contains parameterized constructors
and no-argument constructor. Book class must override String toString() of Object class to represent Book object as string while printing.
Kindly sort the list of book by price.

    solution [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/collection/question3/Solution3.java]

    Book class [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/collection/question3/Book.java]

4. Create a List of 10 Student objects, where Student is a user defined class. Student class contains three private fields int rollNo, String name, and 
double cpi. Student class must override String toString() method of Object class. Kindly sort the student by there name. And also delete the students whose name 
starts with "A" & "J".

    solution [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/collection/question4/Solution4.java]
    
    Student class [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/collection/question4/Student.java]
5. Create a list of 10 Integer objects and process the list element by element to count objects containing even value. Print the total number of odd objects after counting even objects.

    solution [https://github.com/divaibhav/oops_module2_practice_questions/blob/master/src/collection/question5/Solution5.java]
