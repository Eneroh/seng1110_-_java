import javax.swing.*;
public class SMSGui
{

	public static void main (String[] args)
	{
		int count;
		double cost;
		String str;

		count = Integer.parseInt(JOptionPane.showInputDialog("Input number of messages: "));

		cost = 10 + 0.22 * count;
		str = "total cost = "+cost;

		JOptionPane.showMessageDialog(null, str);
	}
}
