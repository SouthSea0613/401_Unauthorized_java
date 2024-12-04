package part3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File myFile = new File("C:\\upload\\a.txt"); //검증없이 인스턴스 생성
		if(myFile.exists()==false) { //검증은 여기서, 있냐 없냐
			System.out.println("a.txt 존재하지 않아서 종료 합니다.");
			//myFile.createNewFile(); //파일만 생성, 사용할 일 없음.
			return;
		}else {
			System.out.println("a.txt 파일이 존재 함");
			//위에서 검증된 a.txt를 읽기스트림 생성
			FileInputStream fis=new FileInputStream(myFile); //9999
			//...읽기 작업
		}
		File reDir = new File("C:\\java\\yourJava");
		if(reDir.isDirectory()==false) {
			System.out.println("C:\\java\\yourJava 폴더를 생성 합니다.");
			reDir.mkdirs(); //상위폴더까지 생성
			//reDir.mkdir(); //최하위 폴더만 생성
		}
		//파일 이동
		File reFile = new File(reDir, "b.txt");
		//C:\\upload\\a.txt --> C:\\java\\yourJava (b.txt)
		myFile.renameTo(reFile);
		System.out.println("이동 완료."); //9999를 안 열면 이동 돼.
	}
}
