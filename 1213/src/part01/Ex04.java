package part01;

interface Calculate{
	int cal(int a, int b); //매개변수 2개, 반환형=(void)없음 / 반환형 int
}
public class Ex04 {
	public static void main(String[] args) {
		Calculate c = (a, b) -> a+b;
		int result = c.cal(3, 4);
		System.out.println("result:"+result);
		
		c=(a, b) -> a-b;
		System.out.println(c.cal(3, 4)); 
	}
}
