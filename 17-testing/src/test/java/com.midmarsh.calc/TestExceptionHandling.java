package com.midmarsh.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestExceptionHandling {

    @Test
    void shouldThrowException() {
        Throwable exception = assertThrows(
                UnsupportedOperationException.class, () -> {
                    throw new UnsupportedOperationException("Not supported");
                });
        assertEquals(exception.getMessage(), "Not supported");
    }

    @Test
    void assertThrowsException() {
        String str = null;
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.valueOf(str);
        });
    }

}
