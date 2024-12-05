package part1;

public class Ex01 {
	public static void main(String[] args) {
		//객체 지향 프로그래밍 : C++, java, 파이썬, C#...
		//구슬 15개를 소유한 어린이1
		ChildBeads child1=new ChildBeads(15);
		//구슬 9개를 소유한 어린이2
		ChildBeads child2=new ChildBeads(9);
		
		//1차 게임에서 어린이1은 어린이2의 구슬 2개를 획득한다.
		//각각 어린이의 구슬 개수 확인 출력	
		child1.obtainBead(child2,2);
		//obtainBead메소드에서 child2.loseBead(2); 호출할것..
		//결과 출력 : 어런이1 17개, 어린이2 7개
		child1.showBeadsNum();
		child2.showBeadsNum();
		
		//2차 게임에서 어린이2는 어린이1의 10개를 획득한다.
		child2.obtainBead(child1,10);
		//obtainBead메소드에서 child.loseBead(10); 호출할것...
		//결과 출력 : 어린이1 7개, 어린이2 7개
		
		
	}
}
