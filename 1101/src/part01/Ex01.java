package part01;

public class Ex01 {
	public static void main(String[] args) {
		// 오라클 드라이버 로딩
		JdbcCrud jc = new JdbcCrud();
		
		jc.connect();
//		jc.select("CCC");
//		jc.insert("EEE", "이이", "남", 50);
//		jc.update("씨씨", "남해");
//		jc.delete("DDD");
		jc.selectAll();
		jc.close();
	}
}