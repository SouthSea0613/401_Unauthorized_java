package part01;

import java.io.*;

public class Ex09 {
	public static void main(String[] args) throws IOException{
		OutputStream outputStream = new FileOutputStream("output2.txt");
		byte[] bs = new byte[26];
		byte data = 65;
		for (int i = 0; i < 26; i++) {
			bs[i] = data++;
		}
		outputStream.write(bs);
		
		outputStream.close();
		
		System.out.printf("end\n");
	}
}
