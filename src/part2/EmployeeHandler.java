package part2;

public class EmployeeHandler {
	private Employee[] empList; // =new Employee[50]
	private int empNum;// =0

	public EmployeeHandler(int empNum) {
		empList = new Employee[empNum];
		empNum = 0;
	}

	public void addEmployee(Employee emp) {
		empList[empNum++] = emp;
	}

	public void showAllSalaryInfo() {
		for (int i = 0; i < empNum; i++)
			empList[i].showSalaryInfo();
		System.out.println("----------------------");
	}

	public void showTotalSalary() {
		int sum = 0;
		for (int i = 0; i < empNum; i++)
			sum += empList[i].getPay();
		System.out.println("----------------------");
		System.out.println("salsry sum : " + sum);

	}

}
