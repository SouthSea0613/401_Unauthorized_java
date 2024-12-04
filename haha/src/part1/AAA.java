package part1;
//68P 문제2번
class BBB{
	public void showData() {
		
	}
}





class AAA {
	
	public <T extends BBB> void simpleMethod(T param) {
		param.showData();
		System.out.println(param);
	}
}

//새로운 클래스에 showData의 메소드를 정의 후 T(제네릭) 이 showData 메소드가 정의된 클래스를 상속하면 빨간줄 사라짐.
//근데 showData 안에 어떤 내용이 있는지 모르니(int나.. String이나..)상속하였을때, 문제가 될 수 있다. 