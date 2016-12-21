/**
 * 
 */
package JavaPractice;

/**
 * @author Jean-Yves Kwibuka
 *
 */

//Importing: Direct inclusion of built-in Java Libraries into your program
import java.util.Scanner;
//The above is one Library import but to import every java.util library you'd:
import java.util.*;

public class UserInputAndMaths {

	static Scanner userInput = new Scanner(System.in);
	
	//CONSTRUCTOR:
	public UserInputAndMaths() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter your favourite number: ");
		
		/*A Conditional statement.
		 * if() will perform the task IF the condition between the brackets is met!
		 * hasNetInt() asks, IS the next thing typed into the system an Integer?
		 * You can ask it for any of the other primitive types such as hasNextDouble, Boolean, byte...etc*/
		if(userInput.hasNextInt()){
			int numberEntered = userInput.nextInt();
			System.out.println(numberEntered+" is a great number. It's my favourite too.");
			//Basic cool things you can do. Arithmetics.
			System.out.println("Did you know that "+numberEntered+" x "+numberEntered+" = "+numberEntered*numberEntered+"?");
			System.out.println("OR did you know that "+numberEntered+" / "+2+" = "+numberEntered/2+"?");
			System.out.println("OR did you know that "+numberEntered+" + "+42+" = "+(numberEntered+42)+"?");
			System.out.println("Or did you know that "+numberEntered+" - "+17+" = "+(numberEntered-17)+"?");
			//Modulus differs from division because it returns the remainder of the division. e.g:
			int remainder = numberEntered%3;
			System.out.println("Or most interestingly, did you know that "+numberEntered+" % "+3+" = "+remainder+"?");
			
			//Saving a result back into the original variable after a calculation (shorthand of doing so)
			int savingBackIn = numberEntered += 20;
				numberEntered -= 20; //quick reset so I can show the long way!!
			//the long way would be
			numberEntered = numberEntered + 20;
				numberEntered -= 20; //quick reset again so we don't lose the number they entered!!
			System.out.println("Lets quickly add 20 to your "+numberEntered+" and we get "+savingBackIn+"!!");
			
			//How to increment by one-after calculation(useful in loops)
			System.out.println(numberEntered++);
			//How to decrement by one-after calculation(useful in loops)
			System.out.println(numberEntered--);
			//How to increment by one-before calculation(useful in loops)
			System.out.println(++numberEntered);
			//How to decrement by one-before calculation(useful in loops)
			System.out.println(--numberEntered);
			
			//==============MATH FUNCTIONS WITHIN JAVA=============================
			
			//Finding an absolute value
			int numberABS = Math.abs(numberEntered);
			System.out.println("The Absolute Value of "+numberEntered+" = "+numberABS);
			//comparing what's bigger
			int whichIsBigger = Math.max(39, numberEntered);
			System.out.println("What's bigger between 39 or "+numberEntered+"? Of course, "+whichIsBigger+" is bigger!!");
			//comparing what's smaller
			int whichIsSmaller = Math.max(69, numberEntered);
			System.out.println("What's bigger between 69 or "+numberEntered+"? Of course, "+whichIsSmaller+" is smaller!!");
			//finding a square root
			double squareRoot = Math.sqrt(3.14);
			System.out.println("The Square root of 3.14 = "+squareRoot);
			//Rounding a number up
			int roundedUp = (int) Math.ceil(6.93); //I cast the answer to an integer because the rounded number wont need a decimal place
			System.out.println("6.93 rounded up = "+roundedUp);
			//Rounding a number down
			int roundedDown = (int) Math.floor(6.93); //I cast the answer to an integer because the rounded number wont need a decimal place
			System.out.println("6.93 rounded down = "+roundedDown);
			
			//Rounding a number automatically when it's above or below .5
			int round = (int) Math.round(2.66); //I cast the answer to an integer because the rounded number wont need a decimal place
			System.out.println("2.66 rounded automatically = "+round);
			//Rounding a number automatically when it's above or below .5
			int rounded = (int) Math.round(6.23); //I cast the answer to an integer because the rounded number wont need a decimal place
			System.out.println("Where as 6.23 rounded automatically = "+rounded);
			
			//Getting a random number
			//Between 0 and whatever number you define
			int random = (int) (Math.random() * 10);//10 is the Max number you don't want to show up!
			System.out.println("Random number generated = "+random);
			
			
		}else{//What to do when condition isn't met
			System.out.println("Please enter an integer next time!");
		}
	}

}
