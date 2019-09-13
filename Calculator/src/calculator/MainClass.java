package calculator;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Введите числа от 1 до 10 и операцию (+,-,*,/) разделяя их пробелом";
		System.out.println();
		try {
		Input.input(); // input numbers
		}catch(NumberFormatException e){
			Errors.error();
		}catch(ArrayIndexOutOfBoundsException e) {
			Errors.error();
		}
		
		CalcArabic cA = new CalcArabic();
		cA.calc(Input.num_1,Input.oper,Input.num_2);
		// If input Roman
		if(Input.romeChoice == 33)
			try {
		ConvertArabicToRoman.convert(CalcArabic.result);
		// If input Arabic
			}catch(ArrayIndexOutOfBoundsException e) {
				Errors.errorNegative();
			}
		else
			System.out.println(CalcArabic.result);
	}

}


                													

																	// Sorry for these codes 
