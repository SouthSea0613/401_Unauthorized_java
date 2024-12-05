package part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_91 {
	public static void main(String[] args) throws IOException {
		//PrintStream ----> PrintWriter
		PrintWriter out = new PrintWriter(new FileWriter("printf.txt"));
		out.printf("제 나이는 %d살 입니다.", 24);
		out.println("");
		out.write("저는 자바가 좋습니다.\n");
		out.print("특히 I/O 부분에서 많은 매력을 느낍니다.");
		out.close();
		
		//파일읽기
		 BufferedReader in = new BufferedReader(new FileReader("printf.txt"));
		String str;
		while (true) {
			str=in.readLine();
			if(str==null);
			break;}
		
			System.out.println(str);
			in.close();
		}
	}

