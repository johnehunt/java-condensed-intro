package com.jjh.func;

import java.util.function.*;

public class SampleFuncApp1 {

    public static int processor(int n, Function<Integer, Integer> f) {
        return f.apply(n);
    }

    public static void main(String[] args) {

        Function<Integer, Integer> d = i -> i * 2;

        doSomething(2, d);
        System.out.println("--------------");
        doSomething(2, i -> i * 3);
        doSomething(2, i -> i * i);
        doSomething(2, i -> i + 3);
    }

    // Higher Order Function - a function that takes a function
    public static void doSomething(int data, Function<Integer, Integer> func) {
        System.out.println("In do Something");
        System.out.println(func.apply(data));
        System.out.println("Leaving do Something");
    }

}

class Doubler implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer t) {
        return t * 2;
    }
}

