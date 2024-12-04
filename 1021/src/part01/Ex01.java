package part01;

import java.io.*;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		String ch = "a";
		System.out.printf("%s : %d, %d\n", ch, ch.length(), ch.getBytes().length);
		
		ch = "뭐";
		System.out.printf("%s : %d, %d\n", ch, ch.length(), ch.getBytes().length);
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		System.out.printf("문자를 여러개 쓰고 엔터 : ");
		int i;
		try {
			while ((i = inputStreamReader.read()) != '\n') {
				System.out.printf("%d\n", i);
				System.out.printf("%s\n", (char)i);
			}
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
