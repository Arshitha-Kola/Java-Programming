
public class JourneyCalculatorApp {
	public static void main(String[] args) {
		JourneyCalculator j = new JourneyCalculator();
		double a = j.calculateDistance(60.0,1.5);
		System.out.printf("%.2f",a);
	}
}
