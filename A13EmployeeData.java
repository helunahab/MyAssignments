

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EmployeeData{
	private int empID;
	private String name;
	private double salary;
	private int deptId;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
}
	


interface IEmployeeDataDAO{
	void addEmployees(List<EmployeeData>emp);
}

class EmployeeDataDAO implements IEmployeeDataDAO{
	List<EmployeeData> empList = new ArrayList<EmployeeData>();
	@Override
	public void addEmployees(List<EmployeeData> emp) {
		for (EmployeeData employeeData : empList) {
			empList.add(employeeData);
		}
			
		
	}
	
}

public class A13EmployeeData {

	public static void main(String[] args) {

		List<EmployeeData> empList = new ArrayList<EmployeeData>();
		IEmployeeDataDAO empdata = new EmployeeDataDAO();
		String response;
		do {
			Scanner scr = new Scanner(System.in);
			System.out.println("Employee detailed data");
			System.out.println("Enter empID please");
			int empID = scr.nextInt();
			System.out.println("Enter name please");
			String name = scr.next();
			System.out.println("Enter salary please");
			double salary = scr.nextDouble();
			System.out.println("Enter deptId please");
			int deptId = scr.nextInt();
			
			
			EmployeeData data = new EmployeeData();
			data.setEmpID(empID);
			data.setDeptId(deptId);
			data.setName(name);
			data.setSalary(salary);
			empList.add(data);
			System.out.println("Do you want continue?(Y/N)");
			Scanner scan = new Scanner(System.in);
			response = scan.next();
		} while (response.equals("Y"));
			empdata.addEmployees(empList);
	}

}
