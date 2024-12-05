package part1;

public class JdbcCrudTest {
	public static void main(String[] args) {
		JdbcCrud jc=new JdbcCrud();
		jc.connect();
		//jc.selectGender("남", 10); 
		//jc.insert("III","아이","여",20);
		jc.selectAll();
		
		jc.close();
	}
}
