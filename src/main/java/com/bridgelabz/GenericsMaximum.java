package com.bridgelabz;

public class GenericsMaximum {

    public Integer testMax(Integer x, Integer y, Integer z){
        int max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Generics Maximum Program");
        GenericsMaximum genericsMaximum = new GenericsMaximum();
        //System.out.println(genericsMaximum.testMax(3, 4, 5));
    }
}