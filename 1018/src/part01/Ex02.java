package part01;

import java.util.ArrayList;	// ArrayList 사용을 위한 import
import java.util.Collection;	// Collection 사용을 위한 import
import java.util.List;	// List 사용을 위한 import

public class Ex02 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();	// List는 ArrayList의 부모이므로 가능
		Collection<String> list2 = new ArrayList<String>();	// Collection은 List의 부모이므로 가능
	}
}
