package home;

import java.util.Calendar;

public class Age {
	
	//19901010 : 문자 8자리
	//앞에 네자리 추출해서 숫자로 변환
	public int getOperAge(String birth) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		return 2024-Integer.parseInt(birth.substring(0,4));
	}

}
