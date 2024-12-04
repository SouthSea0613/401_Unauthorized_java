package part2;

public class Main {
	public static void main(String[] args) {
	EmployeeHandler handler=new EmployeeHandler(100);
	
//	handler.addEmployee(new Employee("kim"));
	handler.addEmployee(new PermanentWorker("lee",1500));
	
	TemporaryWorker alba=new TemporaryWorker("jung",700);
	alba.addWorkTime(5);
	handler.addEmployee(alba);
	
	SalesWorker seller=new SalesWorker("hong",1000,0.1);
	seller.addSalesResult(7000);
	handler.addEmployee(seller);
	
	handler.showAllSalaryInfo();
	handler.showTotalSalary();
	}
}
