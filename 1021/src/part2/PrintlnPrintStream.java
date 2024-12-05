package part2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

class MyInfo{
	String info;
	public MyInfo(String info) {
		this.info = info;
		}
	public String toString() { 
		return info;
		}
}
public class PrintlnPrintStream {
	public static void main(String[] args) throws FileNotFoundException {
		//풀이2
		OutputStream out = new FileOutputStream ( "a.txt");
		//바이트 스트림 -->문자 스트림 변환필터
		BufferedOutputStream bOut = new BufferedOutputStream(out);
		PrintStream pOut =new PrintStream(out);
		
		MyInfo mInfo = new MyInfo("저는 java 프로그래머입니다.");
		pOut.println("제 소개를 하겠습니다.");
		pOut.println(mInfo);
		pOut.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
		pOut.close(); //flush --> end
		
//		//풀이 1
//		OutputStream out = new FileOutputStream ( "a.txt");
//		//바이트 스트림 -->문자 스트림 변환필터
//		PrintStream pOut =new PrintStream(out);
//		
//		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
//		pOut.println("제 소개를 하겠습니다.");
//		pOut.println(mInfo);
//		pOut.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
//		pOut.close();
		
		
		
	}
}

