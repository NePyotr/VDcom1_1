package VDcom.VDcom1_1;

/**
 * VDcom - Тестовое задание (Часть 1, задание 1)
 *
 */
public class App 
{
	public static final int DEFAULT_START = 1;
	public static final int DEFAULT_LIMIT = 100;
	
    public static void main( String[] args )
    {
    	
    	final int startVal = DEFAULT_START;
    	
    	// TODO я немного нарушил условие ТЗ и вывел на экран сразу результат работы нескольких алгоритмов с загловками
    	// для наглядности, как вызываются разные варианты алгоритмов. Чтобы привести работу к виду из ТЗ - нужно будет
    	// оставить только один вариант и удалить вывод заголовка для него
    	
    	// 1 вариант
    	System.out.println("======= 1 вариант =======");
    	try {
    		FizzBuzzCore.execute(startVal, DEFAULT_LIMIT, FizzBuzzCore::mapToString, System.out);
    	}
    	catch (IllegalArgumentException e) {
    		System.out.println("Ошибка во входных параметрах (1 вариант): " + e.getMessage());
    	}
    	
    	// 2 вариант
    	System.out.println("======= 2 вариант =======");
    	try {
    		FizzBuzzCore.execute(startVal, DEFAULT_LIMIT, FizzBuzzCore::mapToString2, System.out);
    	}
    	catch (IllegalArgumentException e) {
    		System.out.println("Ошибка во входных параметрах (2 вариант): " + e.getMessage());
    	}
    	
    	// 3 вариант
    	System.out.println("======= 3 вариант =======");
    	try {
    		FizzBuzzCore.execute(startVal, DEFAULT_LIMIT, FizzBuzzCore::mapToString3, System.out);
    	}
    	catch (IllegalArgumentException e) {
    		System.out.println("Ошибка во входных параметрах (3 вариант): " + e.getMessage());
    	}
    	
    	// 4 вариант
    	System.out.println("======= 4 вариант =======");
    	try {
    		FizzBuzzCore.execute(startVal, DEFAULT_LIMIT, FizzBuzzCore::mapToString3, System.out);
    	}
    	catch (IllegalArgumentException e) {
    		System.out.println("Ошибка во входных параметрах (4 вариант): " + e.getMessage());
    	}
    	
    	// 1 вариант рекурсивно
    	System.out.println("======= 1 вариант (рекурсивно) =======");
    	try {
    		FizzBuzzCore.executeRecursive(startVal, DEFAULT_LIMIT, FizzBuzzCore::mapToString, System.out);
    	}
    	catch (IllegalArgumentException e) {
    		System.out.println("Ошибка во входных параметрах (1 вариант рекурсивно): " + e.getMessage());
    	}
    	
    	// TODO остальные 3 варианта рекурсивно
    	
    	// 1 вариант потоками
    	System.out.println("======= 1 вариант (потоками) =======");
    	try {
    		FizzBuzzCore.executeByStream(startVal, DEFAULT_LIMIT, FizzBuzzCore::mapToString, System.out);
    	}
    	catch (IllegalArgumentException e) {
    		System.out.println("Ошибка во входных параметрах (1 вариант потоками): " + e.getMessage());
    	}
    	
    	// TODO остальные 3 варианта потоками
    	
    	// TODO обработку всех ошибок можно было сделать одну на все вызовы
    }
}
