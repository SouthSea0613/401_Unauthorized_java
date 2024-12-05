package part01;

public class Ex01 {

	public static void main(String[] args) {
		int[] score = {4, 5, 2, 1, 3}; // 같은 형식의 데이터를 쉽게 관리할수있기때문
		int min = score[0], min_seq = 0, max = score[0], max_seq = 0;
		//[인덱스 0], [변수=정수형태의 양수] 변수로 지정할땐 변수 설정을 먼저해야함
		for (int i = 1; i < score.length; i++) {
			if (min > score[i]) {
				min = score[i];
				min_seq = i;
			}
			
			if (max < score[i]) {
				max = score[i];
				max_seq = i;
			} //for 문을 두번쓰면 10번 반복, 포문 안에 이프문 두개 쓰면 다섯번 반복하면됨
		}
		
		System.out.println("최소값 : " + (min_seq + 1) + "번째, " + min);
		System.out.println("최대값 : " + (max_seq + 1) + "번째, " + max);
	}

}
