// ----------------------------- Syntax -------------------------------

package practice_java;

import java.util.Scanner; // import the scanner class from the utility package

public class Main { // class

	public static void main(String[] args) { // main method

		System.out.println("Let's practice java!!"); // print statement

		System.out.println("\"Let's Go!\""); // ( \n: next line, \t: tab, \"\": quotes, etc. )

		// use "sysout" with ^ + space to write System.out.println();

		// This is a single line comment

		/*
		 * This is a multi-line comment
		 */

		// ------------------------------ Variables -------------------------------

		int x; // declaration

		x = 130; // assignment

		int y = 15; // initialization

		Long z = 1721237194623841L; // large numbers

		float a = 3.3245523f; // decimal, use double for large decimal

		boolean b = true; // true or false

		String c = "Sourav"; // use double quotes " "

		char d = '@'; // any character or symbol, use single quotes ''

		System.out.println(x);
		System.out.println("My lucky number is " + y);
		System.out.println("This is my phone number " + z);
		System.out.println("What is divisible by " + a);
		System.out.println("Is 1 a prime numer? " + b);
		System.out.println("My name is " + c);
		System.out.println("My LinkedIn is " + d + "dsourav155");

		// ----------------------- Swap two variables ---------------------------

		String p = "Water";
		String q = "Coffee";

		String temp;

		temp = p;
		p = q;
		q = temp;

		System.out.println("p: " + p);
		System.out.println("q: " + q);

		String[] questions = { "What is your name?", "What is your age?", "What's your fav, food?" };
		String[] answers = { "", "", "" };

		// ---------------------- How to accept user input -------------------------

		Scanner scanner = new Scanner(System.in); // We use Scanner class to create a "scanner" object
		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);
			answers[i] = scanner.nextLine();
		}

		scanner.close();
		System.out.println("Hello " + answers[0]);
		System.out.println("We both are " + answers[1] + " years old");
		System.out.println(answers[2] + " is nice but I like burgers more.");

		// ------------------------- Expressions in Java -----------------------------

		/*
		 * expression = operands and operators operands = values, variables, numbers,
		 * quantity operators = +, -, *, /, %
		 */

		int noOfFriends = 10;

		noOfFriends++;

		System.out.println(noOfFriends);

	}

}