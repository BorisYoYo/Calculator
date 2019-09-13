package calculator;

public class CalcArabic {
	public static int result;
	public void calc(byte num_1, char oper, byte num_2) {
		
		switch(oper) {
		case '+':
			result = num_1 + num_2;
			break;
		case '-':
			result = num_1 - num_2;
			break;
		case '*':
			result = num_1 * num_2;
			break;
		case '/':
			if((num_1 % num_2) == 0)
			result = num_1 / num_2;
			else
				Errors.errorFloat();
			break;
		default:
			Errors.error();
		}

		
		
			
	}	
}
