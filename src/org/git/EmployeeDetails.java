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
	
<<<<<<< HEAD
	private void empAddress() {
		System.out.println("Nammakkal");
=======
	private void empAge() {
		System.out.println("My empAge : 28");
>>>>>>> 9fc462c45884e2b6313e1e5a2acbe7fe31d99fb6
	}
	
public static void main(String[] args) {
		
		EmployeeDetails E= new EmployeeDetails();
		
		E.empId();
		E.empName();
		E.empDob();

}
}
