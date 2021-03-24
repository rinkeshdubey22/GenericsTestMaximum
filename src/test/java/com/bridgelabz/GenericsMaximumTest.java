package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericsMaximumTest {

    GenericsMaximum genericsMaximumTest = new GenericsMaximum();

    @Test
    public void  givenIntegers_whenFirstIntegerIsMax_ReturnSame() {
        Integer result = genericsMaximumTest.testMax(6, 4, 2);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void  givenIntegers_whenSecondIntegerIsMax_ReturnSame() {
        Integer result = genericsMaximumTest.testMax(6, 7, 2);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void  givenIntegers_whenThirdIntegerIsMax_ReturnSame() {
        Integer result = genericsMaximumTest.testMax(6, 7, 9);
        Assertions.assertEquals(9, result);
    }

}
