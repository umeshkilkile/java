import java.util.ArrayList;
import java.util.List;

public class BoxUnbox {
	public static void main(String[] args) {
		int i = 100;
		
		List<Integer> l = new ArrayList<>();
		
		l.add(i);
		
		System.out.println(l.get(0) instanceof Integer);
	}
}
