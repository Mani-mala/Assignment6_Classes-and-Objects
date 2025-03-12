package assignment6;
public class EmployeeDto {
    final static String companyname="Bell Information & Technology solutions pvt.ltd,.";
    final static String location="Surandai";
    private String employeename;
    private Long id;
    private String email;
    private String department;
    private double salary;
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		EmployeeDto emp1=new EmployeeDto();
		emp1.setEmployeename("Bala");
		System.out.println("Employee Name : "+emp1.getEmployeename());
		emp1.setId(833968919l);
		System.out.println("Employee Id.no : "+emp1.getId());
		emp1.setEmail("bala@gmail.com");
		System.out.println("Employee Email : "+emp1.getEmail());
		emp1.setDepartment("Technical");
		System.out.println("Department : "+emp1.getDepartment());
		emp1.setSalary(990000);
		System.out.println("Salary : "+emp1.getSalary());
		System.out.println("Company name : "+companyname);
		System.out.println("Location : "+location);
		System.out.println("\n");
		
		EmployeeDto emp2=new EmployeeDto();
		emp2.setEmployeename("Latha Mani");
		System.out.println("Employee Name : "+emp2.getEmployeename());
		emp2.setId(213455579l);
		System.out.println("Employee Id.no : "+emp2.getId());
		emp2.setEmail("latha@gmail.com");
		System.out.println("Employee Email : "+emp2.getEmail());
		emp2.setDepartment("Testing");
		System.out.println("Department : "+emp2.getDepartment());
		emp2.setSalary(900000);
		System.out.println("Salary : "+emp2.getSalary());
		System.out.println("Company name : "+companyname);
		System.out.println("Location : "+location);
	}

}
