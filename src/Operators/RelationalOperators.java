package Operators;

public class RelationalOperators {

	public RelationalOperators() {
	}

	public static void main(String[] args) {
		/*
		 * JAVA'S 8 RELATIONAL OPERATORS
		 * 
		 * x < y	Less than	True if x is less than y, otherwise false.
		 * x > y	Greater than	True if x is greater than y, otherwise false.
		 * x <= y	Less than or equal to	True if x is less than or equal to y, otherwise false.
		 * x >= y	Greater than or equal to	True if x is greater than or equal to y, otherwise false.
		 * x == y	Equal	True if x equals y, otherwise false.
		 * x != y	Not Equal	True if x is not equal to y, otherwise false.
		 */
		
		int random = (int) (Math.random() * 60);

		//Checking if(conditional) a random number is less than 36
		if(random < 20){
			System.out.println("The random number "+random+" is less than 20");
		}else if(random > 56){
			System.out.println("The random number "+random+" is greater than 56");
		}
		
		if(random <= 25){
			System.out.println("The random number "+random+" is less or equal to 25");
		}
		
		if(random >= 9){
			System.out.println("The random number "+random+" is greater or eaqual to 9");		
		}
		
		if(random == 15){
			System.out.println("The random number "+random+" is exactly 15");
		}
		
		if(random != 20){
			System.out.println("The random number "+random+" is NOT 20");
		}else{
			//This is what you execute when none of the above is TRUE.
			System.out.println("I don't know what to tell you man. This is a tough nut to crack!");
		}	
	}

}
