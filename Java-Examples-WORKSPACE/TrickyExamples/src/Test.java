
import java.math.BigDecimal;
import java.util.function.Function;

public class Test {
	public static void main(String[] args) {
		Function<String, Integer> strToInt = Integer::parseInt;
		Integer i1 = strToInt.apply("12");
		System.out.println(i1);
		
		BigDecimal bd = new BigDecimal("0").setScale(4);
		
		System.out.println(bd);
		
		
	}
}
