package part2;

import java.util.Random;
import java.util.Scanner;

public class Random1 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("정수 1입력 : ");
		 	int num1= sc.nextInt();
		 	System.out.println("정수 2 입력 : ");
		 	int num2= sc.nextInt();
		 	int n=num1-num2+1;
		 
		 	Random rnd = new Random();
		 	for(int i=0; i<10; i++) {
		 		System.out.println(rnd.nextInt(n)+num1);	
		 		
		 			
		 		}
		 	}
}

	
	
