// Learning the Basics of Java Syntax
package setup;

import java.util.Scanner;

// --------------------------------------
// Class Definition
// --------------------------------------
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// --------------------------------------
// Main Class
// --------------------------------------
public class Syntax {

    // --------------------------------------
    // Function: Add
    // --------------------------------------
    public static int add(int a, int b) {
        return a + b;
    }

    // --------------------------------------
    // Main Method
    // --------------------------------------
    public static void main(String[] args) {

        // --------------------------------------
        // Print Hello World
        // --------------------------------------
        System.out.println("Hello World!");
        System.out.println("--------------------");

        // --------------------------------------
        // Taking Input
        // --------------------------------------
        String name = "John";
        System.out.println("Hello " + name);
        System.out.println("--------------------");

        // --------------------------------------
        // Variable Declarations
        // --------------------------------------
        int age = 30;
        String city = "New York";
        float weight = 70.5f;
        char time = 'A';
        boolean isAdult = true;

        // Printing Variable Values
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Weight: " + weight);
        System.out.println("Time: " + time);
        System.out.println("Is Adult: " + isAdult);
        System.out.println("--------------------");

        // --------------------------------------
        // Operators
        // --------------------------------------
        int a = 10;
        int b = 20;
        int sum = a + b;
        int diff = a - b;   
        int prod = a * b;
        int div = a / b;
        int mod = a % b;

        // Printing Results of Operations
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
        System.out.println("--------------------");

        // --------------------------------------
        // Conditional Statements: If-Else
        // --------------------------------------
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is less than or equal to 5");
        }
        System.out.println("--------------------");

        // --------------------------------------
        // Loops
        // --------------------------------------
        // For Loop
        System.out.println("For Loop Output:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------");

        // While Loop
        System.out.println("While Loop Output:");
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }
        System.out.println("--------------------");

        // Do-While Loop
        System.out.println("Do-While Loop Output:");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);
        System.out.println("--------------------");

        // --------------------------------------
        // Switch Statement
        // --------------------------------------
        int day = 3;
        System.out.println("Day of the Week:");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.println("--------------------");

        // --------------------------------------
        // Function Call
        // --------------------------------------
        int result = add(10, 20);
        System.out.println("Result of Addition: " + result);
        System.out.println("--------------------");

        // --------------------------------------
        // Arrays
        // --------------------------------------
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array Elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("--------------------");

        // --------------------------------------
        // Class Usage
        // --------------------------------------
        Person person = new Person("John", 30);
        System.out.println("Person Name: " + person.name);
        System.out.println("Person Age: " + person.age);
        System.out.println("--------------------");

        // --------------------------------------
        // Scanner Class
        // --------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String input = scanner.nextLine();
        System.out.println("Hello " + input);
        scanner.close();
        
    }
}
