package Methods;

import java.util.Scanner;

public class Methods {
	
	//Class variables or Fields
	static double myPI = 3.14159;
	static int randomNumber;
	static Scanner newInput = new Scanner(System.in);

	public Methods() {
	}

	public static void main(String[] args) {
		//EVERY METHOD IS CONSTRUCTED LIKE SO:
		/* 1. accessModifier such as public, private, protected...
		 * 2. static
		 * 3. returnType such as int, String, Float, Boolean, etc
		 * OR void if you don't need the method to return anything
		 * 4. methodName can be whatever you want, so long as it starts with lower-case
		 * and isn't a java special word.
		 * 5.() with a list of parameters if your method uses some to do it's task
		 * such as (String firstName, int age, double grade)
		 * 6. {
		 * 		Whatever you'd like your method to do goes here - between two curly braces.
		 * }
		*/
		/*static in the example above is used when you define and then want to use a method
		that isn't part of a class definition- a method that's not part of your class*/
		
		//CALLING/USING THE METHOD
		System.out.println("========LOCAL VS. GLOBAL===========");
		firstMethod(); //The method name, and parameters to use.
		System.out.println("Global "+ myPI);
		System.out.println("========ADDING NUMBERS===========");
		System.out.println("Adding numbers 23 and 58 gives you "+addNumbers(23, 58));
		System.out.println("========WHAT IS ACCESSED WHEN===========");
		int d = 16; //local to this Main method
		tryToChange(d);
		System.out.println("Main d "+d);
		System.out.println("========RANDOM NUMBERS WITH YOUR HELP===========");
		System.out.println("Your random number = "+getRandomNumber());
		System.out.println("========GUESSING GAME===========");
		
		int guessResult = 1, randomGuess = 0;
		while(guessResult != -1){
			System.out.println("Guess a number between 0 and 5000");
			randomGuess = newInput.nextInt();
			guessResult = checkGues(randomGuess);
		}
		
		System.out.println("YAAY, you guessed that the number was "+randomGuess);
	}
	
	public static int firstMethod(){
		
		double smallPI = 3.140; //Local Variable. It's in a method and can only be accessed in that method (locally)
		System.out.println("Local " + smallPI);//Even though both methods are named the same, you're only getting the local variable at the local level
		//if you wanted to, you could get the global variable too though.
		System.out.println("Global PI "+ Methods.myPI);
		
		return 0;
		
	}
	
	public static int addNumbers(int first, int second){
		int answer = first + second;	
		return answer;
	}
	
	public static void tryToChange(int d){
		d += 4;
		System.out.println("Original d passed through this method, was changed to "+ d);
	}
	
	public static int getRandomNumber(){
		
		System.out.println("Please enter a positive number, no bigger than 5000");
		int userInput = newInput.nextInt();
		randomNumber = (int) (Math.random() * userInput);//userInput is what the number is going to be between. So between 0 and what the user inputs
		return randomNumber;
	}
	
	public static int checkGues(int guess){
		if(guess == randomNumber){
			return -1;
		}
		return guess;		
	}

}
