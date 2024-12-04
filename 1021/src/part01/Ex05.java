package part01;

import java.io.*;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream("org.mp4"));
		BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("cpy.mp4"));
		
		int copyByte = 0;
		int bData;
		long start = System.currentTimeMillis();
		while (true) {
			bData = bin.read();
			if (bData == -1)
				break;
			bout.write(bData);
			copyByte++;
		}
		long end = System.currentTimeMillis();
		bin.close();
		bout.close();
		
		System.out.printf("복사된 바이트 크기 : %d\n", copyByte);
		System.out.printf("경과 시간 : %.3f\n", (end - start) * 0.001);
	}
}
