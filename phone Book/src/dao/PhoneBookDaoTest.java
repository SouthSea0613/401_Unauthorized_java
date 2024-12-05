package dao;

public class PhoneBookDaoTest {
	public static void main(String[] args) {
	PhoneBookDao pd = new PhoneBookDao(); 
	pd.connect();
	//pd.insert();
	pd.selectAll();
	//pd.update();
	//pd.selectName();
}
}
