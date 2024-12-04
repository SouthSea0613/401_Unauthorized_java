package part1;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataBufferedFilterPerformance {
	public static void performanceTest(DataOutputStream dataOut) 
			throws IOException {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++)
			for (int j = 0; j < 10000; j++)
				dataOut.writeDouble(12); // 약 80MB 크기의 데이터를 파일에 저장
		//dataOut.flush(); // 출력버퍼의 마지막 데이터까지 완전히 전송이후 시간측정 위해
		long endTime = System.currentTimeMillis();
		System.out.println("경과시간: " + (endTime - startTime));
	}

	public static void main(String[] args) throws IOException {
		OutputStream out1 = new FileOutputStream("data1.bin");
		DataOutputStream dataOut = new DataOutputStream(out1);
		performanceTest(dataOut);
		dataOut.close();  //flush()출력버퍼 삭제->스트림 종료
		OutputStream out2 = new FileOutputStream("data2.bin");
		BufferedOutputStream bufFilterOut = new BufferedOutputStream(out2, 1024 * 100);
		DataOutputStream dataBufOut = new DataOutputStream(bufFilterOut);
		performanceTest(dataBufOut);
		dataBufOut.close();//flush()출력버퍼 삭제->스트림 종료
	}
}