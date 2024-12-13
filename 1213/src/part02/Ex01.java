package part02;

import java.util.Arrays;

//스트림 이란? 
//배열, 컬렉션을 대상으로 일관성 있는 연산으로 자료처리를 쉽고 간단하게 함.
//한번 생성하고 사용한 스트림은 재사용 할 수 없음
//스트림을 생성하여 연산을 수행하면 스트림은 소모됨
//스트림 연산은 기존 자료를 변경하지 않음(별도 메모리에 생성됨)
//스트림 연산은 중간 연산과 최종 연산으로 구분됨.
//중간연산(filter(),map(),sorted()등)은 여러 개의 연산이 적용될수 있지만 최종 연산(forEach(),sum(),count()등)은 마지막에 한번만 적용됨
//최종 연산이 호출되어야 중간 연산에 대한 수행이 이루어지고 그 결과가 만들어짐
//따라서 중간 연산에 대한 결과를 연산 중에 알수 없음, 이를 "지연연산(lazy evaluation)"이라고 함.
//지연연산(lazy evaluation) 장점: 필요한 시점까지 불필요한 계산을 피함.

public class Ex01 {
	public static void main(String[] args) {
		double[] arr = {1, 2, 3, 4, 5};
		
		Arrays.stream(arr).forEach(n -> System.out.printf("%f\n", n));
		System.out.printf("f\n", Arrays.stream(arr).sum());
	}
}
