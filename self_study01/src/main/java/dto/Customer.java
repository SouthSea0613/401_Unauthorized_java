package dto;

public class Customer {
	private int custno;
	private String custname;
	private String phone;
	private String address;
	private String joindate;
	private String grade;
	private String city;
	
	public Customer(int custno, String custname, String phone, String address, String joindate, String grade, String city) {
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.address = address;
		this.joindate = joindate;
		this.grade = grade;
		this.city = city;
	}
	
	public int getCustno() {
		return custno;
	}
	
	public String getCustname() {
		return custname;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getJoindate() {
		return joindate;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public String getCity() {
		return city;
	}
}
