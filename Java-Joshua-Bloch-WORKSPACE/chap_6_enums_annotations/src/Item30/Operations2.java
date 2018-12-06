package Item30;

import java.util.HashMap;
import java.util.Map;

//Enum type with constant-specific class bodies and data

public enum Operations2 {
	PLUS("+") {
		double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		double apply(double x, double y) {
			return x / y;
		}
	};
	private final String symbol;

	Operations2(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}

	abstract double apply(double x, double y);

	// Implementing a fromString method on an enum type
	private static final Map<String, Operations2> stringToEnum = new HashMap<String, Operations2>();
	static { // Initialize map from constant name to enum constant
		for (Operations2 op : values())
			stringToEnum.put(op.toString(), op);
	}

	// Returns Operation for string, or null if string is invalid
	public static Operations2 fromString(String symbol) {
		return stringToEnum.get(symbol);
	}
}
