package part1;

import java.util.Iterator;

public class Ex06 {
	public static void main(String[] args) {
		int[] arr=new int[] {10,20,30,40,50};
	
		int sum=0;
		//for (int i = 0; i < arr.length; i++){
			//sum+=arr[i];
		//}
		for(int e:arr){
			sum+=e;
		}
		System.out.println("sum: "+sum);
	}
}
