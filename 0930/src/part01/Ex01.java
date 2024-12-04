package part01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 증감연산자 : ++, --
		// https://codingadinga.tistory.com/11	
		int num = 1;
		num++;
		System.out.println(num);	// 2
		System.out.println(num++);	// 2(3안나옴)
		++num;	// 4
		System.out.println(++num);	// 5나옴
		
		// 3항연산자 : boolean ? (true) : (false)
		System.out.println((num > 4) ? true : false);
		/*
		if (num > 4) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		*/
	}

}
