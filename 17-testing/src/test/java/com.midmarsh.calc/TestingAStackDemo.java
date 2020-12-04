package com.midmarsh.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("A stack")
class TestingAStackDemo {
    Stack<Object> stack;

    @Test
    void isInstantiatedWithNew() {
        new Stack<>();
    }

    @Nested
    class WhenNew {
        @BeforeEach
        void createNewStack() {
            stack = new Stack<>();
        }
        @Test
        void isEmpty() {
            assertTrue(stack.isEmpty());
        }
    }
}
