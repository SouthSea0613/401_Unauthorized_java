package part1;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {
	public static void main(String[] args) {
		String ch = "A";
		System.out.println(ch + "," + ch.getBytes().length);
		ch = "대";
		System.out.println(ch + "," + ch.getBytes().length);

		int i;
		System.out.println("알파벳 여러 개를 쓰고 [Enter] 누르세요");
//		InputStreamReader isr = new InputStreamReader(System.in); //얘는 문자 자체대로 읽음!!
		try {
			while ((i = System.in.read()) != '\n') { //Reader 없는 InputStream! 대한민국 검색 시 다 깨짐(1바이트단위로 읽음)
//			while ((i = isr.read()) != '\n') {
				//↑InputStramReader 사용 시 사용하는 while문
				System.out.println(i);
				System.out.println((char) i);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
