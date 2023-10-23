/*
 * Name: ExamplesWhile
 * Description: Examples of while
 * Author: Juan Gomez Romero
 * Version: 1
 * Creation: October 4, 2011
 * Modification: October 4, 2011
 */
package estructurasdecontrol;
import java.util.Scanner;

public class ExamplesWhile {

	public static void main(String [] args) {
		
		/* while */
		// Print even numbers between 1 and 100
		
		System.out.println("--------------------------------------");
		System.out.println("Even numbers example");
		int n = 1;
		
		while(n <= 100) {
			
			if(n % 2 == 0) {	// n is even
				System.out.println(n + " is even.");				
			}
			
			n = n + 1;			// increment n
		}
		
		System.out.println("End of example");
		System.out.println("--------------------------------------");
		
		
		// Add numbers read from the keyboard
		System.out.println("--------------------------------------");
		System.out.println("Read values while the user wants to continue");
		
		String input = "";
		int addition = 0;
		Scanner sc = new Scanner(System.in);
		
		while( !input.equals("n") ) {
			System.out.print("value: ");
			int x = sc.nextInt();
			addition += x;	
		
			System.out.print("continue (y/n)? ");
			input = sc.next();
		}
		
		System.out.println("The sum of the values is: " + addition);
		
		System.out.println("End of example");
		System.out.println("--------------------------------------");
	}
	
}
