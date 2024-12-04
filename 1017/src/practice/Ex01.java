package practice;

class AAA { //제네럴클래스 최상위 조상은 Object클래스 < 얘는 무형식적인 객체가 포함되어 있을 수 있으므로 
			//showData라는 형식만드는 메소드를 사용할 수 없음!! > ★위험함 잘 판단하자★
	public <T> void simpleMethod(T param) {
		param.showData();
		System.out.println(param);
	}
}
