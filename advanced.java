public class advanced {
    public static void main(String[] args) {
        int n = 5;

        // butterfly pattern
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // rombus

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {

        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // number pyramid

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // palindromic pattern

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // dimond pattern

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; i <= n - i; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
