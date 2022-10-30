package org.git;

public class EmployeeDetails {
	
	public void empId() {
		System.out.println("My empId : 95213");
	}
	
	public void empName() {
        System.out.println("My empName : suganesh");
	}
	
	public void empDob() {
        System.out.println("My empDob : 14/03/1994");
	}
	
	private void empAddress() {
		System.out.println("Nammakkal");
	}
	
public static void main(String[] args) {
		
		EmployeeDetails E= new EmployeeDetails();
		
		E.empId();
		E.empName();
		E.empDob();

}
}
