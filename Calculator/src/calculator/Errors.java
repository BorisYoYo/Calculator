package calculator;

public class Errors {
	public static void error() {
		System.out.println("Некорректный ввод. Завершение программы !");
		System.exit(0);
		
	}
	
	public static void errorFloat() {
		System.out.println("Ошибка, дробное число. Завершение программы !");
		System.exit(0);
	}
	
	public static void errorNegative() {
		System.out.println("Ошибка,отрицательное число. Завершение программы !");
		System.exit(0);
	}	
}
