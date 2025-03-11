import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeApp {
    static Scanner sc;
    static ArrayList<Employee> employeeList;
	private static boolean itDepartmentHasEmployees;

    public static void addEmployee() {
        System.out.println("Enter the Employee ID:");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter the Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter the Employee Address:");
        String address = sc.nextLine();

        System.out.println("Enter the Employee Email:");
        String email = sc.nextLine();

        System.out.println("Enter the Employee Mobile:");
        String mobile = sc.nextLine();

        System.out.println("Enter the Employee Department:");
        String department = sc.nextLine();

        System.out.println("Enter the Employee City:");
        String city = sc.nextLine();

        System.out.println("Enter the Employee Salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter the Employee Age:");
        int age = sc.nextInt();

        System.out.println("Is the Employee Active(yes/no):");
        boolean isActive = sc.nextBoolean();

        Employee e1 = new Employee(id, name, address, email, mobile, department, salary, city, isActive, age);
        employeeList.add(e1);
        System.out.println("Employee Added Successfully!");
    }

    public static void showEmployee() {
        System.out.println("\nID | Name | Address | Email | Mobile | Department | Salary | city");
        System.out.println("\n-------------------------------------------------------------------");
        Iterator<Employee> i1 = employeeList.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
    }

    public static void updateEmployee() {
        System.out.println("Enter the Employee ID to Update:");
        int id = sc.nextInt();
        sc.nextLine(); 

        for (Employee e : employeeList) {
            if (e.getId() == id) {
                System.out.println("Enter Updated Name:");
                e.setName(sc.nextLine());

                System.out.println("Enter Updated Address:");
                e.setAddress(sc.nextLine());

                System.out.println("Enter Updated Mobile Number:");
                e.setMobile(sc.nextLine());

                System.out.println("Enter Updated Email:");
                e.setEmail(sc.nextLine());

                System.out.println("Enter Updated Department:");
                e.setDepartment(sc.nextLine());
                
                System.out.println("Enter Updated city:");
                e.setCity(sc.nextLine());

                System.out.println("Enter Updated Salary:");
                e.setSalary(sc.nextDouble());
                System.out.println("Employee Updated Successfully!");
                return;
            }
        }
    }

    public static void showITDepartmentEmployees() {
        System.out.println("\nEmployees in IT Department:");
        for (Employee e : employeeList) {
            if (e.getDepartment().contains("IT")) {
                System.out.println(e);
            }
        }
    }
    
    
    
    
    
    private static void showHighSalaryEmployees() {
        System.out.println("\nShow the High Salary Employee of Company");
        for (Employee emp : employeeList) {
            if (emp.getSalary() > 50000) {
                System.out.println(emp);
            }
        }
    }
    private static void showEmployeesInPune() {
        System.out.println("\nShow All Employee Living In Pune");

    	  for(Employee s1 : employeeList) {
    	   if(s1.getCity().contains("Pune")) {
    	    System.out.println(s1);
    	   }
    	  }
    	 }
    private static void showActiveEmployees() {
        System.out.println("\nShow The All Active Employee");
        for (Employee emp : employeeList) {
            if (emp.isActive()) {
                System.out.println(emp);
            }
        }
    }
    private static void showRetiringEmployees() {
        System.out.println("\nEmployees Who Will Retire Soon (Age 58+)");
        for (Employee emp : employeeList) {
            if (emp.getAge() >= 58) {
                System.out.println("Retiring Soon: " + emp);
            }
        }
    }
    private static void deleteEmployee() {
    	  System.out.println("Enter the id of Employee to delete ");
    	  int id = sc.nextInt();
    	  for(Employee e1 : employeeList) {
    	   if(e1.getId() == id) {
    		   employeeList.remove(e1);
    		  
    		   System.out.println("The Employee is deleted");
    		   break;
    	   }
    	  }
    	  
    	 }

    
    public static void main(String[] args) {
        int opt;
        employeeList = new ArrayList<>();
        sc = new Scanner(System.in);

        do {
            System.out.println("\n********* Employee Management System ***************");
            System.out.println("1. Add a New Employee");
            System.out.println("2. Show all Employees in Company");
            System.out.println("3. Update Employee Details");
            System.out.println("4. Show IT Department Employees");
            System.out.println("5. Show the High Salary Employee of Company");
            System.out.println("6. Show All Employee Living In Pune");
            System.out.println("7. Show The All Active Employee");
            System.out.println("8. Employees Who Will Retire Soon (Age 58+)");
            System.out.println("9. Delete an Employee Record");
            System.out.println("10. Exit");
            System.out.print("Enter an Option: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    showEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    showITDepartmentEmployees();
                    break;
                case 5:
                	showHighSalaryEmployees();
                	break;
                case 6:
                	showEmployeesInPune();
                	break;
                case 7:
                	showActiveEmployees();
                	break;
                case 8:
                	showRetiringEmployees();
                	break;
                case 9:
                	deleteEmployee();
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

