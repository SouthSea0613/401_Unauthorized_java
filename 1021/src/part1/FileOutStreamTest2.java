package part1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutStreamTest2 {
	public static void main(String[] args) throws FileNotFoundException {
		OutputStream os = new FileOutputStream ("output2.txt", true);
		try ( os) {
			byte [] bs = new byte[26];
			byte data = 65; // A==65
			for (int i=0; i<bs.length; i++) {
				bs[i]=data++;
			}
			//bs[5]=13;
			//os.write(bs);
			os.write(bs,2,10); // A----Z
		}catch (IOException e ) {
			System.out.println("예외발생");
			e.printStackTrace();
		}
		System.out.println("end");
		
	}
}
