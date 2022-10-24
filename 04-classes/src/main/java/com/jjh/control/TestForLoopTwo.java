package com.jjh.control;

public class TestForLoopTwo {

    public static void main(String [] args) {
        System.out.println("Starting");
        int i = 0;
        for (i=0; i<10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int x = 0;
        while (x < i) {
            System.out.print(x + ", ");
            x = x + 1;
        }
        System.out.println("\nDone");
    }
}
