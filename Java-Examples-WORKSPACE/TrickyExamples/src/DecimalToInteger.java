import java.math.BigDecimal;

public class DecimalToInteger {
	public static void main(String[] args) {

		String quantity = "0.0";
		
		BigDecimal bigDecimal = new BigDecimal(quantity);
		
		System.out.println("Input  : " + bigDecimal);
		
		quantity = adjustDecimalQuantity(bigDecimal.toString());

		bigDecimal = new BigDecimal(quantity);
		
		System.out.println("Output : " + bigDecimal);
	}

	public static String adjustDecimalQuantity(String quantity) {
		
		if (quantity != null && !quantity.isEmpty()	&& quantity.lastIndexOf(".") > 0) {

			int decimal = Integer.valueOf(quantity.substring(quantity.lastIndexOf(".") + 1));

			if (decimal > 0) {
				return quantity;
			} else {
				quantity = quantity.substring(0, quantity.lastIndexOf("."));
			}
		}
		return quantity;
	}
}
