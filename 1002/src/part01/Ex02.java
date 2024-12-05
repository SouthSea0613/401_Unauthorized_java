package part01;

public class Ex02 {

	public static void main(String[] args) {
		int[][] arr = new int[3][4]; //배열 개수에 따라 부르는게 달라짐 
		//배열을 세분화하기위해씀, 
		for (int i = 0; i < arr.length; i++) { 
			// {0{0,1,2,3},1{0,1,2,3},2{0,1,2,3}},배열의 길이 3
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j; 
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
