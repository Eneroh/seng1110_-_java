import java.util.*;

public class Sms
{
	public static void main (String[] args)
	{
		Scanner console = new Scanner(System.in);
		double normal,extra,total;
		System.out.println("Enter number of sms messages: ");
		normal = console.nextDouble();
		System.out.println("Enter unit cost of each message: ");
		extra = console.nextDouble();
		System.out.println("Enter set-up cost of each message: ");
		total = normal+extra;
		System.out.println("Total cost is: " +total+"\n");
	}
}
