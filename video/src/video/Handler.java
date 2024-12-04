package video;

public class Handler {
	public static void main(String[] args) {
		
		Video video = new Video(500,3);
		video.showInfo();
		
		Movie movie = new Movie(400, 4, "토이스토리");
		movie.showInfo();
		
		Drama drama = new Drama(600, 6, "남바다", 8);
		drama.showInfo();
	}
}
