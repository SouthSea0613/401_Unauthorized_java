package part2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
		out.write("박지성 - 메시 멈추게 하는데 집중하겠다.\n");
//		out.newLine(); // 줄 바꿈
		out.write("팀이 승리하는 것을 돕기 위해 최선을 다하겠다.\n\n");
//		out.newLine();
		out.write("환상적인 결승전이 될 것이다.");
		out.newLine();
		out.write("기사 제보 및 보도자료");
		out.newLine();
		out.write("press@goodnews.co.kr");
		out.close();
		System.out.println("기사 입력 완료.");
		
		//파일의 모든 내용 문자스트림 읽기
		BufferedReader in = new BufferedReader(new FileReader("String..txt"));
		String str;
		while (true) {
			str = in.readLine();
			if(str == null)
				break;
			System.out.println(str);
		}
		in.close();
	}
}
