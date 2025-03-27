package entities;

public class Dollar {
	
	public static double dollarPrice = 5.86;
	
	public static double buyDollar(double x) {
		double dollarCalc = dollarPrice * x;
		return dollarCalc + ((dollarCalc * 6)/100);
	}
	
}
