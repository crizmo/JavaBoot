package setup;

// --------------------------------------
// Functional Interface
// --------------------------------------
interface MathOperation {
    int operation(int a, int b);
}

// --------------------------------------
// Functional Interface
// --------------------------------------
interface GreetingService {
    void sayMessage(String message);
}


public class Lambda {
    
        // --------------------------------------
        // Main Method
        // --------------------------------------
        public static void main(String[] args) {
    
            // --------------------------------------
            // Lambda Expression
            // --------------------------------------
            MathOperation addition = (int a, int b) -> a + b;
            MathOperation subtraction = (int a, int b) -> a - b;
            MathOperation multiplication = (int a, int b) -> a * b;
            MathOperation division = (int a, int b) -> a / b;
    
            // --------------------------------------
            // Lambda
            // --------------------------------------
            System.out.println("Addition: " + addition.operation(10, 20));
            System.out.println("Subtraction: " + subtraction.operation(20, 10));
            System.out.println("Multiplication: " + multiplication.operation(10, 20));
            System.out.println("Division: " + division.operation(20, 10));

            // --------------------------------------
            // Lambda Expression
            // --------------------------------------
            
            GreetingService greetService1 = message -> System.out.println("Hello " + message);
            GreetingService greetService2 = (message) -> System.out.println("Hi " + message);

            // --------------------------------------
            // Lambda
            // --------------------------------------
            greetService1.sayMessage("John");
            greetService2.sayMessage("Doe");

        }

}
