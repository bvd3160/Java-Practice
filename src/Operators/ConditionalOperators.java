package Operators;

public class ConditionalOperators {

	public ConditionalOperators() {
	}

	public static void main(String[] args) {
		/*
		 * CONDITIONAL/TERNARY OPERATORS
		 * 
		 */
		
		int valOne = 23;
		int valTwo = 69;
		
		//Shorthand IF statement
		int biggerVal = (valOne > valTwo)? valOne : valTwo;
		//The above is simply:
		//biggerVal is assigned a value if the condition (in brackets(valOne > valTwo)) is met
		//After ? we see that bigger value will be assigned valOne if condition is true, but valTwo if not.
		System.out.println("Between "+valOne+" and "+valTwo+", the biggerValue = "+biggerVal);
		
		
		
		//THE SWITCH STATEMENT
		//Similar to the if statement but the if-else ladder is of type strict condition check, while switch is of type jump value catching
		
		char grade = 'b';
		switch (grade) { //the key to cycle through
		case 'A':
			System.out.println("Great Job on your A!");
			break; //break means to get out of the switch an jump to the next block of code (the condition has been met)!
		case 'B':
		case 'b'://to check for multiple cases that will do the same thing, just state them under each other.
			System.out.println("Good Job on your B!");
			break;
		case 'C':
			System.out.println("You did Okay with a C!");
			//break; break is not necessary. It's a matter of how you want to use it.
		case 'D':
			System.out.println("You performed badly with a D!");
			break;
		default://the last thing you could be searching for can be set as the default.
			//this block of code will be invoked if the grade doesn't match any of the above. REMEMBER THE VALUES ARE CASE SENSITIVE.
			System.out.println("Sorry, you Failed!");
			break;
		}
	}

}
