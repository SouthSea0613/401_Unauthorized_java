package part2;

class Add{
	void add(int a, int b) {System.out.println(a+b);}
}
class Sub{
	void add(int a, int b) {System.out.println(a-b);}
}
class Mul{
	void add(int a, int b) {System.out.println(a*b);}
}
class Div{
	void add(int a, int b) {System.out.println(a/b);}
}

public class Calculator {
	private Add add=new Add();	
	private Sub sub=new Sub();	
	private Mul mul=new Mul();	
}
