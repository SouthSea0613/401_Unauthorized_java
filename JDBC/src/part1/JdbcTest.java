package part1;

public class JdbcTest {
	public static void main(String[] args) {
		JdbcCrud jc = new JdbcCrud(); //오라클 드라이버 로딩
		jc.connect();
//		jc.selectAll();
//		jc.select("CCC");
//		jc.insert("GGG", "지지", "여", 30);
//		jc.selectAll(); // AAA~ GGG 출력
//		jc.update(); //특정회원 성별, 나이 변경
//		jc.selectAll();
		jc.delete(); // AAA라는 회원 삭제
		jc.selectAll();
		jc.close();
		
	}
}

