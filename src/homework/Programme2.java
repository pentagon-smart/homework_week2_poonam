package homework;

/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Programme2 {

    //two static variables
    static int a = 20;
    static char b = 'P';

    public static void main(String[] args) {
        m1();
    }

    //one static method
    public static void m1() {
        System.out.println("Value 1: " +a);
        System.out.println("Value 2: " +Programme2.b);
    }
}
