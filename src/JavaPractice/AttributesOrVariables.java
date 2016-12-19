package JavaPractice;

public class AttributesOrVariables {
	
	/*When declaring a field, the keyword 'static' is used if you want other classes to
	 * be able to excess that particular field. */
	//EXAMPLE:
	static String randomString;
	/*When you want a CONSTATANT(a variable declared with a value that will not change)
	 * you use the keyword 'final'. Conventionally a constant is named using all uppercase.*/
	//EXAMPLE:
	static final double NUMBER = 23.4;
	
	public static void main(String args[]){
		//
		System.out.println("Hello World");
		System.out.println("Static Final Number = "+NUMBER);
		
		//Declaring statements
		int integerOne = 22; //Declaration Statement
		int integerTwo = integerOne + 1; //Expression Statement
		
		System.out.println("Integer One = "+integerOne);
		System.out.println("Integer Two = "+integerTwo);
		
		//Primitive Types. 
		/*These are different due to the types of values they can hold*/
		byte bigByte = 127; //this can hold 127 bits
		short bigShort = 32767;
		int bigInt =  2100000000; //2.1 billion bits
		long bigLong = 9220000000000000000L;//Always ended with an 'L' when defining a long
		float bigFloat = 3.14F;//This one is a decimal number and also machine dependent. It has to end with 'F' in declaration.
		double bigDouble = 3.6555645646546;//Basically a bigger, more precise float (with more numbers after decimal place)
		/*If I want to know exactly how big these two types can get*/
		System.out.println("The biggest Float my system can give me = "+Float.MAX_VALUE);
		System.out.println("The biggest Double my system can give me = "+Double.MAX_VALUE);
		boolean trueOrFalse = true;
		char randomChar = 65; //number is ASCII character code 
		System.out.println("ASCII Character code 65 = "+randomChar);
		char anotherChar = 'A'; //Char can only contain ONE character. Don't surround char with double quotes.
		char escapedCharacters = '\\'; //'\b', '\f', '\n', '\r', '\t', '\"', '\'',
		String stringOfCharacters = "This is a string"; //Technically an object. Space is also a character.
		String anotherString = "to be combined with the previous.";
		String stringCombo = stringOfCharacters +" "+ anotherString;
		System.out.println("Combined string = " + stringCombo);
		
		//Converting any other type into a string
		System.out.println(Byte.toString(bigByte)); //Converting byte to a string
		System.out.println(Short.toString(bigShort));
		System.out.println(Integer.toString(bigInt));
		System.out.println(Long.toString(bigLong));
		System.out.println(Float.toString(bigFloat));
		System.out.println(Double.toString(bigDouble));
		System.out.println(Boolean.toString(trueOrFalse));
		//And there is no need to convert char to a string
		
		
		//Casting. Converting from one primitive type to another.
		double aDoubleValue = 3.1459323565;
		int convertedDouble = (int) aDoubleValue;
		System.out.println("Double converted to int: "+convertedDouble+" Original Double = "+aDoubleValue);
		//If the double was bigger than an integer, you'd simply get the biggest value an integer can hold.
		//You CAN'T cast float, boolean or char
		
		//Turning a string into the other data types.
		String stringInt = "2500";
		int stringToIntConvert = Integer.parseInt(stringInt); //There is parseShort, parseByte, parseLong, etc
		System.out.println(stringToIntConvert +"  is an integer that was converted from a string!!!");
		
	}

}