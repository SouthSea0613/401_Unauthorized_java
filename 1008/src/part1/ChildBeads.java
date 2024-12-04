package part1;

public class ChildBeads {
	private int beads;

	public ChildBeads(int beads) {
		super();
		this.beads = beads;
	}

	public void showBeadsNum() {
		System.out.println("보유 구슬 갯수: "+beads); // beads앞에 this.생략 -> this는 현재 진행중인 소속
		
	}
									//참조변수 1,2 일 수 있기에 숫자 지움
	public void obtainBead(ChildBeads child, int num) {
		//beads+=num; //beads 는 차일드1거 (필드가 1임)
		//child.beads-=num; //차일드는 차일드2 임 잃은애라
		int obtainNum=child.loseBead(num); //1개의 메소드에는 1개의 업무지시만
		beads+=obtainNum; 
	}
	private int loseBead(int num) {
		if(beads<num) {  		  //밑천이 부족
			int reBeadsNum=beads; //10
			beads=0;
			return reBeadsNum; //10리턴
		}
		beads-=num;
		return num; // 20
	}
	

 	}

		


