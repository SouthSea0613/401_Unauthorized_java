package part01;

public class Ex03 {
	public static void main(String[] args) {
		//Ex02.school = "인하대학교";	// 안전하지만 자주 안씀 > final 붙으면 못함
		
		Ex02 ex02 = new Ex02("김남해", 1701532);
		
		ex02.showInfo();
		
		Ex02.showTitle();
	}
}
