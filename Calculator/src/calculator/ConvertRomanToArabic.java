package calculator;

public class ConvertRomanToArabic {
	
	public static void toArabic() {

		String[]s = Input.numbers;

		for(int i = 0; i <= 2; i+= 2) {
			switch(s[i]) {
			case "I":
				s[i] = "1";	
				break;
			case "II":
				s[i] = "2";
				break;
			case "III":
				s[i] = "3";
				break;
			case "IV":
				s[i] = "4";
				break;
			case "V":
				s[i] = "5";
				break;
			case "VI":
				s[i] = "6";
				break;
			case "VII":
				s[i] = "7";
				break;
			case "VIII":
				s[i] = "8";
				break;
			case "IX":
				s[i] = "9";
				break;
			case "X":
				s[i] = "10";
				break;
			default:
				Errors.error();
				
			}
		}
	}
}