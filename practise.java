
import java.util.*;

public class practise {
    public static void main(String[] args) {
        int n = 5;
        // int number = 1;
        // int m = 5;
        // outer loop
        // for (int i = 1; i <= n; i++) {
        // inner loop
        // for (int j = 1; j <= i; j++) {
        // celll->[i,j]
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");

        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // half peramid
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();

        // }
        // }

        // reverse pyramid
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();

        // }
        // }

        //
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // floyed pyramid

        // for (int i = 1; i <= n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print(number + " ");
        // number++;
        // }
        // System.out.println();
        // }
        // }

        // 0-1traingle

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // int sum = i + j;
        // if (sum % 2 == 0) {
        // System.out.print("1 ");
        // } else {
        // System.out.print("0 ");
        // }
        // }
        // ystem.out.println();

        // }

        // rombus

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
