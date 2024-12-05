package part1;

public class JdbcTest {
	public static void main(String[] args) {
		JdbcCrud jc = new JdbcCrud();
		jc.connect();
//		jc.selectAll();
//		jc.select("CCC");
//		jc.insert("GGG","쥐쥐","여",50);
//		jc.selectAll();
		//jc.update();
		//jc.selectAll();
		//jc.delete();
		//jc.selectAll();
		jc.close();
	}
}
