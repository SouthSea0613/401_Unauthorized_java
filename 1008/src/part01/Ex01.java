package part01;

public class Ex01 {
	public static void main(String[] args) {
		ChildBeads child1 = new ChildBeads(15);
		ChildBeads child2 = new ChildBeads(9);
		
		child1.showBeadsNum();
		child2.showBeadsNum();
		
		child1.obtainBeads(child2, 2);

		child1.showBeadsNum();
		child2.showBeadsNum();

		child2.obtainBeads(child1, 10);

		child1.showBeadsNum();
		child2.showBeadsNum();

		child2.obtainBeads(child1, 10);

		child1.showBeadsNum();
		child2.showBeadsNum();
	}
}
