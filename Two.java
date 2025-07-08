package USS;

public class Two {

    public static void main(String[] args) {

        // Lambda expression to implement run() method
        Ianimal one = (int j, int k) -> System.out.println("Sum = " + (j + k));

        // Call the lambda
        one.run(100, 1000);  // Output: Sum = 1100
    }
}

@FunctionalInterface
interface Ianimal {
    void run(int i, int j);
    
    // ❌ If you uncomment below, it breaks the functional interface rule
    // void sleep();
}

