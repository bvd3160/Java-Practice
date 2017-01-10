package Operators;

public class LogicalOperators {

	public LogicalOperators() {
	}

	public static void main(String[] args) {
		/*
		 * JAVA'S 6 LOGICAL OPERATORS
		 * 
		 * !	Not	Unary	Returns true if the operand to the right evaluates to false. Returns false if the operand to the right is true.
		 * &	And	Binary	Returns true if both of the operands evaluate to true.  Both operands are evaluated before the And operator is applied.
		 * |	Or	Binary	Returns true if at least one of the operands evaluates to true. Both operands are evaluated before the Or operator is applied.
		 * ^	Xor	Binary	Returns true if one — and only one — of the operands evaluates to true. Returns false if both operands evaluate to true or if both operands evaluate to false.
		 * &&	Conditional And	Binary	Same as &, but if the operand on the left returns false, it returns false without evaluating the operand on the right.
		 * ||	Conditional Or	Binary	Same as |, but if the operand on the left returns true, it returns true without evaluating the operand on the right.
		 */
		if(!(false)){
			System.out.println("Turned false into True"); //condition would not be true if true was inserted after the ! as it would turn it into false.
		}
		
		if((true) & (true)){
			System.out.println("Both Conditions are True");
		}
		
		if((true) | (false)){
			System.out.println("One of the conditions was true True");
		}
		
		if((false) ^ (true) ^ (false)){
			System.out.println("One and ONLY one of the conditions was true");
		}
		
		if((true) && (true)){
			System.out.println("Both Conditions are True"); //if the operand on the left is false then the output is automatically FALSE
		}
		
		if((false) || (true)){
			System.out.println("One of the conditions was true True"); //if the operand on the left is true then the output is automatically TRUE
		}
	}

}
