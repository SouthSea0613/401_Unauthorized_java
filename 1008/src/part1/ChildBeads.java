package part1;

public class ChildBeads {
	private int beads;
	
	public ChildBeads(int beads) {
//		super();
		this.beads = beads;
	}
	public void showBeadsNum() {
		System.out.println("보유 구슬 갯수: "+beads);
	}
	//child1.obtainBead(child2,2);
	public void obtainBead(ChildBeads child, int num) {
//		beads+=num;
//		child.beads-=num;
		int obtainNum=child.loseBead(num);
		beads+=obtainNum;
	}
	private int loseBead(int num) {
		if(beads<num) { //밑천이 부족할 때
			int reBeadNum=beads;
			beads=0;
			return reBeadNum;
		}
		beads-=num;
		return num;
	}
}
