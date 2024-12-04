package part03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		HashMap<String, List<?>> map = new HashMap<String, List<?>>();
		
		ArrayList<Person> list1 = new ArrayList<Person>();
		list1.add(new Person("남해", 12));
		list1.add(new Person("동해", 13));
		map.put("1번", list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("남해");
		list2.add("서해");
		map.put("2번", list2);
	}
}
