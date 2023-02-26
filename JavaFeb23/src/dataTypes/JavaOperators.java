package dataTypes;

public class JavaOperators {
	/** there are 5 types of java operators
	 * Arithmetic Operators
	 * Assignment Operators
	 * comparison/Relational Operators
	 * logical operators
	 * Bitwise operators
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		//learning Arithmetic Operators
		// they are + - * / ++ --
		int a = 27;
		int b = 5;
		int result;
		
		result = a+b; // addition
		System.out.println("Addition result is"+ result); //15
		result = a-b; // subtraction
		System.out.println("Subtraction result is"+ result); //5
		result = a*b; // Multiplication
		System.out.println("Multiplication result is"+ result); //50
		result = a/b; //Division
		System.out.println(" Division  result is"+ result); //2
		result = a % b; // Modulus
		System.out.println("Modulus result is"+ result);//0
		System.out.println("incremental is" + a ++);
		System.out.println(" Decremental a is " + a --); 

	}

}
