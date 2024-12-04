package part03;

import java.util.Scanner;

public class EX1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("첫번째");
        int a = sc.nextInt();
        
        System.out.print("두번째");
        int b = sc.nextInt();
        
        if(b<0) {
        	a = -a;
        	b = -b;
        }
        
        for(int i=0; i<b; i++) { //i는 단순 count
        	sum+=a;
        }
        System.out.println(sum);
	}
}
