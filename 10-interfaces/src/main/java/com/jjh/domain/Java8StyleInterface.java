package com.jjh.domain;

public interface Java8StyleInterface {
    default void logInfo(String msg) {
        log("Info", msg);
    }

    default void logWarning(String msg) {
        log("Warning", msg);
    }

    default void logError(String msg) {
        log("Error", msg);
    }

    private void log(String level, String msg) {
        System.out.println(level + ": " + msg);
    }

    default void checkStatus(String status) {
        if (isNull(status)) {
            System.out.println(("Unknown status"));
        }
    }

    private static boolean isNull(String str) {
        return str == null || ("".equals(str) ? true : false);
    }

    void doIt();

    int MAX = 100;
}
