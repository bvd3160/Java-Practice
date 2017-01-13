package Looping;

public class DoWhileLoop {

	public DoWhileLoop() {
	}

	public static void main(String[] args) {
		// PROBABLY THE LEAST USED LOOP. SOME DON'T USE IT EVER! AT ALL!
		
		//DO WHILE loops are to absolutely guarantee that the code is going to be executed at least once!
		int i = 100; //Like the while loop, the iterator is defined on the outside.
		
		do{
			System.out.println("This is the part of the loop that had to be executed at least once. "+"i = "+i);
			i++;
		}while(i < 10);
		
		System.out.println("The above printed because the while did not first check the value of i");

	}

}
