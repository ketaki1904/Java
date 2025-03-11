import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentApp {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> StudentList = new ArrayList<>();
	private static int r;

    public static void addStudent() {
        System.out.println("Enter the Student's Roll Number:");
        int r = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Student's Name:");
        String n = sc.next();

        System.out.println("Enter the Student's Address:");
        String a = sc.next();

        System.out.println("Enter the Student's Email Address:");
        String e = sc.next();

        System.out.println("Enter the Student's Mobile Number:");
        String m = sc.next();

        System.out.println("Enter the Student's Course:");
        String c = sc.next();

        System.out.println("Enter the Student's Fees:");
        int f = sc.nextInt();

        System.out.println("Enter the Student's Pending Fees:");
        int p = sc.nextInt();

        Student s1 = new Student(r, n, a, m, e, c, f, p);
        StudentList.add(s1);
        System.out.println("Student Added Successfully!");
    }

    public static void showStudents() {
        System.out.println("\n rollno name Address EmailAddress mobileno course fees pendingfees");
        System.out.println("\n-------------------");
        Iterator<Student>i1=StudentList.iterator();
        while(i1.hasNext()){
        	System.out.println(i1.next());
        } 	
        }   

    public static void deleteStudent() {
        System.out.println("Enter the Roll Number of the Student to Delete:");
        int rollNo = sc.nextInt();

        Iterator<Student> i1 = StudentList.iterator();
        boolean found = false;
        
        while (i1.hasNext()) {
            Student s1 = i1.next();
            if (s1.getRoll() == rollNo) {
                i1.remove(); 
                found = true;
                System.out.println("Student Deleted Successfully!");
                break; 
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }
    }

    public static void updateStudent() {
        System.out.println("Enter the Roll Number of the Student to Update:");
        int r = sc.nextInt();
        sc.nextLine(); 

        for (Student s : StudentList) {
            if (s.getRoll() == r) {
                System.out.println("Enter New updated Name:");
                s.setName(sc.nextLine());

                System.out.println("Enter New  updated Address:");
                s.setAddress(sc.nextLine());

                System.out.println("Enter New Mobile updated Number:");
                s.setMobile(sc.nextLine());

                System.out.println("Enter New updated Email:");
                s.setEmail(sc.nextLine());

                System.out.println("Enter New updated Course:");
                s.setCourse(sc.nextLine());

                System.out.println("Enter New updated Fees:");
                s.setFees(sc.nextInt());

                System.out.println("Enter New Pending updated Fees:");
                s.setPendingfees(sc.nextInt());

                System.out.println("Student Updated Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }
    
    public static void showTotalPendingFees() {
        int totalPendingFees = 0;
        for (Student s : StudentList) {
            totalPendingFees += s.getPendingfees();
        }
        System.out.println("Total Pending Fees: " + totalPendingFees);
    }
    
    public static void showTotalPaidFees() {
        int totalPaidFees = 0;
        for (Student s : StudentList) {
            totalPaidFees += (s.getFees() - s.getPendingfees());
        }
        System.out.println("Total Paid Fees: " + totalPaidFees);
    }
    public static void showJavaStudents() {
        System.out.println("Students Enrolled in Java Course:");
        for (Student s : StudentList) {
            if (s.getCourse().equalsIgnoreCase("Java")) {
                System.out.println(s);
            }
        }
    }

    public static void showPythonStudents() {
        System.out.println("Students Enrolled in Python Course:");
        for (Student s : StudentList) {
            if (s.getCourse().equalsIgnoreCase("Python")) {
                System.out.println(s);
            }
        }
    }

    public static void showStudentsInPune() {
        System.out.println("Students Living in Pune:");
        for (Student s : StudentList) {
            if (s.getAddress().equalsIgnoreCase("Pune")) {
                System.out.println(s);
            }
        }
    }
           

   

    public static void main(String[] args) {
        int opt;
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add a New Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Delete a Student");
            System.out.println("4. Update Student Details");
            System.out.println("5. show total pending fees");
            System.out.println("6. show total paid fees");
            System.out.println("7. show list of java course");
            System.out.println("8. show python student list");
            System.out.println("9. show all student living in pune");
            System.out.println("10. Exit");
            System.out.print("Enter an Option: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                	showTotalPendingFees();
                	break;
                case 6:
                	showTotalPaidFees();
                	break;
                case 7:
                	showJavaStudents();
                	break;
                case 8:
                	showPythonStudents();
                	break;
                case 9:
                	showStudentsInPune();
                	break;	
                case 10:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Option! Please Try Again.");
            }
        } while (opt != 10);
    }
}


