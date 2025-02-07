import java.util.Scanner;
class IfElseDemo{
public static void main(String args[]){
	int signal;
Scanner sc=new Scanner(System.in);
System.out.println("how much time we will get pass the signal");
	signal=sc.nextInt();
	if(signal>15){
	System.out.println("Red signal");
	System.out.println("Stop the all Bikes");
	System.out.println("They do not Drive any person for bike");
}
else{
	System.out.println("Green signal");
	System.out.println("To passes all the bikes at same time");
}
}
}