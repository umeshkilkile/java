package Item12CHECK;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComapareTo_Demo_1 {
	public static void main(String[] args) {
		Set<BigDecimal> set = new HashSet<BigDecimal>();
		set.add(new BigDecimal("1.0"));
		set.add(new BigDecimal("1.00"));

		System.out.println(set);

		Set<BigDecimal> treeSet = new TreeSet<BigDecimal>();
		treeSet.add(new BigDecimal("1.0"));
		treeSet.add(new BigDecimal("1.00"));

		System.out.println(treeSet);

	}
}
