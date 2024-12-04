package part01;

class Data{
	private int max;
	private int min;
	
	Data(int max, int min) {
		this.max = max;
		this.min = min;
	}
	
	public int getMax() {
		return max;
	}
	
	public void setMax(int max) {
		this.max = max;
	}
	
	public int getMin() {
		return min;
	}
	
	public void setMin(int min) {
		this.min = min;
	}
}

public class Ex05 {
	private static int[] createIntArr(int size) {
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	private static int getSum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	/* 
	private static int getMax(int[] arr) {
		int max = arr[0];
		for (int i : arr) {
			if(max < i) {
				max = i;
			}
		}
		return max;
	}
	*/
	
	/* 
	private static int getMin(int[] arr) {
		int min = arr[0];
		for (int i : arr) {
			if(min > i) {
				min = i;
			}
		}
		return min;	
	} 
	*/
	

	private static Data getMaxMinData(int[] arr) {
		int max = arr[0], min = arr[0];
		for (int i : arr) {
			if(max < i) {
				max = i;
			}
			else {
				min = i;
			}
		}
		return new Data(max, min);
	}	
	
	public static void main(String[] args) {
		int[] arr = createIntArr(21);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("sum : " + getSum(arr));
		Data data = getMaxMinData(arr);
		// System.out.println("max : " + getMax(arr));
		System.out.println("max : " + data.getMax());
		// System.out.println("min : " + getMin(arr));
		System.out.println("min : " + data.getMin());
	}
}
