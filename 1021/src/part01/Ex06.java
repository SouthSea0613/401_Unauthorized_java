package part01;

import java.io.*;

public class Ex06 {
	public static void performanceTest(DataOutputStream dataOut) throws IOException {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 10000; j++) {
				dataOut.writeDouble(12.345); // 약 80MB 크기의 데이터를 파일에 저장
			}
		}
		dataOut.flush(); // 출력버퍼의 마지막 데이터까지 완전히 전송이후 시간측정 위해
		long endTime = System.currentTimeMillis();

		System.out.println("경과시간: " + (endTime - startTime) * 0.001);
	}

	public static void main(String[] args) throws IOException {
		DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("data1.txt"));
		performanceTest(dataOut);
		dataOut.close();	// 출력버퍼 삭제 후 스트림 종료

		BufferedOutputStream bufFilterOut = new BufferedOutputStream(new FileOutputStream("data2.txt"), 1024 * 100);
		DataOutputStream dataBufOut = new DataOutputStream(bufFilterOut);
		performanceTest(dataBufOut);
		dataBufOut.close();
	}
}
