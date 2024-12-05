package project;

public class Project {
	public static void main(String[] args) {
		int [] arr = {3, 2, 1, 5, 4}	;
		number(arr);
		

		System.out.println("내림차순 정렬 결과 : ");
		for (int i : arr) {
			System.out.println(i+"");
		}
			
			}
		
	private static void number(int[]arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					//swap
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}