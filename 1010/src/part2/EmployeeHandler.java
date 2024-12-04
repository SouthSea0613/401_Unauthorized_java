package part2;

public class EmployeeHandler {
	private Employee[] empList;
	private int empNum;
	
	public EmployeeHandler (int empNum) {
		empList=new Employee[empNum];
	}
	public void addEmployee(Employee employee) {
		empList[empNum++]=employee;
	}
	public void showAllSalaryInfo() {
		for(int i=0; i<empNum; i++) 
			empList[i].showSalaryInfo();
	}
	public void showTotalSalary() {
		int sum=0;
		for(int i=0; i<empNum; i++) 
			sum+=empList[i].getPay();
		System.out.println(sum);
	}
}


