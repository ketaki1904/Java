import java.util.*;

public class twdarray {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int rows = Sc.nextInt();
        int col = Sc.nextInt();

        int numbers[][] = new int[rows][col];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = Sc.nextInt();
            }
        }

        int x = Sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (numbers[i][j] == x) {
                    System.out.print("x is found at the location " + i + "," + j + ")");
                }
            }
        }

        // output statement
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }

}
