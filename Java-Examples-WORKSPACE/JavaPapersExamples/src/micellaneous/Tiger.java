package micellaneous;

public class Tiger {
	private String color;
	private String stripePattern;
	private int height;

	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			Tiger tiger = (Tiger) object;
			if (this.color == tiger.getColor() && this.stripePattern == tiger.getStripePattern() && this.height == tiger.getHeight()) {
				result = true;
			}
		}
		return result;
	}

	// just omitted null checks
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 7 * hash + this.color.hashCode();
		hash = 7 * hash + this.stripePattern.hashCode();
		return hash;
	}

	public String getColor() {
		return color;
	}

	public String getStripePattern() {
		return stripePattern;
	}
	public int getHeight(){
		return height;
	}

	public Tiger(String color, String stripePattern, int height) {
		this.color = color;
		this.stripePattern = stripePattern;
		this.height = height;

	}
}
