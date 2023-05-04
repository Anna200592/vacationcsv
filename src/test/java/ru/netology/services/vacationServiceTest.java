package ru.netology.services;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class vacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void shouldCalcVacation(int expected, int income, int expenses, int threshold) {
        vacationService service = new vacationService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
