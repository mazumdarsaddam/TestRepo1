package Array;

public class ArrayDemo {
	public static void main(String[] args) {
		
		// declaring Array
		String[] myArray = new String [3];
		myArray[0] = "Selenium";
		myArray[1] = "Eclipse" ;
		myArray[2]="Java";
		
		System.out.println(myArray[1]);
		
		for (int i=0; i<myArray.length; i++) {
			System.out.println(myArray[1]);
		}
		// another way of declaring the array
		int [] number = {4,2,7};
		for (int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println("Example of enchance for loop");
			
			// example of enhanced for loop
			for (int v:number) {
				System.out.println(v);
			}
		}
		 }
	
