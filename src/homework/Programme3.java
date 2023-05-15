package homework;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme3 {
    // instance variable
    float a = 3.5f;
    // static variable
    static String name = "Poonam";

    public static void main(String[] args) {
        Programme3 obj1 = new Programme3();
        m2();
        obj1.m1();
    }

    //instance method
    public void m1() {
        System.out.println("Instance method Value 1: " +a);
        System.out.println("Instance method Value 2: " +name);
    }

    //static method
    public static void m2() {
        Programme3 t1 = new Programme3();
        System.out.println("Static method Value 1: " +t1.a);
        System.out.println("Static method Value 2: " +name);

    }
}
