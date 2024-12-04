package part1;
// 철자! 저장 주의
class Data{
	private int max;
	private int min;
	public Data(int init) {
		//max=min=init;
		this.max=init;
		this.min=init;
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
	public static void main(String[] args) {
//		int[] arr = new int[] { 10, 20, 30, 40, 50 };
		int[] arr=createIntArr(5);
		// arr[0]=10;
		for (int e : arr) {
			System.out.println(e);
		}
		System.out.println("arrSum: " + getSum(arr));// 150
		Data data=getMaxMinData(arr);
		System.out.println("max: "+data.getMax());
		System.out.println("min: "+data.getMin());
//		System.out.println("min: "+getMin(arr)); //10
		}
		private static Data getMaxMinData(int[] arr) {
			Data data=new Data(arr[0]);  // 제발 저장 좀 하자
			for (int e : arr) {
				if(data.getMax()<e) {
					data.setMax(e);
				}
				if(data.getMin()>e) {
					data.setMin(e);
				}
			}
		return data;
	}
		private static int[] createIntArr(int size) {
		int[] arr=new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=10+i;
		}
		return arr;
}
		private static int getSum(int[] arr) {
		int sum = 0;
		for (int e : arr) {
			sum += e;
		}
		return sum;
	}

	private static int getMax(int[] arr) {
		int max=arr[0];
		for (int i : arr) {
			if(max<i) {
			max=i;
		}
	}
	return max;
	}
	private static int getMin(int[] arr) {
		int min=arr[0];
		for (int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
			min=arr[i];
		}
	}
	return min;
	}
}
