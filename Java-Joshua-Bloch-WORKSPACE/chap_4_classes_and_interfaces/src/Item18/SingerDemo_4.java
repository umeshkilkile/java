package Item18;

public class SingerDemo_4 implements Singer_1 {

	@Override
	public AudioClip sing(Song s) {
		return new AudioClip();
	}

	public static void main(String[] args) {
		SingerDemo_4 obj = new SingerDemo_4();
		obj.sing(new Song());
	}
}
