package part02;

public class EmployeeManager {
	private Employee[] empList;
	private int empNum = 0;
	
	public EmployeeManager(int empNum) {
		empList = new Employee[empNum];
	}

	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		empList[empNum++] = employee;
	}

	public void showAllSalaryInfo() {
		// TODO Auto-generated method stub
		for (int i = 0; i < empNum; i++) {
			empList[i].showSalaryInfo();
		}
		System.out.printf("---\n");
	}

	public void showTotalSalary() {
		// TODO Auto-generated method stub
		int paySum = 0;
		for (int i = 0; i < empNum; i++) {
			paySum += empList[i].getPay();
		}
		System.out.printf("salary sum : %d", paySum);
	}
}
