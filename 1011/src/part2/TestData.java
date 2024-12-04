package part2;

public class TestData {
	private boolean key;
	private String cigar;
	private String bag;
	private String aaa;
	
	public boolean isKey() {
		return key;
	}

	public void setKey(boolean key) {
		this.key = key;
	}

	public String getCigar() {
		return cigar;
	}

	public void setCigar(String cigar) {
		this.cigar = cigar;
	}

	public String getBag() {
		return bag;
	}

	public void setBag(String bag) {
		this.bag = bag;
	}

	public String getAaa() {
		return aaa;
	}

	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

	public void setTestData(boolean key, String cigar, String bag, String aaa) {
		this.key = key;
		this.cigar = cigar;
		this.bag = bag;
		this.aaa = aaa;
	}
	
}
