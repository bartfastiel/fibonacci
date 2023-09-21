package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @ParameterizedTest
    @CsvSource(delimiter = '=', value = {
            "0=0",
            "1=1",
            "2=1",
            "3=2",
            "4=3",
            "5=5",
            "6=8",
            "7=13",
            "20=6765"
    })
    void expectInt_whenCalculatingFibonacci(int index, int expected) {
        int actual = Main.fibonacci(index);
        assertEquals(expected, actual);
    }
}
