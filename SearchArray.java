/*import java.util.Scanner;
class SearchArry{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any 10 numbers");
	int [] no=new int[10];
	for(int i=0;i<10;i++){
	no[i]=sc.nextInt();
	}
    	System.out.println("Enter the Number to Search");
//generally the number to dearch is called as key
	int key=sc.nextInt();


	for(int i=0;i<10;i++){
		if(key==no[i]){
		System.out.println("The value is found at position: "+i);
			break;
		}
	}	

}
}*/

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Declare and input array elements
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the element to search for
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Perform linear search
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        // If the element is not found
        if (!found) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
