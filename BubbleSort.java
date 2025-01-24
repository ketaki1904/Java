import java.util.Scanner;
class BubbleSort{
public void sort(int a[]){

	int temp;
	for(int i=0;i<10;i++){
	for(int j=0;j<9-i;j++){
	if(a[j]>a[j+1]){
	temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
	}
     }
  }
}

public void print(int[]a){
	System.out.println("The Elements of array are:\n");
	for(int i=0;i<10;i++){
		System.out.println(a[i]+" ");
	}
}
	public static void main(String args[]){
	int []a=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any 10 numbers");
	for(int i=0;i<10;i++){
		a[i]=sc.nextInt();

	}

BubbleSort b1=new BubbleSort();
b1.print(a);
System.out.println("After Sorting");
b1.print(a);
b1.sort(a);
b1.print(a);
		
	
}
}

	