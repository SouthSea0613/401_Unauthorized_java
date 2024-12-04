package part01;

import java.io.*;

public class Ex11 {
	public static void main(String[] args) throws IOException{
		char ch1 = 'A';
		char ch2 = 'B';
		
		Writer writer = new FileWriter("hyper.txt");
		writer.write(ch1);
		writer.write(ch2);
		writer.close();
		
		char[] charBuf = new char[10];
		int readContents;
		Reader in = new FileReader("hyper.txt");
		readContents = in.read(charBuf, 0, charBuf.length);
		for (int i = 0; i < readContents; i++) {
			System.out.printf("%s\n",charBuf[i]);
		}
		
		in.close();
	}
}
