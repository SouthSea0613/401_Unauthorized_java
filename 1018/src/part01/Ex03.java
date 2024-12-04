package part01;

import java.util.Iterator;	// Iterator 사용을 위한 import
import java.util.TreeSet;	// TreeSet 사용을 위한 import

public class Ex03 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(4);	// #1
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(4);	// #1과 중복
		
		System.out.printf("데이터 수 : %d\n", treeSet.size());
		
		// 전체출력 > TreeSet은 순서정렬 및 중복 제거
		Iterator<Integer> iterator = treeSet.iterator();	// 씨ㅣㅣㅣㅣ발 또 iterator
		while(iterator.hasNext()) {
			System.out.printf("%d\n", iterator.next());
		}
	}
}
