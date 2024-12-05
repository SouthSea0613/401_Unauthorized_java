package part1;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {
	public static void main(String[] args) {
		String ch="A";
		System.out.println(ch+","+ch.getBytes().length);
		ch="대";
		System.out.println(ch+ "," +ch.getBytes().length);
		int i;
		System.out.println("알파벳(한글) 여러개를 쓰고 [Enter] 를 누르세요");
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			//InputStreamReader의 read는 문자 스트림 단이로 입력
		//while ((i=isr.read()) !='\n') {
			while ((i=System.in.read())!='\n')	{
		//InputStream의 read() 바이트 단위로 읽기때문에 한글(3Byte)	는 깨짐
			System.out.println(i);
			System.out.println((char)i);
			
		}
		
	}catch	(IOException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}