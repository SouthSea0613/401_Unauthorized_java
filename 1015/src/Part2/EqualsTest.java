package Part2;

class Student implements Cloneable{ //복제할 수 있는 이라는 인터페이스를 구현 해야함. =인스턴스 를 복제하는건 허용안함 위험함
	private int sNo;
	private String name;
	public Student(int sNo, String name) { //생성자
		this.sNo=sNo;
		this.name=name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); //public이 아니여서 .찍고 안 보였어 protected 가 public 이 크기때문에 퍼블릭으로 변경 가능.
	}

	@Override
	public String toString() {
		//return sNo+""; +"" 로 변환
		return sNo+","+name;
	}
	
	@Override
	public int hashCode() {
		return sNo%2; //학번이 같으면 같은 그룹으로 / 1 or 0 / 해시값: 메모리의 그룹번호(넘버)
		
	}
	@Override
	public boolean equals(Object obj) { 
		Student cmp=(Student)obj; //=std2
		if(this.sNo==cmp.sNo && name.equals(cmp.name)) { //this.sNO = std1 , ((Student)obj.sNO = std2
			return true; //equals는 내용비교 목적으로,, 같냐 묻는겨
		}
		return false;
	}

}
public class EqualsTest {
	public static void main(String[] args) {
		Student std1=new Student(100,"Lee"); //인스턴스
		Student std2=new Student(100,"Lee");
    	System.out.println(std1==std2); //학번, 이름 //==참조값 비교 false
		System.out.println(std1.equals(std2)); //(동등)내용비교 재정의 
		
		System.out.println(std1.hashCode()); // 해시코드 재정의 안 하면 주소값 나옴, 위아래 다르게 돼.
		System.out.println(std2.hashCode());
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(System.identityHashCode(std1)); //실제위치, 메모리위치
		System.out.println(System.identityHashCode(std2));
		
		String str1=new String("aaa"); //객체
		String str2=new String("aaa");
		System.out.println(str1.hashCode()); //메모리의 그룹(폴더)번호
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1)); //이게 진짜 위치
		System.out.println(System.identityHashCode(str2));
	}
}
