import java.util.*;

public class SMScost {
	
	public static void main (String args[]) {
		Scanner console = new Scanner(System.in);
		int count;
		double cost;

		System.out.print("Input No of Messages: ");
		count = console.nextInt();

		cost = 10 + 0.22 * count;
		
		if (cost >= 50 & cost < 100) {
			System.out.println("5% Discount is applied");
			cost = cost * 0.95;
		}

		else if (cost >= 100) {
			System.out.println("10% Discount is applied");
			cost = cost * 0.90;
		}

		System.out.println("Total Cost is " + cost);
	}
}
