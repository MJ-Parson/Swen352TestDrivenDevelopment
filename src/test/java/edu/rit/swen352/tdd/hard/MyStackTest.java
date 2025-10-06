package edu.rit.swen352.tdd.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link MyStack} component.
 */
class MyStackTest {

    @Test
    @DisplayName("Constructor Test, Create Stack with Specified Capacity")
    public void testConstructor() {
        int capacity = 10;
        MyStack<String> stack = new MyStack<>(capacity);
        assertInstanceOf(MyStack.class, stack);
    }

    @Test
    @DisplayName("Constructor Test, Create Stack with Default Capacity of 16")
    public void testConstructorDefault() {
        MyStack<Integer> stack = new MyStack<>();
        assertInstanceOf(MyStack.class, stack);
    }

}
