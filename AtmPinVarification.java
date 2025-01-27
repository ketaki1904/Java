import java.util.Scanner;
class AtmPinVarification{
int correctpin=1506;
public void correctPin(int pin){
	if(pin==correctpin){
	System.out.println("PIN correct acess granted");
   }
   else{
	System.out.println("PIN incorrect access declened");
}	
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your PIN");
 int pin=sc.nextInt();
AtmPinVarification pn=new AtmPinVarification();
pn.correctPin(pin);
}

}