/*
 * Name: ExamplesDoWhile
 * Description: Examples of do-while
 * Author: Juan Gomez Romero
 * Version: 1
 * Creation: October 4, 2011
 * Modification: October 5, 2011
 */
package estructurasdecontrol;

import java.util.Scanner;

public class ExamplesDoWhile {

	public static void main(String [] args) {
		
		/* do while */
		// Print even numbers between 1 and 100
		
		System.out.println("--------------------------------------");
		System.out.println("Even numbers example");
		int n = 1;
		
		do {
			
			if(n % 2 == 0) {	// n is even
				System.out.println(n + " is even.");				
			}
			
			n = n + 1;			// increment n
		} while(n <= 10);
		
		System.out.println("End of example");
		System.out.println("--------------------------------------");
		
		
		// Add numbers read from the keyboard
		System.out.println("--------------------------------------");
		System.out.println("Read values while the user wants to continue");
		
		String input = "";
		int addition = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("value: ");
			int x = sc.nextInt();
			addition += x;	
		
			System.out.print("continue (y/n)? ");
			input = sc.next();
		
		} while(!input.equals("n"));
		
		System.out.println("The sum of the values is: " + addition);
		
		System.out.println("End of example");
		System.out.println("--------------------------------------");
	}
	
}
