package part01;

import java.io.*;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		DataOutputStream filterOut = new DataOutputStream(new FileOutputStream("data.txt"));	// 출력 스트림과 필터 스트림과의 연결!
		filterOut.writeInt(275);
		filterOut.writeDouble(45.79);
		filterOut.close();
		
		DataInputStream filterIn = new DataInputStream(new FileInputStream("data.txt"));	// 입력 스트림과 필터 스트림과의 연결!
		System.out.printf("%d\n", filterIn.readInt());
		System.out.printf("%f\n", filterIn.readDouble());
		filterIn.close();
	}
}
