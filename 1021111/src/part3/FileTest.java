package part3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		//File myFile=new File("D:\\upload\\aa.txt");  //검증 없이 생성
		File myFile=new File("D:/upload/a.txt");  //검증 없이 생성
		if(myFile.exists()==false) { //검증
			System.out.println("a.txt 존재하지 않아서 종료합니다.");
			myFile.createNewFile(); //빈 파일만 생성, 사용할 일 없음
			return;
		}
		System.out.println("a.txt존재함");
		//위에서 검증된 a.txt를 읽기스트림 생성
		FileInputStream fis=new FileInputStream(myFile);
		//...읽기 작업
		fis.close();
		//폴더 생성
		File reDir=new File("D:/java/yourJava");
		if(reDir.isDirectory()==false) {
			System.out.println("D:/java/yourJava 폴더를 생성합니다.");
			reDir.mkdirs(); //상위폴더까지 생성
			//reDir.mkdir(); //최하위 폴더만 생성
		}
		//파일 이동
		File reFile=new File(reDir, "b.txt");
		//D:\\upload\\a.txt  -->D:\\java\\yourJava\\b.txt 
		if(myFile.renameTo(reFile)) {
			System.out.println(reFile.getName()+" 이동 완료");
		}else {
			System.out.println(reFile.getName()+" 중복되어 이동 실패");
		}
	}
}
