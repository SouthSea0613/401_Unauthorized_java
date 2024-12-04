package part1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
//배열은 빈번한 삭제와 추가 시 속도가 느려짐 (오버헤드 크다)
//LinkedList는 구현이 어려움 (연결이라서 어느 것 하나 딱 찾을 수 없고 연결연결해서 찾아야 함)
//따라서 빈번한 삭제 추가 시 오버헤드가 작음
//hashSet은 데이터 저장 순서를 절대 보장하지 않음, 중복 값 허용하지 않음(예를 들면 로또라고 생각하면 이해가 쉬움)

//public class ArrayListTest {
//	public static void main(String[] args) {
//		//★Int 배열
//		ArrayList<Integer> list = new ArrayList<>(); // 정수를 넣고 싶을 때 int를 넣는게 아닌 풀네임
//		// LinkedList 배열이 아닌 연결리스트
//		list.add(11);
//		list.add(22);
//		list.add(22);
//		list.add(44);
//		list.add(44);
//		list.add(11);
//		
//		//Iterator 사용하여 참조, 삭제 처리
////		Iterator<Integer> itr = list.iterator();
////		while (itr.hasNext()) {
////			int num = itr.next(); // == itr.getNext();
////			System.out.println(num);
////			if(num == 11) {
////				itr.remove();
////			}
////		}
////		System.out.println(num); 
//	
//		//요소 참조
////		for(int i = 0; i < list.size(); i++) {
////			System.out.println(list.get(i)); 
////	}
//	}
//}

public class ArrayListTest {
	public static void main(String[] args) {
		//★문자열 배열★
		ArrayList<String> list = new ArrayList<>();
		list.add("11");
		list.add("22");
		list.add("22");
		list.add("44");
		list.add("44");
		list.add("11");
		
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext()) {
//			String num = itr.next();
//			System.out.println(num);
//			if(num.equals("11")) {
//				//itr.remove();
//			}
//		}
		
		//for 문을 사용한 참조, 삭제 처리
		for(int i = 0; i < list.size(); i++) {
			String num = list.get(i);
			System.out.println(num);
			if(num.equals("11")) {
//				list.remove(i); //인덱스로 삭제!
				list.remove(num); //참조값으로 삭제(HashSet)
				i--;
			}
		}
		System.out.println("---------------");
		System.out.println(list);
	}
}