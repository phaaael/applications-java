package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double calculation(double dollarPrice, double dollarAmount) {
		return dollarPrice * dollarAmount * (1 + IOF);
	};
}
