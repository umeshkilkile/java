import java.math.BigDecimal;

public class Test1 {
	public static void main(String[] args) {
		double lwsCrnRtlPrcAmt = 0;
		double newRetailPrice = 10;
		Double pctChange = (((newRetailPrice - lwsCrnRtlPrcAmt) / lwsCrnRtlPrcAmt) * 100);
		System.out.println(pctChange);
		
		BigDecimal b1 = new BigDecimal("0");
		
		if(b1.equals(BigDecimal.ZERO)){
			System.out.println("Yess");
		}
	}
}
