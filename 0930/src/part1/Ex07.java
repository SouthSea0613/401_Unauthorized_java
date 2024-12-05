package part1;

public class Ex07 {
	public static void main(String[] args) {
		int dan=2;
		for(; dan<=9; dan++) { 
			int j=1;
			for (; j<=9; j++) {
				if (dan<j) {
					break;
				}
				System.out.println(dan+"*"+j+"="+dan*j);
			}
			System.out.println("-----------");
		}
		
				
	}
}
