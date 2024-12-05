package video;

public class VideoMain {
	public static void main(String[] args) {
		Movie movie = new Movie (3000,5,"어벤져스 어셈블");
		Drama drama = new Drama (2000,7,"해를 품은 달",16);
		System.out.println("------비디오 영화------");
		movie.showInfo();
		System.out.println("------비디오 드라마------");
		drama.showInfo();
		
				
	}
}
