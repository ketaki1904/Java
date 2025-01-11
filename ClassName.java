
//Addition of two numbers:
import java.util.Scanner;
class ClassName{
	public static void main(String args[]){
	 Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number");
	 int num1=sc.nextInt();
	System.out.print("Enter the second number");
	 int num2=sc.nextInt();
	int sum=num1+num2;
	System.out.println("the sum of"+num1+"and"+num2+"is"+sum);
	
}
}

//concatination string
class ClassName{
	public static void main(String args[]){
	 String firstname="ketaki";
	 String Lastname="chandak";
	System.out.println(firstname+""+Lastname);
}
}
// Area of Circle
class ClassName{
public static void main(String args[]){
double radius=4;
System.out.println(Math.PI * radius * radius);

}
}
//Volume of Sphere
class ClassName{
	public static void main(String args[]){
	double radius=4;
	System.out.println(0.4/0.3*Math.PI*radius*radius*radius);
}
}

//simple intreas=PRT
class ClassName{
	public static void main(String args[]){
	double principle=1000,rate=4,time=5;
	double intrest=(principle*rate*time/100);
	System.out.println(intrest);
}
}
//celcius into faranite
class ClassName{
public static void main(String args[]){
	double Faranite=0.9;
	  double celsius=((Faranite-32)*5/9);
	System.out.println(celsius);	
}
}

//Character At position

class ClassName{
public static void main(String args[]){
	String str="ketaki";
	System.out.println(str.charAt(4));
}
}


//maximum of two numbers
class  ClassName{
	public static void main (String args[]){
	int a=20,b=34;
	System.out.println(Math.max(a,b));
	System.out.println(Math.min(a,b));


}
}
import java.util.Date;
class ClassName{
public static void main(String args[]){
System.out.println(new Date());
}
}
 

//Kilomiters into miter

class ClassName{
public static void main(String args[]){
double kilometer=23;
double miter=(kilometer*1.7374637);
System.out.println(miter);
}
}


//percentage calculator

class ClassName{
public static void main(String args[]){
double TotalMarks=500;
double ObtainedMarks=450;
double percentage=((ObtainedMarks/TotalMarks)*100);
System.out.println(percentage);
}
}


//Radians to Degree
 class ClassName{
	public static void main(String args[]){
	double degrees=80;
	System.out.println(Math.toRadians(degrees));
}
}
// Degree to radians
 class ClassName{
	public static void main(String args[]){
	double radians=MATH.PI/2;
	System.out.println(Math.toDegrees(radians));
}
}


//convert days into weeks

class ClassName{
public static void main(String args[]){
int days=36;
System.out.println(days/6);
}
}	
	
