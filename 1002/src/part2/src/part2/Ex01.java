package part2;
//클래스와 객체(인스턴스)



 public class Ex01 { //공공의 클래스는 1개만 존재 가능

	public static void main(String[] args) {
//		//길이가 100인 문자열 배열 변수명 kiki
//		String[] kiki = new String[100];
//		// 길이가 50인 정수 배열 변수명 akak
//		int[] akak = new int[50];
//		// TODO Auto-generated method stub
		

		
//		Student std1=new Student(); //("cha",1,"안산"); //new쓸 때 인스턴스가 만들어진다.
		Student std2=new Student("kim",1,"청라");
		std2.setAddr("안산");
		
		
		Student std3=null; // 어떤 객체도 참조하지 않음
		std3=std2;
		System.out.println(std2);
		System.out.println(std3);
		std3.setAddr("서울");
		if(std3==std2) { //참조값 비교
		System.out.println("같은 참조값");
		std3.showInfo();
		std2.showInfo();
		}
		
//		Student std3=null; //아무것도 참조하지 않음.
//		std2=std1; //  참조값을 복사 했다.
//		std2.showInfo();
//		std1.showInfo();
//		System.out.println(std1); //16진수 를 쓰는 이유는 10진수로 하면 너무 길어져서
//		if(std2!=null) {
//			System.out.println(std2);
		}

		
		
		//생성자 1번 호출 -> 초기화 -> 객체(인스턴스) 생성
//		Student kim=new Student("kim",10,"인천"); //인스턴스(실체), 객체(사물)  / (인자, 파라미터)
//		Student lee=new Student("lee",11,"서울");
//		Student noname=new Student();
////		Student kim=new Student();
////		Student lee=new Student();
//		kim.showInfo(); //호출call --> 메소드 내용 실행 --> 리턴
//		lee.showInfo();
//		noname.showInfo();
//		kim.study();
//		lee.exam();
	}
 
 
 //Ex01 class end
