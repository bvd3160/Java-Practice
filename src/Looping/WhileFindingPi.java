package Looping;

public class WhileFindingPi {

	public WhileFindingPi() {
	}

	public static void main(String[] args) {
		//CALCULATING THE VALUE OF PIE (OR AT LEAST HOW TO GET CLOSE)
		double myPie = 4.0;
		double i = 3.0;
		
		// π = (4/1) - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + (4/13) - (4/15) ...
		
		while(i < 1100000){//The more times you do this, the closer the decimal precision becomes
			myPie = myPie - (4/i) + (4/(i+2));
			i += 4;
			System.out.println(myPie);
			
		}
		System.out.println("Real Value of Pi = " + Math.PI);

	}

}
