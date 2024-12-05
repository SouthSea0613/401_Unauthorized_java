package part2;
//클래스와 객체(인스턴스)

public class Ex01 {
	public static void main(String[] args) {
//10진수   2진수    8진수     16진수
//0		0  		0			0
//1 		1		1			1
//2		10		2			2
//3		11
//4		100
//5		101
//6		110
//7		111 	7
//8		1000	10
//9		1001	11 			9
//10		1010	12			a - 10번째
//11		1011	13			b - 11번째
//12		1100	14			c - 12번째
//13		1101	15			d - 13번째
//14		1110	16			e - 14번째
//15		1111	17			f - 15
//16		10000	20			10 -16
//..
//20
		System.out.printf("%d, %x \n",2550000, 2550000);
		System.out.printf("%x, %d \n",0x26e8f0,0x26e8f0);

//		Student std1=new Student("cha",1,"안산");
//		Student std2=null;  //아무것도 참조하지 않음
//		std2=std1;  //참조값 복사
//		std2.showInfo();
//		std1.showInfo();
//		System.out.println(std1);
//		if(std2!=null) {
//			System.out.println(std2);
//		}
		//생성자 호출->초기화->객체(인스턴스) 생성
//		Student kim=new Student("kim",10,"인천");//(인자, 파라미터)
//		Student lee=new Student("lee",11,"서울");
//		Student noname=new Student();//인스턴스(실체), 객체(사물)
////		Student lee=new Student();
//		kim.showInfo();  //호출call-->메소드 실행-->리턴 
//		lee.showInfo();
//		noname.showInfo();
//		kim.study();
//		lee.exam();
	}
}//Ex01 class end
