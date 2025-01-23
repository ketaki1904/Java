import java.util.Scanner;
class PositiveNegative{
public class checkNumber(int no){
	if(no>0){
	System.out.println("Number is positive");
}
else{
	System.out.println("Number is Negative");
}
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int no=sc.nextInt();
PositiveNegative pn=new PositiveNegative();
pn.checknumber();

}