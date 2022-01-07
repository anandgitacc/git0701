package org.gittest;


public class Test {

	// method 1
	private void empName() {

		System.out.println("Employee name is : Anand");

	}

	// method 2
	private void empMobNo() {

		System.out.println("Employee mobile number is : 8667070832");

	}

	// method 3
	private void empId() {
		System.out.println("Employee id is : 6546");
	}
private void empStatus() {
		
		System.out.println("Currently working");
}
private void empAdd() {
	
	System.out.println("OMR, Chennai");
}
//<<<<<<< HEAD
	
//=======
	
//>>>>>>> 3f6a521225efbb0b19437ededd7a8c74079d11df

	// main method
	public static void main(String[] args) {

		// object
		Test ed = new Test();

		// method call
		ed.empId();
		ed.empMobNo();
		ed.empName();

	}

}
