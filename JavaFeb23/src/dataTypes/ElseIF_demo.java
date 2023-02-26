package dataTypes;

public class ElseIF_demo {

	public static void main(String[] args) {
		/*else if syntax:
		 * if (condition)
		 * { code to be executed
		 * }else if (condition)
		 * {
		 * code to be executed
		 * }else
		 * {
		 * code to be executed
		 * }
		 */
		int age =16;
		
		if (age >18 && age <=80) {
			System.out.println("it is high time to get married");
		} else if (age >80 && age >=129)
		{
			System.out.println("pray to god that you are in good health");
		}
		else
		{
			System.out.println("you are too young!! wait for a while");
		}
	
	}
} 
