package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void expect0_whenCalculatingFibonacciIndex0() {
        int index = 0;
        int actual = Main.fibonacci(index);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void expect1_whenCalculatingFibonacciIndex1() {
        int index = 1;
        int actual = Main.fibonacci(index);
        int expected = 1;
        assertEquals(expected, actual);
    }
}
