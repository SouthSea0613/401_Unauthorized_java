package part1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest2 {
	public static void main(String[] args) throws FileNotFoundException {
		OutputStream os = new FileOutputStream("output2.txt"); //뒤에 true붙이면 뒤에 이어서 붙여서출력 아니면 새로 덮쓰.
		try(os) { //auto close지원
			byte[] bs = new byte[26];
			byte data = 65; //A==65
			for(int i=0; i<bs.length; i++) {
				bs[i] = data++;
			}
			//os.write(bs); // A-----Z
			os.write(bs,2,10); //idx2부터 10자 쓰기
		}catch (IOException e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
