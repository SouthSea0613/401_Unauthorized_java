package dto;
public class Student {
	private String name;
	private String birth;
	private int java;
	private int oracle;
	private int web;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", birth=" + birth + ", java=" + java + ", oracle=" + oracle + ", web=" + web
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getOracle() {
		return oracle;
	}
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	
	
	
}
