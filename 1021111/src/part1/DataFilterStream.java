package part1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataFilterStream {
	public static void main(String[] args) throws IOException {
		//OutputStream out = new FileOutputStream("data.txt");
		//DataOutputStream filterOut = new DataOutputStream(out);
		DataOutputStream filterOut = 
				new DataOutputStream(new FileOutputStream("data.txt"));
		
//출력 스트림과 필터 스트림과의 연결!
		filterOut.writeInt(275);
		filterOut.writeDouble(45.79);
		filterOut.close();
		InputStream in = new FileInputStream("data.txt");
		DataInputStream filterIn = new DataInputStream(in);
//입력 스트림과 필터 스트림과의 연결!
		int num1 = filterIn.readInt();
		double num2 = filterIn.readDouble();
		filterIn.close();
		System.out.println(num1);
		System.out.println(num2);
	}
}
