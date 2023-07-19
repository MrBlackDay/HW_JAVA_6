package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationMonthsCalculationTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/calculate.csv")
    public void test(int expected, int income, int expenses, int threshold) {
        VacaitionMounthsCalculation count = new VacaitionMounthsCalculation();
        int actual = count.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

// Рабочие файлы

/*@CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"

    })*/
// РАЗДЕЛЬНЫЕ Тесты
    /*@Test
    public void test() {
        VacaitionMounthsCalculation calc = new VacaitionMounthsCalculation();
        int expected = 3;
        int actual = calc.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        VacaitionMounthsCalculation calc = new VacaitionMounthsCalculation();
        int expected = 2;
        int actual = calc.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);

    }*/

