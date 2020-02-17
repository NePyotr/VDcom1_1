package VDcom.VDcom1_1;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.IntFunction;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class AppTest {
	
	private static final int TEST_DEFAULT_START = 1;
	private static final int TEST_DEFAULT_LIMIT = 100;
	
	private final ByteArrayOutputStream baos = new ByteArrayOutputStream();
	private final PrintStream ps = new PrintStream(baos);
	
	@Before
    public void before() {
		ps.println(1);
		ps.println(2);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(4);
		ps.println(FizzBuzzCore.BUZZ);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(7);
		ps.println(8);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(FizzBuzzCore.BUZZ);
		ps.println(11);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(13);
		ps.println(14);
		ps.println(FizzBuzzCore.FIZZBUZZ);
		ps.println(16);
		ps.println(17);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(19);
		ps.println(FizzBuzzCore.BUZZ);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(22);
		ps.println(23);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(FizzBuzzCore.BUZZ);
		ps.println(26);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(28);
		ps.println(29);
		ps.println(FizzBuzzCore.FIZZBUZZ);
		ps.println(31);
		ps.println(32);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(34);
		ps.println(FizzBuzzCore.BUZZ);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(37);
		ps.println(38);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(FizzBuzzCore.BUZZ);
		ps.println(41);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(43);
		ps.println(44);
		ps.println(FizzBuzzCore.FIZZBUZZ);
		ps.println(46);
		ps.println(47);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(49);
		ps.println(FizzBuzzCore.BUZZ);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(52);
		ps.println(53);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(FizzBuzzCore.BUZZ);
		ps.println(56);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(58);
		ps.println(59);
		ps.println(FizzBuzzCore.FIZZBUZZ);
		ps.println(61);
		ps.println(62);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(64);
		ps.println(FizzBuzzCore.BUZZ);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(67);
		ps.println(68);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(FizzBuzzCore.BUZZ);
		ps.println(71);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(73);
		ps.println(74);
		ps.println(FizzBuzzCore.FIZZBUZZ);
		ps.println(76);
		ps.println(77);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(79);
		ps.println(FizzBuzzCore.BUZZ);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(82);
		ps.println(83);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(FizzBuzzCore.BUZZ);
		ps.println(86);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(88);
		ps.println(89);
		ps.println(FizzBuzzCore.FIZZBUZZ);
		ps.println(91);
		ps.println(92);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(94);
		ps.println(FizzBuzzCore.BUZZ);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(97);
		ps.println(98);
		ps.println(FizzBuzzCore.FIZZ);
		ps.println(FizzBuzzCore.BUZZ);
    }
	
	// ========================================= проверка обычного перебора

	/**
	 * Проверяем 1 вариант с перебором циклом
	 */
	@Test
	public void testExecStandardVer1() {
		ByteArrayOutputStream baost = new ByteArrayOutputStream();
		PrintStream pst = new PrintStream(baost);
		FizzBuzzCore.execute(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, FizzBuzzCore::mapToString, pst);
		assertEquals(baost.toString(), baos.toString());
	}
	
	/**
	 * Проверяем 2 вариант с перебором циклом
	 */
	@Test
	public void testExecStandardVer2() {
		ByteArrayOutputStream baost = new ByteArrayOutputStream();
		PrintStream pst = new PrintStream(baost);
		FizzBuzzCore.execute(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, FizzBuzzCore::mapToString2, pst);
		assertEquals(baost.toString(), baos.toString());
	}
	
	/**
	 * Проверяем 3 вариант с перебором циклом
	 */
	@Test
	public void testExecStandardVer3() {
		ByteArrayOutputStream baost = new ByteArrayOutputStream();
		PrintStream pst = new PrintStream(baost);
		FizzBuzzCore.execute(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, FizzBuzzCore::mapToString3, pst);
		assertEquals(baost.toString(), baos.toString());
	}
	
	/**
	 * Проверяем 4 вариант с перебором циклом
	 */
	@Test
	public void testExecStandardVer4() {
		ByteArrayOutputStream baost = new ByteArrayOutputStream();
		PrintStream pst = new PrintStream(baost);
		FizzBuzzCore.execute(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, FizzBuzzCore::mapToString4, pst);
		assertEquals(baost.toString(), baos.toString());
	}
	
	/**
	 * Проверяем любой вариант с перебором циклом и неверными входными параметрами (от нуля)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecStandard_WrongPar1() {
		PrintStream pst = Mockito.mock(PrintStream.class);
		@SuppressWarnings("unchecked")
		IntFunction<String> mapStrategy = Mockito.mock(IntFunction.class);
		FizzBuzzCore.execute(0, TEST_DEFAULT_LIMIT, mapStrategy, pst);
	}
	
	/**
	 * Проверяем любой вариант с перебором циклом и неверными входными параметрами (первая граница больше второй)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecStandard_WrongPar2() {
		PrintStream pst = Mockito.mock(PrintStream.class);
		@SuppressWarnings("unchecked")
		IntFunction<String> mapStrategy = Mockito.mock(IntFunction.class);
		FizzBuzzCore.execute(100, 90, mapStrategy, pst);
	}
	
	/**
	 * Проверяем любой вариант с перебором циклом и неверными входными параметрами (от отрицательных значений)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecStandard_WrongPar3() {
		PrintStream pst = Mockito.mock(PrintStream.class);
		@SuppressWarnings("unchecked")
		IntFunction<String> mapStrategy = Mockito.mock(IntFunction.class);
		FizzBuzzCore.execute(-10, TEST_DEFAULT_LIMIT, mapStrategy, pst);
	}
	
	/**
	 * Проверяем любой вариант с перебором циклом и неверными входными параметрами (не задана стратегия маппинга чисел на текст вывода)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecStandard_WrongPar4() {
		PrintStream pst = Mockito.mock(PrintStream.class);
		FizzBuzzCore.execute(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, null, pst);
	}
	
	/**
	 * Проверяем любой вариант с перебором циклом и неверными входными параметрами (не задан выходной поток)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecStandard_WrongPar5() {
		@SuppressWarnings("unchecked")
		IntFunction<String> mapStrategy = Mockito.mock(IntFunction.class);
		FizzBuzzCore.execute(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, mapStrategy, null);
	}
	
	// ========================================= проверка рекурсии
	
	/**
	 * Проверяем 1 вариант с перебором рекурсией
	 */
	@Test
	public void testExecRecursiveVer1() {
		ByteArrayOutputStream baost = new ByteArrayOutputStream();
		PrintStream pst = new PrintStream(baost);
		FizzBuzzCore.executeRecursive(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, FizzBuzzCore::mapToString, pst);
		assertEquals(baost.toString(), baos.toString());
	}
	
	/**
	 * Проверяем 2 вариант с перебором рекурсией
	 */
	@Test
	public void testExecRecursiveVer2() {
		ByteArrayOutputStream baost = new ByteArrayOutputStream();
		PrintStream pst = new PrintStream(baost);
		FizzBuzzCore.executeRecursive(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, FizzBuzzCore::mapToString2, pst);
		assertEquals(baost.toString(), baos.toString());
	}
	
	/**
	 * Проверяем 3 вариант с перебором рекурсией
	 */
	@Test
	public void testExecRecursiveVer3() {
		ByteArrayOutputStream baost = new ByteArrayOutputStream();
		PrintStream pst = new PrintStream(baost);
		FizzBuzzCore.executeRecursive(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, FizzBuzzCore::mapToString3, pst);
		assertEquals(baost.toString(), baos.toString());
	}
	
	/**
	 * Проверяем 4 вариант с перебором рекурсией
	 */
	@Test
	public void testExecRecursiveVer4() {
		ByteArrayOutputStream baost = new ByteArrayOutputStream();
		PrintStream pst = new PrintStream(baost);
		FizzBuzzCore.executeRecursive(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, FizzBuzzCore::mapToString4, pst);
		assertEquals(baost.toString(), baos.toString());
	}
	
	/**
	 * Проверяем любой вариант с перебором рекурсией и неверными входными параметрами (от нуля)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecRecursive_WrongPar1() {
		PrintStream pst = Mockito.mock(PrintStream.class);
		@SuppressWarnings("unchecked")
		IntFunction<String> mapStrategy = Mockito.mock(IntFunction.class);
		FizzBuzzCore.executeRecursive(0, TEST_DEFAULT_LIMIT, mapStrategy, pst);
	}
	
	/**
	 * Проверяем любой вариант с перебором рекурсией и неверными входными параметрами (первая граница больше второй)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecRecursive_WrongPar2() {
		PrintStream pst = Mockito.mock(PrintStream.class);
		@SuppressWarnings("unchecked")
		IntFunction<String> mapStrategy = Mockito.mock(IntFunction.class);
		FizzBuzzCore.executeRecursive(100, 90, mapStrategy, pst);
	}
	
	/**
	 * Проверяем любой вариант с перебором рекурсией и неверными входными параметрами (от отрицательных значений)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecRecursive_WrongPar3() {
		PrintStream pst = Mockito.mock(PrintStream.class);
		@SuppressWarnings("unchecked")
		IntFunction<String> mapStrategy = Mockito.mock(IntFunction.class);
		FizzBuzzCore.executeRecursive(-10, TEST_DEFAULT_LIMIT, mapStrategy, pst);
	}
	
	/**
	 * Проверяем любой вариант с перебором рекурсией и неверными входными параметрами (не задана стратегия маппинга чисел на текст вывода)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecRecursive_WrongPar4() {
		PrintStream pst = Mockito.mock(PrintStream.class);
		FizzBuzzCore.executeRecursive(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, null, pst);
	}
	
	/**
	 * Проверяем любой вариант с перебором рекурсией и неверными входными параметрами (не задан выходной поток)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecRecursive_WrongPar5() {
		@SuppressWarnings("unchecked")
		IntFunction<String> mapStrategy = Mockito.mock(IntFunction.class);
		FizzBuzzCore.executeRecursive(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, mapStrategy, null);
	}
	
	// ========================================= проверка потокового перебора
	
	/**
	 * Проверяем 1 вариант с перебором потоками
	 */
	@Test
	public void testExecByStreamVer1() {
		ByteArrayOutputStream baost = new ByteArrayOutputStream();
		PrintStream pst = new PrintStream(baost);
		FizzBuzzCore.executeByStream(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, FizzBuzzCore::mapToString, pst);
		assertEquals(baost.toString(), baos.toString());
	}
	
	/**
	 * Проверяем 2 вариант с перебором потоками
	 */
	@Test
	public void testExecByStreamVer2() {
		ByteArrayOutputStream baost = new ByteArrayOutputStream();
		PrintStream pst = new PrintStream(baost);
		FizzBuzzCore.executeByStream(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, FizzBuzzCore::mapToString2, pst);
		assertEquals(baost.toString(), baos.toString());
	}
	
	/**
	 * Проверяем 3 вариант с перебором потоками
	 */
	@Test
	public void testExecByStreamVer3() {
		ByteArrayOutputStream baost = new ByteArrayOutputStream();
		PrintStream pst = new PrintStream(baost);
		FizzBuzzCore.executeByStream(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, FizzBuzzCore::mapToString3, pst);
		assertEquals(baost.toString(), baos.toString());
	}
	
	/**
	 * Проверяем 4 вариант с перебором потоками
	 */
	@Test
	public void testExecByStreamVer4() {
		ByteArrayOutputStream baost = new ByteArrayOutputStream();
		PrintStream pst = new PrintStream(baost);
		FizzBuzzCore.executeByStream(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, FizzBuzzCore::mapToString4, pst);
		assertEquals(baost.toString(), baos.toString());
	}
	
	/**
	 * Проверяем любой вариант с перебором потоками и неверными входными параметрами (от нуля)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecByStream_WrongPar1() {
		PrintStream pst = Mockito.mock(PrintStream.class);
		@SuppressWarnings("unchecked")
		IntFunction<String> mapStrategy = Mockito.mock(IntFunction.class);
		FizzBuzzCore.executeByStream(0, TEST_DEFAULT_LIMIT, mapStrategy, pst);
	}
	
	/**
	 * Проверяем любой вариант с перебором потоками и неверными входными параметрами (первая граница больше второй)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecByStream_WrongPar2() {
		PrintStream pst = Mockito.mock(PrintStream.class);
		@SuppressWarnings("unchecked")
		IntFunction<String> mapStrategy = Mockito.mock(IntFunction.class);
		FizzBuzzCore.executeByStream(100, 90, mapStrategy, pst);
	}
	
	/**
	 * Проверяем любой вариант с перебором потоками и неверными входными параметрами (от отрицательных значений)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecByStream_WrongPar3() {
		PrintStream pst = Mockito.mock(PrintStream.class);
		@SuppressWarnings("unchecked")
		IntFunction<String> mapStrategy = Mockito.mock(IntFunction.class);
		FizzBuzzCore.executeByStream(-10, TEST_DEFAULT_LIMIT, mapStrategy, pst);
	}
	
	/**
	 * Проверяем любой вариант с перебором потоками и неверными входными параметрами (не задана стратегия маппинга чисел на текст вывода)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecByStream_WrongPar4() {
		PrintStream pst = Mockito.mock(PrintStream.class);
		FizzBuzzCore.executeByStream(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, null, pst);
	}
	
	/**
	 * Проверяем любой вариант с перебором потоками и неверными входными параметрами (не задан выходной поток)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testExecByStream_WrongPar5() {
		@SuppressWarnings("unchecked")
		IntFunction<String> mapStrategy = Mockito.mock(IntFunction.class);
		FizzBuzzCore.executeByStream(TEST_DEFAULT_START, TEST_DEFAULT_LIMIT, mapStrategy, null);
	}
	
	// TODO необходимо также отдельно проверить вызовы функций-стратегий маппинга mapToString, mapToString2, mapToString3, mapToString4 из FizzBuzzCore

}
