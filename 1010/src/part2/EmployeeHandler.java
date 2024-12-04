package part2;

public class EmployeeHandler {
	private Employee[] empList; //=new Employee[];
	private int empNum; //=0;
	
	public EmployeeHandler(int empNum) {
		empList=new Employee[empNum];
		empNum=0;
	}

	public void addEmployee(Employee emp) {
		empList[empNum++]=emp; //empNum++;
		//emp.showSalaryInfo();
	}

	public void showAllSalaryInfo() {
		for(int i=0; i<empNum; i++) {
			empList[i].showSalaryInfo(); //오버라이딩, 다형성
		System.out.println("-----------------");
	}
}

	public void showTotalSalary() {
		int sum=0;
		for(int i=0; i<empNum; i++)
			sum+=empList[i].getPay();
		System.out.println("-----------------");
		System.out.println("salary sum: "+sum);
	}
}
