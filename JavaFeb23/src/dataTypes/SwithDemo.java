package dataTypes;

public class SwithDemo {

	public static void main(String[] args) {
		/** Switch Statement SYntax:
		 * Switch (expression){
		 * case value:1
		 * code to be exectuted
		 * break;
		 * case value2:
		 *code to be executed
		 *break;
		 *case value 3:
		 *code to be executed
		 * break;
		 * default:
			 //code to be excuted
		 * }
		 */

		int dayNumber = 3;
		switch (dayNumber) {
		case 1:{
			System.out.println("It is monday today!");
		}
		break;
		case 2:{
			System.out.println("It is Tuesday today!");
		}
		break;
		case 3:{
			System.out.println("It is wednesday today!");
		}
		break;
		case 4:{
			System.out.println("It is thrusday today!");
		}
		break;
		case 5:{
			System.out.println("It is friday today!");
		}
		break;
		
		case 6:{
			System.out.println("It is saturday today!");
		}
		break;
		case 7:{
			System.out.println("It is Sunday today!");
		}
		break;
		default:{
			System.out.println("sorry it is not a day!");
		}
		break;
		
	}
		
	}	
		

}
