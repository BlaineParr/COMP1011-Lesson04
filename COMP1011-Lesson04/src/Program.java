import javax.swing.JOptionPane;

/**
 * 
 * 
 * @author Blaine Parr
 * @version January 29, 2015
 */
public class Program 
{
	public static void main(String[] args) 
	{
		String firstNumber = "";
		String secondNumber= "";
		
		try
		{
			firstNumber = JOptionPane.showInputDialog("Enter First Integer");
			secondNumber = JOptionPane.showInputDialog("Enter Second Integer");
			
			int number1 = Integer.parseInt(firstNumber);
			int number2 = Integer.parseInt(secondNumber);
			
			int sum = number1 + number2;
			
			JOptionPane.showMessageDialog(null, "The Sum is " + sum, "Sum of two Integers", JOptionPane.PLAIN_MESSAGE);
		} //try ends
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Incorrect Values Entered", "ERROR", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} //catch ends
	} //method main ends
} //class Program ends
