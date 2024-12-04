package practice;

public class Main {
	// 10.23 2
	public static void main(String[] args) {
		Video video = new Video (1000 , 2);
		Movie movie = new Movie (1500 , 3 , "이프온리");
		Drama drama = new Drama (1200 , 4 , "나의 해리에게" , 8);
		
		System.out.println("---★지은이의 대여점★---");
		video.showInfo();
		System.out.println("------------------");
		movie.showInfo();
		System.out.println("------------------");
		drama.showInfo();
	}
}