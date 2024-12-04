package part1;

public class JdbcTest {
	public static void main(String[] args) {
		JdbcCrud jc = new JdbcCrud(); // 오라클 드라이버 로딩
		jc.connect();
//		jc.selectAll();
//		jc.select("CCC");
//		jc.insert();
//		jc.selectGender("남" , 10);
//		jc.update("남해","디디");
//		jc.delete("CCC");
		jc.close();
	}
}
