package Looping;

import java.util.Scanner;

public class WhileUserControlled {
	
	static Scanner userInput = new Scanner(System.in);

	public WhileUserControlled() {
	}

	public static void main(String[] args) {
		// RUNNING A WHILE LOOP UNTIL THE USER REQUESTS IT TO STOP
		
		String contiYorN = "Y";
		int h = 1;
		
		while(contiYorN.equalsIgnoreCase("y")){
			System.out.println(h);
			System.out.println("Continue Y or N? ");
			contiYorN = userInput.nextLine(); //Accept a string input from user
			h++;
		}

	}

}
