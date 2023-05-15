package homework;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme4 {

    //two instance and two static variables
    int a = 10;
    static int b = 20;
    float c = 30.5f;
    static float d = 40.7f;

    public static void main(String[] args) {
        Programme4 obj = new Programme4();  //instance method
        obj.addition();
        subtraction();  //static method
    }

    // instance method
    public void addition() {
        System.out.println("Instance method Value 1: " +a);
        System.out.println("Instance method Value 2: " +b);
        System.out.println("Instance method Value 3: " +c);
        System.out.println("Instance method Value 4: " +d);

    }

    // static method
    public static void subtraction() {
        Programme4 obj1 = new Programme4();
        System.out.println("Static method Value 1: " +obj1.a);
        System.out.println("Static method Value 2: " +b);
        System.out.println("Static method Value 3: " +obj1.c);
        System.out.println("Static method Value 4: " +d);
    }
}
