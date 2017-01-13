package Looping;

public class WhileAndForLoops {

	public WhileAndForLoops() {
	}

	public static void main(String[] args) {
		
		//THE WHILE LOOP
		//Main difference between this loop and the FOR LOOP is that the iterator for this loop is created beforehand.
		//i.e:
		System.out.println("===========WHILE LOOP==========");
		int iterator = 0;
		while(iterator < 10){
			System.out.println("Loop number "+iterator);
			iterator++;
		}
		//The above checks that the iterator is less than 10 and executes whatever is in the while loop until it's broken due to the adding of 1 each time.
		System.out.println("===========FOR LOOP BELOW==========");
		for (int iterator2 = 0; iterator2 < 10; iterator2++) {//The cool thing is that you can also declare iterators on the outside. Notice I said iterators.. you can have multiple in one for loop!
			System.out.println("Loop number "+iterator2);
		}
		//The above does the exact same thing the WHILE LOOP did, except now we can define the iterator and the iterations while declaring the loop itself.
		
		System.out.println("===USING CONTINUE IN WHILE LOOP===");
		//A LITTLE MORE PLAY WITH THE WHILE LOOP
		int i = 0;
		while(i < 20){
			//if you wanted to skip a number and then CONTINUE printing the rest! '3' for example
			if(i == 3){
				i+=2;
				continue;
			}
			System.out.println("Loop number "+i);
			i++;
			//To print odd numbers
			if((i%2)==0){//This means- if i's remainder when divided by 2 is 0, the number is even. So let's add 1 to get the odd!
				i++;
			}
			//You can break out of the loop (any loop) by calling break;
			if(i > 15){
				break;
			}
		}		
		
	}

}
