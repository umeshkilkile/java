package Item18;

public class SongwriterDemo_5 implements Songwriter_2 {

	@Override
	public Song compose(boolean hit) {
		return new Song();
	}

	public static void main(String[] args) {
		SongwriterDemo_5 obj = new SongwriterDemo_5();
		obj.compose(true);
	}
}
