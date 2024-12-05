package part3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File myFile=new File("D:\\upload\\a.txt");
		if(myFile.exists()==false) {
			System.out.println("a.txt 존재하지않아서 종료합니다.");
			myFile.createNewFile();	//파일만 생성
			
			return;
		}else {
			System.out.println("a.txt 존재함");
			//위에서 검증된 a.txt를 읽기스트림 생성
			//FileInputStream fis = new FileInputStream (myFile);
			//읽기작업....
		}
		File reDir=new File("bag-eungyeoung:\\java\\yourJava");
		if(reDir.isDirectory()==false) {
			System.out.println("bag-eungyeoung:\\java\\yourJava 폴더를 생성합니다.");
			reDir.mkdirs(); //상위폴더까지 생성
			//reDir.mkdir(); //최하위 폴더만 생성
		}
		//파일이동
		File reFile = new File(reDir,"b.txt") ;
		myFile.renameTo(reFile);
		System.out.println("이동완료");
			
		}
	}

