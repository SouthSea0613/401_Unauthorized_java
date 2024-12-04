package part1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferFileCopy {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("org.mp4");
		OutputStream out = new FileOutputStream("cpy2.mp4");
		int copyByte = 0;
		int readLen;
		byte buf[] = new byte[1024];
		long start = System.currentTimeMillis();
		while (true) {
			readLen = in.read(buf);  //1번에 최대 1024byte 읽어냄
			if (readLen == -1)
				break;
			out.write(buf, 0, readLen); // buf배열에 인덱스[0]부터 readLen바이트를 저장한다.
			copyByte += readLen;
		}
		long end = System.currentTimeMillis();
		in.close();
		out.close();
		System.out.println("파일 복사 시간:"+(end-start)/1000.0);
		System.out.println("복사된 바이트 크기 " + copyByte);
	}
}
