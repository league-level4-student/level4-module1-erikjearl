package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("It is Sunday");
			break;
		case "Monday":
			System.out.println("It is Monday");
			break;	
		case "Tuesday":
			System.out.println("It is Tuesday");
			break;
		case "Wednesday":
			System.out.println("It is Wednesday");
			break;
		case "Thursday":
			System.out.println("It is Thursday");
			break;
		case "Friday":
			System.out.println("It is Friday");
			break;
		case "Saturday":
			System.out.println("It is Saturday");
			break;
		default:
			System.out.println("oops");
			break;
		}
	}
}
