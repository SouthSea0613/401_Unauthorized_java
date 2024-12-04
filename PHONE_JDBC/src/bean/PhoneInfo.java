package bean;

public class PhoneInfo {
	private String name;
	private String number;

	public PhoneInfo(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override				
	public int hashCode() {
		return number.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		PhoneInfo num = (PhoneInfo)obj;   
		if(number == num.number)	
			return true;
		return false;	
	}

	@Override
	public String toString() {
		return "이름: "+name+"\n번호: "+number;
	}

	public void showPhoneInfo() {
		System.out.println("name: " + name);
		if (number != null) {
			System.out.println("number: " + number);
		}
	}
}
