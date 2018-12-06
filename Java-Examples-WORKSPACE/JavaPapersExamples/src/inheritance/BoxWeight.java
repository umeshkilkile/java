package inheritance;

public class BoxWeight extends Box {
	int dimension;
	public BoxWeight(int x, int y, int z, int m) {
		super(x, y, z);
		dimension = m;
	}
}
