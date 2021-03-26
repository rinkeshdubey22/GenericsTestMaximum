package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericsMaximumTest {


    @Test
    public void  givenIntegers_whenFirstIntegerIsMax_ReturnSame() {
        GenericsMaximum<Integer> integerGenericsMaximum = new GenericsMaximum<Integer>(10, 5, 2);
        Integer result = integerGenericsMaximum.testMax();
        Assertions.assertEquals(10, result);
    }

    @Test
    public void  givenIntegers_whenSecondIntegerIsMax_ReturnSame() {
        GenericsMaximum<Integer> integerGenericsMaximum = new GenericsMaximum<Integer>(5, 10, 2);
        Integer result = integerGenericsMaximum.testMax();
        Assertions.assertEquals(10, result);
    }

    @Test
    public void  givenInteger_whenThirdIntegerIsMax_ReturnSame() {
        GenericsMaximum<Integer> integerGenericsMaximum = new GenericsMaximum<Integer>(2, 5, 10);
        Integer result = integerGenericsMaximum.testMax();
        Assertions.assertEquals(10, result);
    }

    @Test
    public void  givenFloat_whenFirstFloatIsMax_ReturnSame() {
        GenericsMaximum<Float> floatGenericsMaximum = new GenericsMaximum<Float>(10.5f, 5.5f, 2.5f);
        Float result = floatGenericsMaximum.testMax();
        Assertions.assertEquals(10.5f, result);
    }

    @Test
    public void  givenFloat_whenSecondFloatIsMax_ReturnSame() {
        GenericsMaximum<Float> floatGenericsMaximum = new GenericsMaximum<Float>(5.5f, 10.5f, 2.5f);
        Float result = floatGenericsMaximum.testMax();
        Assertions.assertEquals(10.5f, result);
    }

    @Test
    public void  givenFloat_whenThirdFloatIsMax_ReturnSame() {
        GenericsMaximum<Float> floatGenericsMaximum = new GenericsMaximum<Float>(2.5f, 5.5f, 10.5f);
        Float result = floatGenericsMaximum.testMax();
        Assertions.assertEquals(10.5f, result);
    }

    @Test
    public void  givenString_whenFirstStringIsMax_ReturnSame() {
        GenericsMaximum<String> stringGenericsMaximum = new GenericsMaximum<String>("Banana", "Apple", "Plum");
        String result = stringGenericsMaximum.testMax();
        Assertions.assertEquals("Plum", result);
    }

    @Test
    public void  givenString_whenSecondStringIsMax_ReturnSame() {
        GenericsMaximum<String> stringGenericsMaximum = new GenericsMaximum<String>("Apple", "Banana", "Plum");
        String result = stringGenericsMaximum.testMax();
        Assertions.assertEquals("Plum", result);
    }

    @Test
    public void  givenString_whenThirdStringIsMax_ReturnSame() {
        GenericsMaximum<String> stringGenericsMaximum = new GenericsMaximum<String>("Apple", "Plum", "Banana");
        String result = stringGenericsMaximum.testMax();
        Assertions.assertEquals("Plum", result);
    }


}
