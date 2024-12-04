package part2;

public class TestClass {

	private int total;
	
	public static void main(String[] args) {
		
		TestClass tc = new TestClass();
		
//		int a = 1;
//		int b = 2;

//		String text = tc.plus(a, b);
		
//		System.out.println("a + b : " + tc.total);
//		System.out.println(text);
		
		TestData td = new TestData();

		td.setTestData(false, "전자", "샤넬", "aaaa");
		
		String result = tc.car(td);
		System.out.println(result);
	}
	
	public void plus(int a, int b) {
		total = a+b;
	}
	
	public int getNum() {
		return total;
	}
	
	public String car(TestData testData) {
		
		if(testData.isKey() && !"".equals(testData.getCigar()) && !"".equals(testData.getBag()) && !"".equals(testData.getAaa())) {
			return "문이 열렸습니다.";
		}else {
			return "키가 없습니다.";
		}
	}

}
