package part02;

import java.util.Random;

public class Ex1024_03 {
	public static void printField(int cnt, char[] field) {
		System.out.print(cnt + " : ");
		for (char c : field) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		
		char[] field = new char[10];
		for (int i = 0; i < field.length; i++) {
			field[i] = '_';
		}
		field[0] = '*';
		
		int cnt = 1;
		
		while(field[field.length - 1] != '*') {
			printField(cnt, field);
			
			if (random.nextInt(2) == 1) {
				for (int i = 0; i < field.length; i++) {
					if (field[i] == '*') {
						field[i] = '_';
						field[i + 1] = '*';
						break;
					}
				}
			}
			else {
				
			}
			
			cnt++;
		}
		
		printField(cnt, field);
	}
}
