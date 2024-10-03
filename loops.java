import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
         int n = 5;

         for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
         int sum = i + j;
        
         if (sum % 2 == 0) {
         System.out.print("1 ");
        
        } else {
        
         }
         System.out.print("0 ");
         }
         System.out.println();
         }
    }

    
      if (i == 1 || j == 1 || i == n || j == n) {
     System.out.print("*");
      } else {
      System.out.print(" ");
      
      }
      }
     System.out.println();
      
      }
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum = 0;
      for (int i = 0; i <= n; i++) {
      sum = sum + i;
      }
      System.out.println(sum);
     
     for (int i = 0; i < 11; i++) {
     System.out.println(i);
     }

     int i = 0;
     while (i < 11) {
     System.out.println(i);
     i = i + 1;
     }

    
      int i = 0;
      do {
      System.out.println(i);
      i = i + 1;
      } while (i < 11);
     

}
