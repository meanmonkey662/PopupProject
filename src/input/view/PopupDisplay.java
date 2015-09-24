package input.view;

import javax.swing.JOptionPane;
/**
 * This class provides popups for input and output.
 * @author kkoc6943
 *
 */
public class PopupDisplay
{

	
	public String getAnswers(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
