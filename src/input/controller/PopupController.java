package input.controller;

import input.view.PopupDisplay;
import input.model.Thing;

public class PopupController
{
	private PopupDisplay myPopups;
	private Thing myThing;
	
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		String name = myPopups.getAnswers("Type in your name");
		
		myPopups.displayResponse("You typed in  " + name);
		
		int age = myPopups.getAnswers("Type in your age");
		myPopups.displayResponse("You typed in " + age);
		
		double weight = myPopups.getAnswer("Type in your age")
		myPopups.displayResponse("You typed in " + weight);
		
		myThing = Thing(name, age, weight);
	}
	
	private boolean isInteger(String input)
	{
		booean isInt = false;
		
		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			catch(NumberFormatException error)
			{
				myPopups.displayResponse("You did not type in a valid integer :(");
			}
			
			return isInt;
		}
		
		private boolean isDouble(String input)
		{
			boolean isDouble = false;
			
			try 
		}
	}
}
