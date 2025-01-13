import java.util.Scanner;
public class DoWhileDemo{
public  static void main(String args[]){

	int no=10;
	Scanner sc=new Scanner(System.in);
	do{
		System.out.println("1.Square");
		System.out.println("2.cube");
		System.out.println("3.EvenOdd");
		System.out.println("4.PositiveNegative");
		System.out.println("5.Exit");
		System.out.println("Plese Enter Your option");
		int opt=sc.nextInt();
		if(opt==1){
		System.out.println("Give me a number");
		no=sc.nextInt();
		System.out.println("Square="+no*no);
	}
	else if(opt==2){
		System.out.println("Give a number");
		no=sc.nextInt();
		System.out.println("cube="+no*no*no);
	}
	else if(opt==3){
		if(no%2==0)
			System.out.println("even number");
		else{
			System.out.println("odd number");
	   	   }

	}
	else if(opt==4){
	System.out.println("Enter the number");
	no=sc.nextInt();
		if(no>0){
			System.out.println("Positive number");
		}
		else{
			System.out.println("Negative number");
	     	}

}else{
			System.out.println("Exit");

}
	

	}while(no!=5);
}
}