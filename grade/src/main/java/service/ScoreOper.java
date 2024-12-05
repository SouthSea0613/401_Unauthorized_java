package service;

import dto.Student;

public class ScoreOper {

	public int getAge(String birth) {
		
		return 2024-Integer.parseInt(birth.substring(0,4));
	}

	public int getTotal(Student std) {
		
		return std.getJava()+std.getOracle()+std.getWeb();
	}

	public double getAvg(int total, int cnt) {
		
		return total/cnt;
	}

	public String getGrade(int avg) {
		//90점이상 : A0, 95점이상 : A+
		int v10=avg/10;
		int v1=avg%10;
		String grade="";
		if(v10>=9) grade="A";
		else if(v10>=8) grade="B";
		else if(v10>=7) grade="C";
		else if(v10>=6) grade="D";
		else grade="F";
		
		if(v10==10) grade+="+";
		else if(v1>=5) {
			grade+="+";
		}else {
			grade+="0";
		}
		return grade;
	}

}
