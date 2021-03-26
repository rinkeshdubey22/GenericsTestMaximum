package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericsMaximumTest {


    @Test
    public void  givenIntegers_whenFirstIntegerIsMax_ReturnSame() {
        GenericsMaximum<Integer> integerGenericsMaximum = new GenericsMaximum<Integer>();
        Integer result = integerGenericsMaximum.testMax(10, 5, 2);
        Assertions.assertEquals(10, result);
        integerGenericsMaximum.printMax();
    }

    @Test
    public void  givenIntegers_whenSecondIntegerIsMax_ReturnSame() {
        GenericsMaximum<Integer> integerGenericsMaximum = new GenericsMaximum<Integer>();
        Integer result = integerGenericsMaximum.testMax(5, 10, 2);
        Assertions.assertEquals(10, result);
        integerGenericsMaximum.printMax();
    }

    @Test
    public void  givenInteger_whenThirdIntegerIsMax_ReturnSame() {
        GenericsMaximum<Integer> integerGenericsMaximum = new GenericsMaximum<Integer>();
        Integer result = integerGenericsMaximum.testMax(2, 5, 10);
        Assertions.assertEquals(10, result);
        integerGenericsMaximum.printMax();
    }

    @Test
    public void  givenFloat_whenFirstFloatIsMax_ReturnSame() {
        GenericsMaximum<Float> floatGenericsMaximum = new GenericsMaximum<Float>();
        Float result = floatGenericsMaximum.testMax(10.5f, 5.5f, 2.5f);
        Assertions.assertEquals(10.5f, result);
        floatGenericsMaximum.printMax();
    }

    @Test
    public void  givenFloat_whenSecondFloatIsMax_ReturnSame() {
        GenericsMaximum<Float> floatGenericsMaximum = new GenericsMaximum<Float>();
        Float result = floatGenericsMaximum.testMax(5.5f, 10.5f, 2.5f);
        Assertions.assertEquals(10.5f, result);
        floatGenericsMaximum.printMax();
    }

    @Test
    public void  givenFloat_whenThirdFloatIsMax_ReturnSame() {
        GenericsMaximum<Float> floatGenericsMaximum = new GenericsMaximum<Float>();
        Float result = floatGenericsMaximum.testMax(2.5f, 5.5f, 10.5f);
        Assertions.assertEquals(10.5f, result);
        floatGenericsMaximum.printMax();
    }

    @Test
    public void  givenString_whenFirstStringIsMax_ReturnSame() {
        GenericsMaximum<String> stringGenericsMaximum = new GenericsMaximum<String>();
        String result = stringGenericsMaximum.testMax("Banana", "Apple", "Plum");
        Assertions.assertEquals("Plum", result);
        stringGenericsMaximum.printMax();
    }

    @Test
    public void  givenString_whenSecondStringIsMax_ReturnSame() {
        GenericsMaximum<String> stringGenericsMaximum = new GenericsMaximum<String>();
        String result = stringGenericsMaximum.testMax("Apple", "Banana", "Plum");
        Assertions.assertEquals("Plum", result);
        stringGenericsMaximum.printMax();
    }

    @Test
    public void  givenString_whenThirdStringIsMax_ReturnSame() {
        GenericsMaximum<String> stringGenericsMaximum = new GenericsMaximum<String>();
        String result = stringGenericsMaximum.testMax("Apple", "Plum", "Banana");
        Assertions.assertEquals("Plum", result);
        stringGenericsMaximum.printMax();
    }


}
