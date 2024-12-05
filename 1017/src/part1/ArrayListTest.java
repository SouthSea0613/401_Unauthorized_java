package part1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class ArrayListTest {


	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("11");
		list.add("22");
		list.add("33");
		list.add("44");
		list.add("44");
		list.add("11");
		
		
		//Iterator(반복자) 로 참조
//		Iterator <String> itr= list.iterator();
//		while(itr.hasNext()) {
//			String num = itr.next();
//			System.out.println(num); //저장된 값을 가지고와서 출력 후 비교
//			if (num.equals("11")) {
//			//iterator.remove();
//			}
//		}
		
		for (int i = 0; i <list.size(); i++) {
			String num=list.get(i);
			System.out.println(num);
			if(num.equals("11")) { 
				list.remove(i);
				i--;
	
				//list.remove(num);
			}
		}		 //요소 참조
		System.out.println("---------------");
		 //인덱스로 삭제  기본 배열은 중간에 빠지면안됨.
		//새반복자 ( 리모콘 )
		Iterator<String> itr= list.iterator();
		while(itr.hasNext()) {
			//String num = itr.next();
		System.out.println(itr.next());
		}
	}
}
