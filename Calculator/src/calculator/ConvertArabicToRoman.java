package calculator;

public class ConvertArabicToRoman {
	public static String convResult;
	public static String[]romNumbs = {"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
	public static void convert(int result) {
		
		int r = result;
		
		
		if(r  <= 10 && r != 0 ) {
			convResult = romNumbs[r];
		}else if(r >= 11 && r <= 19) {
			convResult = "X" + romNumbs[r - 10];
		}else if(r  >= 20 && r  <= 30) {
			convResult = "XX" + romNumbs[r - 20];
		}else if(r  >= 30 && r  <= 39) {
			convResult = "XXX" + romNumbs[r - 30];
		}else if(r  >= 40 && r  <= 49) {
			convResult = "XL" + romNumbs[r - 40];
		}else if(r  >= 50 && r  <= 59) {
			convResult = "L" + romNumbs[r - 50];
		}else if(r  >= 60 && r  <= 69) {
			convResult = "LX" + romNumbs[r - 60];
		}else if(r  >= 70 && r  <= 80) {
			convResult = "LXX" + romNumbs[r - 70];
		}else if(r  >= 80 && r  <= 89) {
			convResult = "LXXX" + romNumbs[r - 80];
		}else if(r  >= 90 && r  <= 99) {
			 convResult = "XC" + romNumbs[r - 90];
		}else if(r == 0) {
			convResult = "Nulla ??? :)"; 
		}else {
			convResult = "C";
		}
		
		System.out.println(convResult);
	}
}
