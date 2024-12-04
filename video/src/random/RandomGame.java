package random;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int[] numbers = new int[num];
		
		for(int i=0; i<num; i++) {
			numbers[i] = rnd.nextInt(100);
		}
		System.out.println("랜덤 숫자: ");
		for(int number : numbers) {
			System.out.println(number+" ");
		}
		System.out.println();
		
		int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            sum += number;
        }

        double average = (double) sum/num;
        
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
        System.out.println("평균: " + average);

	}
}
