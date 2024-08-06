  // ----------------------------- Syntax -------------------------------


package practice_java;

import java.util.Scanner; // import the scanner class from the utility package

public class Main {  // class

	public static void main(String[] args) {  // main method
		
		System.out.println("Let's practice java!!"); //print statement
		
		System.out.println("\"Let's Go!\"");  // ( \n: next line, \t: tab, \"\": quotes, etc. )
		
		// use "sysout" with ^ + space to write System.out.println();
		
		// This is a single line comment
		
		/* 
		 * This
		 * is
		 * a
		 * multi-line
		 * comment
		 */
		
		
	//	------------------------------ Variables -------------------------------
		
		int x; //declaration
		
		x = 130; //assignment 
		
		int y = 15; //initialization
		
		Long z = 1721237194623841L; // large numbers
		
		float a = 3.3245523f;  //decimal, use double for large decimal 
		
		boolean b = true; // true or false
		
		String c = "Sourav"; // use double quotes " "
		
		char d = '@'; // any character or symbol, use single quotes ''
		
		
		
		System.out.println(x);
		System.out.println("My lucky number is "+y);
		System.out.println("This is my phone number "+ z);
		System.out.println("What is divisible by "+a);
		System.out.println("Is 1 a prime numer? "+b);
		System.out.println("My name is "+c);
		System.out.println("My LinkedIn is "+d+"dsourav155");
		
		
		
	// ----------------------- Swap two variables ---------------------------
		
		String p = "Water";
		String q = "Coffee";
		
		String temp;
		
		temp = p;
		p = q;
		q = temp;
		
		System.out.println("p: "+p);
		System.out.println("q: "+q);
		
		
	// ---------------------- How to accept user input -------------------------
		
		Scanner scanner = new Scanner(System.in);  // We use Scanner class to create a "scanner" object
		
		System.out.println("What is your name? "); 
		String name = scanner.nextLine();  // taking the user input and assigning it to the variable (String) 
		
		System.out.println("What is your age? "); 
		// int age = scanner.nextInt();  // Assigning user input to the "int" variable
		
		/*
		 * If you did run the program, the program asks for the name, then the age, and then skips the last prompt for the food and abruptly ends.
		 * Well, this has to do with how the two methods work. The first scanner.nextLine() prompts the user for their name.

         * When the user inputs the name and presses enter, scanner.nextLine() consumes the name and the enter or the newline character at the end.

         * Which means the input buffer is now empty. Then the scanner.nextInt() prompts the user for their age. The user inputs the age and presses enter.

         * Unlike the scanner.nextLine() method, the scanner.nextInt() method only consumes the integer part and leaves the enter or newline character in the input buffer.

         * When the third scanner.nextLine() is called, it finds the enter or newline character still existing in the input buffer, mistakes it as the input from the user, and returns immediately.
		 */
		
		int age = Integer.parseInt(scanner.nextLine()); // take all the inputs as strings and parse them to the correct data type later on (integer in this case)
		
		System.out.println("What is your fav. food? ");
		String food = scanner.nextLine();  
		
		
		System.out.println("Hello "+name);
		System.out.println("We both are "+age+ " years old");
		System.out.println(food+" is nice but I like burgers more.");
		
	
	// ------------------------- Expressions in Java -----------------------------
		
		/*
		 *  expression = operands and operators
		 *  operands = values, variables, numbers, quantity
		 *  operators = +, -, *, /, %
		 */
		
		int noOfFriends = 10;
		
		noOfFriends++;
		
		System.out.println(noOfFriends);

	}

}
