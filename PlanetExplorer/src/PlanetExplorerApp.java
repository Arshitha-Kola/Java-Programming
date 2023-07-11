import java.util.Scanner;

public class PlanetExplorerApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		PlanetExplorer explorer = new PlanetExplorer();
		System.out.printf("%.2f",explorer.calculateSurfaceArea(r));	
	}
}
