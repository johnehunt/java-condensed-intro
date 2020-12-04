package com.jjh.func;

public class RunnableApp {

    public static void main(String[] args) {
        var runner = new Runner();
        runner.run();
    }

}

/**
 * Creates a class that implements the (functional)
 * interface Runnable
 */
class Runner implements Runnable {
    public void run() {
        System.out.println("I am running");
    }
}
