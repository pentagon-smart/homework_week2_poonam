package homework;

/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Programme1 {

    int a = 20; // 1 instance variable
    String name = "Poonam"; // 2 instance variable

    public static void main(String[] args) {
        Programme1 m = new Programme1();
        m.myMethod();
    }

    public void myMethod() {  // instance method
        Programme1 obj = new Programme1();
        System.out.println("Value 1: " +obj.a);
        System.out.println("Value 2: " +obj.name);
    }
}
