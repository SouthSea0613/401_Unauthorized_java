package part01;

public class ChildBeads {
	private int beads;

	public ChildBeads(int beads) {
		this.beads = beads;
	}
	
	public int getBeads() {
		return beads;
	}
	
	public void setBeads(int beads) {
		this.beads = beads;
	}

	public void plusBeads(int beads) {
		setBeads(getBeads() + beads);
	}
	
	public int loseBeads(int a) {
		if (getBeads() < a) {
			int tmp = getBeads();
			setBeads(0);
			return tmp; 
		}
		else {
			setBeads(beads - a);
			return a;
		}
	}
	
	public void obtainBeads(ChildBeads child, int a) {
		plusBeads(child.loseBeads(a));
	}
	
	public void showBeadsNum() {
		System.out.printf("%d\n", getBeads());
	}
}
