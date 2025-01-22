
import java.util.Scanner;

class Fibonacci {
    public void printFibonacci(int n) {
        int num1 = 0;
        int num2 = 1;

        System.out.print("Fibonacci Series up to numbers are: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Fibonacci series:");
        int n = scanner.nextInt();

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacci(n);
    }
}

