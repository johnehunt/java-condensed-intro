package com.jjh.func;

import java.util.concurrent.Callable;

public class CallableApp {

    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        int result = calc.call();
        System.out.println("result: " + result);
    }

}

class Calculator implements Callable<Integer> {

    public Integer call() throws Exception {
        int fibonacci = 1;
        int prevFib = 1;
        
        for(int i=2; i<25; i++) {
            int temp = fibonacci;
            fibonacci+= prevFib;
            prevFib = temp;
        }
        return fibonacci;
    }
    
}