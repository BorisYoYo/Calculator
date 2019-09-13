package calculator;

import java.util.Scanner;


public class Input {
	static Scanner input = new Scanner(System.in);
	
	public static String[]numbers;
	public static byte num_1;
	public static byte num_2;
	public static char oper;
	public static byte romeChoice;
	static String[]romeInput ={"I","II","III","IV","V","VI","VII","VIII","IX","X"};
	
	// Input numbers 
	public static void input() { 
		numbers = input.nextLine().toUpperCase().split(" ");
		
	// Check for Roman numbers
		for(byte i = 0; i < 10; i++) {
			if(numbers[0].equals(romeInput[i])) {
				for(byte x = 0; x < 10; x++) {
					if(numbers[2].equals(romeInput[x])) {
						ConvertRomanToArabic.toArabic();
						romeChoice = 33;
					}	
				}
			}
		}
		
	// Convert string to byte	
		num_1 = Byte.parseByte(numbers[0]); 
		num_2 = Byte.parseByte(numbers[2]);
		oper = numbers[1].charAt(0);
	
	// Input check	
		if(numbers.length > 3) {
			Errors.error();
		}else if(num_1 < 1 || num_1 > 10 || num_2 < 1 || num_2 > 10) {
			Errors.error();
		}
			
	}
}
