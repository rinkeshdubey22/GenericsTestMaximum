package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericsMaximumTest {

    GenericsMaximum genericsMaximumTest = new GenericsMaximum();

    @Test
    public void  givenIntegers_whenFirstIntegerIsMax_ReturnSame() {
        Integer result = genericsMaximumTest.testMaxNumber(6, 4, 2);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void  givenIntegers_whenSecondIntegerIsMax_ReturnSame() {
        Integer result = genericsMaximumTest.testMaxNumber(6, 7, 2);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void  givenInteger_whenThirdIntegerIsMax_ReturnSame() {
        Integer result = genericsMaximumTest.testMaxNumber(6, 7, 9);
        Assertions.assertEquals(9, result);
    }

    @Test
    public void  givenFloat_whenFirstFloatIsMax_ReturnSame() {
        Float result = genericsMaximumTest.testMaxFloat(6.5f, 4.5f, 2.5f);
        Assertions.assertEquals(6.5f, result);
    }

    @Test
    public void  givenFloat_whenSecondFloatIsMax_ReturnSame() {
        Float result = genericsMaximumTest.testMaxFloat(6.5f, 7.5f, 2.5f);
        Assertions.assertEquals(7.5f, result);
    }

    @Test
    public void  givenFloat_whenThirdFloatIsMax_ReturnSame() {
        Float result = genericsMaximumTest.testMaxFloat(6.5f, 7.5f, 9.5f);
        Assertions.assertEquals(9.5f, result);
    }

}
