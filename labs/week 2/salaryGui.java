import java.util.*;
import javax.swing.JOptionPane;

public class Salary
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
        double normal,extra,total;
        JOptionPane.showInputDialog(null,"Week 1\n.Please Enter number of normal hours:");
        normal = console.nextDouble();
        JOptionPane.showInputDialog(null,"Please Enter number of extra hours: ");
	extra = console.nextDouble();
        total = 10*normal+15*extra;
	JOptionPane.showInputDialog(null,"Week 2\nPlease Enter number of normal hours: ");
        normal = console.nextDouble();
        JOptionPane.showInputDialog("Please Enter number of extra hours: ");        
	extra = console.nextDouble();
        total += 10*normal+15*extra;

        
	if (total < 500) {
		total = total * 0.95;
		JOptionPane.showMessageDialog(null,"5% bonus applied");
	}

	JOptionPane.showMessageDialog(null,"Total salary is: "+total+"\n");
    }
}
