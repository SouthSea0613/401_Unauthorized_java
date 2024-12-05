package part02;	//소스에 가장 상단에 1번만 선언가능

public class Main
{
	public static void main(String[] args){
		// 직원관리를 목적으로 설계된 컨트롤 클래스의 인스턴스생성
		EmployeeManager handler=new EmployeeManager(100);	// 제어 클래스(코딩어렵다)
		
		// 정규직 등록
		// handler.addEmployee(new Employee("KIM"));	// 추상클래스화 해서 에러 발생시킴
		handler.addEmployee(new PermanentWorker("LEE", 1500));

		TemporaryWorker alba=new TemporaryWorker("Jung", 700);	
		alba.addWorkTime(5);
		handler.addEmployee(alba);	//비정규직 등록	
		
		SalesWorker seller=new SalesWorker("Hong", 1000, 0.1);
		seller.addSalesResult(7000);	// 영업 실적 7000
		handler.addEmployee(seller);	// 영업직 등록

		handler.showAllSalaryInfo();	// 전직원의 정보출력	
		handler.showTotalSalary();	// 전직원의 급여의 총합출력
		
		// 순도 100퍼센트 추상메소드로 이뤄진 class가 인터페이스
	}
}
