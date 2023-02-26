package dataTypes;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
	/**Assignment operators are (=,+=, -=, /= and %= )
	 *  a = 7 meaning a =7
	 *  a+=7 means a = a+7
	 *  a-=7 means a = a-7
	 *  a*=7 means a=a*7
	 *  a/=7 means a = a/7
	 *  a%=7 means a =a%7
	 *  Examples:
	 */
		
		int a=87;
		int result = a-7;
		result =a+7;
		
		
		System.out.println(a+=7); //94
		System.out.println(a-=7);//87
		System.out.println(a*=7);//609
		System.out.println(a/=7);//87
		System.out.println(a%=7);//3

	}

}
