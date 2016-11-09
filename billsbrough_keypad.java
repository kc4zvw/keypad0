//
//     Author: David Billsbrough
//     E-mail: billsbrough@live.seminolestate.edu
//      Class: COP-1000 (7802)
// Assignment: in class
//   Due Date: 03-November-2016
//

import java.util.Scanner;

public class billsbrough_keypad {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		for (int len = 0; len < s.length(); len++) {
			if (Character.isDigit(s.charAt(len)))
				System.out.print(s.charAt(len));
			else 
				System.out.print(getKeyNumber(Character.toUpperCase(s.charAt(len))));
		}

		input.close();
	}
	
	public static int getKeyNumber(char c) {
		String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int n = alphabet.indexOf(c);
		int digit;
		
		if (n <= 3) 		// letters: ABC
			digit = 2;
		else if (n <= 6)	// DEF
			digit = 3;
		else if (n <= 9)	// GHI
			digit = 4;
		else if (n <= 12)	// JKL
			digit = 5;
		else if (n <= 15)	// MNO
			digit = 6;
		else if (n <= 19)	// PQRS
			digit = 7;
		else if (n <= 22)	// TUV
			digit = 8;
		else 				// WXYZ
			digit = 9;

		return digit;
	}
}

/* End of program */