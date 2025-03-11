
public class Student {
     private int roll;
    private String name;
    private String address;
    private String mobile;
    private String email;
    private String course;
    private int fees;
    private int pendingfees;

   // Paramiterized Constructor
    public Student(int roll, String name, String address, String mobile, String email, String course, int fees, int pendingfees) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.course = course;
        this.fees = fees;
        this.pendingfees = pendingfees;
    }
    //Default constructor
    public Student() {
		super();
	}
    // Getters and Setters

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getPendingfees() {
		return pendingfees;
	}

	public void setPendingfees(int pendingfees) {
		this.pendingfees = pendingfees;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", mobile=" + mobile + ", email="
				+ email + ", course=" + course + ", fees=" + fees + ", pendingfees=" + pendingfees + "]";
}
	
	
	}

