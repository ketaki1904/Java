import java.util.Scanner;
class Voting{
public void checkEligiblity(int age){
if(age<=18){
	System.out.println("you are eligible for voting");
}
else{
	System.out.println("you are not eligible for voting");
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Age");
int age=sc.nextInt();
Voting en=new Voting();
en.checkEligiblity(age);

}
}