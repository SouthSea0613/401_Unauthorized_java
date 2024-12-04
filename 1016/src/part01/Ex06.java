package part01;

import java.util.StringTokenizer;

public class Ex06 {

	public static void main(String[] args) {
		String strData = "111:222:333:444:555";
		StringTokenizer st = new StringTokenizer(strData, ":");
		while (st.hasMoreTokens()) {
			System.out.printf("%s ", st.nextToken());
		}
		
		System.out.printf("\n");
		
		for (String string : strData.split(":")) {
			System.out.printf("%s ", string);
		}
	}

}
