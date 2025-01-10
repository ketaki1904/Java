import java.util.Scanner;

class ArrayDemo {
    public static void main(String args[]) {
        
        int[] a = new int[10];
        
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt(); // 
        }

        
        System.out.println("The Array Elements are:");
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }

        
        System.out.println("The Array Elements in reverse order are:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(a[i]);
        }

        
        
    }
}
