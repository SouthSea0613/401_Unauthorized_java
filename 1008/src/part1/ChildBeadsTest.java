package part1;

public class ChildBeadsTest {
	public static void main(String[] args) {
		//객체지향 프로그래밍: c++, java, 파이썬, C#  //객체는 뉴 로 만듦 - 메세지를 메소드 로 소통
		
				//구슬15개를 소유한 어린이1 
				ChildBeads child1=new ChildBeads(15);
				//구슬9개를 소유한 어린이2
				ChildBeads child2=new ChildBeads(9);
				
				//1차 게임에서 어린이1은 어린이2의 구슬 2개를 획득한다.
				//각각 어린이의 구슬 개수 확인 출력
				child1.obtainBead(child2,2);
				//obtainBead메소드에서 child2.loseBead(2); 호출할것...
				//결과출력:어린이1 17개, 어린이2 7개
				//child1.showBeadsNum(); //17
				//child2.showBeadsNum(); //7
				
				//2차 게임에서 어린이2는 어린이1의 10개를 획득한다.  
				child2.obtainBead(child1,10);
				//obtainBead메소드에서 child1.loseBead(10); 호출할것...
				//결과출력:어린이1 7개, 어린이2 17개
				
				//3차 게임에서 어린이2는 어린이1의 10개를 획득한다.  
				child2.obtainBead(child1,10);
				//obtainBead메소드에서 child1.loseBead(10); 호출할것...
				//결과출력:어린이1 0개, 어린이2 24개
				child1.showBeadsNum(); 
				child2.showBeadsNum(); 
	}
}
