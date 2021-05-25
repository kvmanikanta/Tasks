package OOPS_DEMO;

class Employeee {
	private int EmpId;
	private String EmpName;

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

}

public class Encapsulation_Demo {

	public static void main(String[] args) {
		Employeee emp = new Employeee();
		emp.setEmpName("Manikanta");
		emp.setEmpId(574500);
		System.out.println(emp.getEmpName() + " With id : " + emp.getEmpId());

	}

}
