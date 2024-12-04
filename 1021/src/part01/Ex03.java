package part01;

import java.io.*;

public class Ex03 {
	public static void main(String[] args) throws IOException{
		InputStream in = new FileInputStream("org.mp4");
		OutputStream out = new FileOutputStream("cpy.mp4");
		
		int copyByte = 0;
		int readLen;
		byte buf[] = new byte[1024];	// 임시기억공간
		long start = System.currentTimeMillis();
		while (true) {
			readLen = in.read(buf);	// 최대 1024Byte씩 읽어옴(병렬처리)
			if (readLen == -1)
				break;
			out.write(buf, 0, readLen); // buf배열에 인덱스[0]부터 readLen바이트를 저장한다.
			copyByte += readLen;
		}
		long end = System.currentTimeMillis();
		in.close();
		out.close();
		
		System.out.printf("복사된 바이트 크기 : %d\n", copyByte);
		System.out.printf("경과 시간 : %.3f\n", (end - start) * 0.001);
	}
}
