package week1.day2.assignments;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		EmployeeDetails employee_database = new EmployeeDetails();
		employee_database.printEmployeeName("Somasundaram S P", 2556336);
		employee_database.getEmployeAddress("Karaikudi");
		employee_database.printEmployeeSalary(75780.00);
		employee_database.printEmployeeMobileNumber(9876543210L);
		}
	void printEmployeeName(String empName , int empId) {
		System.out.println("Employee_Name: "+empName+" "+"\nEmployee_Id:"+empId);
	}
	void getEmployeAddress(String empAddress) {
		System.out.println("Employee_Address: "+empAddress);
	}
	void printEmployeeSalary(double empSalary) {
		System.out.println("Salary: "+empSalary);
	}
	void printEmployeeMobileNumber(long mobNum) {
		System.out.println("Mobile "
				+ "Number: "+mobNum);

}
}