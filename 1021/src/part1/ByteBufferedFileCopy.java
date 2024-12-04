package part1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteBufferedFileCopy {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("org.mp4");
		OutputStream out = new FileOutputStream("cpy4.mp4");
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);
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
		System.out.println("파일 복사 시간:" + (end - start) / 1000.0);
		System.out.println("복사된 바이트 크기 " + copyByte);
	}
}
