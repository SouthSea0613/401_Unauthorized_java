package dto;

public class Student {
	private String name;
	private String birth;
	private int java;
	private int oracle;
	private int web;
	
	public Student(String name, String birth, int java, int oracle, int web) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.birth = birth;
		this.java = java;
		this.oracle = oracle;
		this.web = web;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBirth() {
		return birth;
	}
	
	public int sum() {
		return java + oracle + web;
	}
	
	public int average() {
		return sum() / 3;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", " + birth + ", " + java + ", " + oracle + ", " + web;
	}
}