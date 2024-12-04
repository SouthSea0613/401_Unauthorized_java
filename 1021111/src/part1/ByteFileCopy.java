package part1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFileCopy {
	public static void main(String[] args) 
			throws IOException {
		InputStream in = new FileInputStream("org.mp4"); // 자바소스와 같은 폴더에 만들것.
		OutputStream out = new FileOutputStream("cpy3.mp4"); // 자동으로 생성된다.
		BufferedInputStream bin=new BufferedInputStream(in);
		BufferedOutputStream bout=new BufferedOutputStream(out);
		
		int copyByte = 0;
		int bData;
		//바이트 스트림 방식<---->문자 스트림 방식
		long start=System.currentTimeMillis();		
		while (true) {
			bData = bin.read(); //1번에 1Byte씩
			if (bData == -1)  //읽기 에러(파일의 끝)
				break;
			bout.write(bData);  //1번에 1Byte씩 
			copyByte++;
		}
		long end=System.currentTimeMillis();
		
		in.close();
		out.close();
		System.out.println("파일복사 시간:"+(end-start)/1000.0+"초");
		System.out.println("복사된 바이트 크기 " + copyByte);
	}
}
