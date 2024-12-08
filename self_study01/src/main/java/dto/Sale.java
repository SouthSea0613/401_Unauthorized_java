package dto;

public class Sale {
	private int custno;
	private String custname;
	private String grade;
	private int totalSales;
	
	public Sale(int custno, String custname, String grade, int totalSales) {
		this.custno = custno;
		this.custname = custname;
		this.grade = grade;
		this.totalSales = totalSales;
	}
	
	public int getCustno() {
		return custno;
	}
	
	public String getCustname() {
		return custname;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public int getTotalSales() {
		return totalSales;
	}
}
