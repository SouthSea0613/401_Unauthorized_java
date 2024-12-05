package youtube;

import java.util.Scanner;

public class PA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하시오 : ");
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("음수는 출력할수없음 ");
		}else {
			if(n%2==0) {
				System.out.println(n+"은 짝수입니다.");
			}else {
				System.out.println(n+"은 홀수입니다.");
			}
		}
		
	}
	}		
		
