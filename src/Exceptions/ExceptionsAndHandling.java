package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionsAndHandling {

	public ExceptionsAndHandling() {
		}
	
	public static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("=1.====================ARITHMETIC EXCEPTION====================");
		//Let's divide by zero, which should produce an error. (see method)
		divideByZero(2);
		System.out.println("");
		
		System.out.println("=2.====================SCANNER EXCPETIONS====================");
		System.out.println("How old are you?");
		int age = checkValidAge();
		if(age != 0){
			System.out.println("You're " + age + " years young!");
		}
		System.out.println("");
		
		System.out.println("=2.====================IO EXCPETIONS====================");
		grabAFile("./MyFile.txt");
		
		System.out.println("=2.====================THROWS EXCPETION====================");
		try {
			grabAFileTwo("./MyFile.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	
	
	
	/*
	 * This method throws the exception before it has to be executed.
	 */
	private static void grabAFileTwo(String fileName) throws IOException, FileNotFoundException {//You can throw multiple Exceptions by separating them with a corner
		FileInputStream file = new FileInputStream(fileName);
		/*
		 * So in this situation it'll throw the error to main()
		 * Main() has to be able to handle the exception. As you can see,
		 * I've surrounded the method's execution in main with a try and catch block.
		 */
	}


	/*
	 * This method will get or create a file if it doesn't exist.
	 */
	private static void grabAFile(String fileName) {
		//checkedExceptions are those the compiler catches and warns you about
		/*
		 * In our case, it could be that MyFile.txt doesn't exist
		 */
		try {
			//the following alone would cause massive errors, but catching the exception ensures our program doesn't crash.
			FileInputStream file = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		
		} catch (IllegalArgumentException | IOException d){} //This is how you ignore an exception and catch multiple exceptions at once.
		
		catch (ArithmeticException i) { //it is possible to catch multiple exceptions in one try/catch block.
			System.out.println(i.toString());
			
			/*
			 * You should catch the exceptions from most specific to least! 
			 */
		} catch (Exception e){//This will catch every single exception there is.
			System.out.println(e.toString());
		} finally{
			System.out.println("Finally is always called, no matter what");
		}
	}


	private static int checkValidAge() {
		
		try {
			return userInput.nextInt();
		} catch (Exception e) {
			//flush the negative input
			userInput.next();
			//custom message.
			System.out.println("Hey that's not a whole number!");
			System.out.println("===========================================");
			return 0;
		}
	}

	private static void divideByZero(int i) {
		try {
			System.out.println(i/0);
		} catch (Exception e) {
			//custom message.
			System.out.println("Hey you can't divide by zero!");
			System.out.println("===========================================");
			//java's friendly message
			System.out.println(e.getMessage());
			System.out.println("===========================================");
			//If you just want the exception's information
			System.out.println(e.toString());
			System.out.println("===========================================");
			//finally if you wan't all available info: this is what would print out if you didn't catch the error.
			e.printStackTrace();
		}		
	}

}
