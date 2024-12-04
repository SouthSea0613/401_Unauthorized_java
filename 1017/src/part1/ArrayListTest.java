package part1;

import java.util.ArrayList; //Array, Linked 알고가자
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();  //<Object> 생략 다 받아주니까 <String>으로 정해줬어
		list.add("11");
		list.add("22");
		list.add("22");
		list.add("44");
		list.add("44");
		list.add("11");
		
		//Iterator(반복자) 로 참조
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()){
//			String num=iterator.next(); // .next 가져와~
//			System.out.println(num);
//			if(num.equals("11")) { //문자열 비교는 이퀄스  원래 int 에 == 였어 
//				iterator.remove(); //현재 반복자 요소를 삭제
//				
//			}
//		}
		
		
		for (int i = 0; i < list.size(); i++) {
			String num=list.get(i);
			System.out.println(num);
			if(num.equals("22")) {
				//삭제되면 size가 줄고 뒤에 요소가 앞으로 이동.
				list.remove(i--); //인덱스로 삭제1
				//i--;
				//list.remove(num); //참조값 삭제
			}
		}

		
		System.out.println("=================");
		//새 반복자 리모콘
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
//			int num=iterator.next();
			System.out.println(iterator.next());
		}
//		list.remove(2); //인덱스로 삭제
//		list.add(55); //지우고 추가 하면 뒤로~ 순서를 보장한다 배열은 ! 
//		list.add(66);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i)); //요소 참조
//		}
		
//		System.out.println(list.get(0)); //0,1 이 인덱스
//		System.out.println(list.get(1));
	}
}
