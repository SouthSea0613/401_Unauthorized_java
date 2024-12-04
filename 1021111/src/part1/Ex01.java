package part1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex01 {
	public static void main(String[] args) {
		String ch = "A";
		System.out.println(ch + "," + ch.getBytes().length);
		ch = "대";
		System.out.println(ch + "," + ch.getBytes().length);
		int i;
		System.out.println("알파벳(한글) 여러 개를 쓰고 [Enter] 누르세요");
		try {
			 //InputStreamReader의 read는 문자스트림 단위로 입력
			 InputStreamReader isr=new InputStreamReader(System.in);
			 while((i=isr.read()) !='\n') {
			//InputStream의 read() 바이트스트림 단위로 읽기때문에 한글(3Byte)는 깨짐
			//while ((i = System.in.read()) != '\n') {
				System.out.println(i);
				System.out.println((char) i);
			}
		} catch (

		IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
