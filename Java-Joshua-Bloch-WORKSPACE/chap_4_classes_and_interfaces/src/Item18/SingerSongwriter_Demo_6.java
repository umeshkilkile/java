package Item18;

public class SingerSongwriter_Demo_6 implements SingerSongwriter_3 {

	@Override
	public AudioClip sing(Song s) {
		return new AudioClip();
	}

	@Override
	public Song compose(boolean hit) {
		return new Song();
	}

	@Override
	public AudioClip strum() {
		return new AudioClip();
	}

	@Override
	public void actSensitive() {
		System.out.println("ActSensitive method");
	}

	public static void main(String[] args) {
		SingerSongwriter_Demo_6 obj = new SingerSongwriter_Demo_6();
		
		obj.sing(new Song());
		obj.compose(false);
		obj.strum();
		obj.actSensitive();
	}
}
