package setup;

// Primitive - byte,short,int,long,float,double,boolean and char
// Non-Primitive - String, Arrays, Classes, Enums and Records
public class DataTypes {

    // --------------------------------------
    // Main Method
    // --------------------------------------
    public static void main(String[] args) {

        // --------------------------------------
        // Primitive Data Types
        // --------------------------------------
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50.5f;
        double d = 60.6;
        char c = 'A';
        boolean bool = true;

        // --------------------------------------
        // Non-Primitive Data Types
        // --------------------------------------
        String str = "Hello World!";
        int[] arr = {1, 2, 3, 4, 5};
        Person person = new Person("John", 30);

        // --------------------------------------
        // Printing Variable Values
        // --------------------------------------
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + bool);
        System.out.println("String: " + str);
        System.out.println("Array: " + arr[0]);
        System.out.println("Person: " + person.name + " " + person.age);
    }

}
