package VDcom.VDcom1_1;

import java.io.PrintStream;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class FizzBuzzCore {
	
	static final String FIZZ ="Fizz";
	static final String BUZZ ="Buzz";
	static final String FIZZBUZZ = FIZZ + BUZZ;
	
	private FizzBuzzCore() {
		// объект не будем создавать
	}
	
	/**
	 * Проверка входных параметров стратегий маппинга
	 * @param value
	 */
	private static void checkMapInParams(int value) {
		if (value <= 0) {
			throw new IllegalArgumentException("value не может быть <= 0");
		}
	}
	
	/**
	 * Преобразуем исходное число в вид текстового результата (стратегия 1)
	 * Комментарий: Пошаговая реализация алгоритма по ТЗ
	 * @param value
	 * @return
	 */
	public static String mapToString(int value) {
		checkMapInParams(value);
		if (value % 3 == 0) {
			if (value % 5 == 0) {
				return FIZZBUZZ;
			}
			return FIZZ;
		}
		if (value % 5 == 0) {
			return BUZZ;
		}
		return String.valueOf(value);
	}
	
	/**
	 * Преобразуем исходное число в вид текстового результата (стратегия 2)
	 * Комментарий: Если число кратно и 3 и 5, то оно кратно 15 - уменшаем вложенность проверок
	 * @param value
	 * @return
	 */
	public static String mapToString2(int value) {
		checkMapInParams(value);
		if (value % 15 == 0) {
			return FIZZBUZZ;
		}
		if (value % 3 == 0) {
			return FIZZ;
		}
		if (value % 5 == 0) {
			return BUZZ;
		}
		return String.valueOf(value);
	}
	
	/**
	 * Преобразуем исходное число в вид текстового результата (стратегия 3)
	 * Комментарий: Т.к. FizzBuzz состоит из двух слов, которые подходят под другие проверки - объединяем строки, уменьшая кол-во проверок на остаток
	 * @param value
	 * @return
	 */
	public static String mapToString3(int value) {
		checkMapInParams(value);
		StringBuilder stringBuilder = new StringBuilder(8);
		if (value % 3 == 0) {
			stringBuilder.append(FIZZ);
		}
		if (value % 5 == 0) {
			stringBuilder.append(BUZZ);
		}
		if (stringBuilder.length() == 0) {
			stringBuilder.append(value);
		}
		return stringBuilder.toString();
	}
	
	/**
	 * Преобразуем исходное число в вид текстового результата (стратегия 4)
	 * Комментарий: Вместо IF используем тернарный оператор и работаем по варианту 1 (можно вместо этого использовать, например, алгоритм из 2 варианта)
	 * @param value
	 * @return
	 */
	public static String mapToString4(int value) {
		checkMapInParams(value);
		return (value % 3 == 0 ? (value % 5 == 0 ? FIZZBUZZ : FIZZ) : (value % 5 == 0 ? BUZZ : String.valueOf(value)));
	}
	
	/**
	 * Выводит переданное число в указанный поток вывода в необходимом виде
	 * @param value - значение
	 * @param mapStrategy - выбранная стратегия для маппинга значения в текст
	 * @param out - поток вывода результата
	 */
	public static void print(int value, IntFunction<String> mapStrategy, PrintStream out) {
		out.println(mapStrategy.apply(value));
	}
	
	/**
	 * Проверка входных параметров execute методов
	 * @param startVal - начальное значение
	 * @param endVal - конечное значение
	 * @param mapStrategy - выбранная стратегия для маппинга значения в текст
	 * @param out - поток вывода результата
	 */
	private static void checkExecuteInParams(int startVal, int endVal, IntFunction<String> mapStrategy, PrintStream out) {
		if (startVal <= 0) {
			throw new IllegalArgumentException("startVal не может быть <= 0!");
		}
		if (startVal > endVal) {
			throw new IllegalArgumentException("startVal не может быть > endVal!");
		}
		if (mapStrategy == null) {
			throw new IllegalArgumentException("не указана mapStrategy!");
		}
		if (out == null) {
			throw new IllegalArgumentException("не указан выходной поток!");
		}
	}
	
	/**
	 * Вывести все числа из указанного интервала в необходимом виде в указанный поток
	 * Комментарий: Перебираем числа циклом
	 * @param startVal - начальное значение
	 * @param endVal - конечное значение
	 * @param mapStrategy - выбранная стратегия для маппинга значения в текст
	 * @param out - поток вывода результата
	 */
	public static void execute(int startVal, int endVal, IntFunction<String> mapStrategy, PrintStream out) {
		checkExecuteInParams(startVal, endVal, mapStrategy, out);
		for (int i = startVal; i <= endVal; i++) {
			print(i, mapStrategy, out);
		}
	}
	
	/**
	 * Вывести рекурсивно все числа из указанного интервала в необходимом виде в указанный поток
	 * Комментарий: Перебираем числа рекурсивно
	 * @param startVal - начальное значение
	 * @param endVal - конечное значение
	 * @param mapStrategy - выбранная стратегия для маппинга значения в текст
	 * @param out - поток вывода результата
	 */
	public static void executeRecursive(int startVal, int endVal, IntFunction<String> mapStrategy, PrintStream out) {
		checkExecuteInParams(startVal, endVal, mapStrategy, out);
		print(startVal, mapStrategy, out);
		if (startVal < endVal) {
			executeRecursive(startVal + 1, endVal, mapStrategy, out);
		}
	}
	
	/**
	 * Вывести потоком (stream) все числа из указанного интервала в необходимом виде в указанный поток
	 * Комментарий: Перебираем числа, используя Stream API
	 * @param startVal - начальное значение
	 * @param endVal - конечное значение
	 * @param mapStrategy - выбранная стратегия для маппинга значения в текст
	 * @param out - поток вывода результата
	 */
	public static void executeByStream(int startVal, int endVal, IntFunction<String> mapStrategy, PrintStream out) {
		checkExecuteInParams(startVal, endVal, mapStrategy, out);
		IntStream.rangeClosed(startVal, endVal).forEachOrdered(n -> print(n, mapStrategy, out));
	}

}
