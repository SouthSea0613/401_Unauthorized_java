package part1;

public class Ex06 {
	public static void main(String[] args) {
		int[] arr=new int[] {10,20,30,40,50};
		
		int sum=0;
		//for(int i = 0; i < arr.length; i++) //순서를 내가 정할 수 있음
		//sum+=arr[i];
		for(int e:arr) { //코드가 짧고 복사해서 순차적으로
			sum=+e;
		}
		System.out.println("sum"+sum);
}
}
