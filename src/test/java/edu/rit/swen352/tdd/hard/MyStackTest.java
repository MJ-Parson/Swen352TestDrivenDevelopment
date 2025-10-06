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

    @Test
    @DisplayName("GetCapacity Test, Returns Correct Capacity with Different Constructors")
    public void testGetCapacity() {
        MyStack<String> stack1 = new MyStack<>();
        assertEquals(16, stack1.getCapacity());
        
        int capacity2 = 5;
        MyStack<Integer> stack2 = new MyStack<>(capacity2);
        assertEquals(capacity2, stack2.getCapacity());
        
        int capacity3 = 100;
        MyStack<Double> stack3 = new MyStack<>(capacity3);
        assertEquals(capacity3, stack3.getCapacity());
    }

    @Test
    @DisplayName("IsEmpty Test, Returns True When Stack is Empty")
    public void testIsEmpty() {
        MyStack<String> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
    }

    @Test
    @DisplayName("Size Test, Returns Zero at Construction")
    public void testSize() {
        MyStack<String> stack1 = new MyStack<>();
        assertEquals(0, stack1.size());
        
        MyStack<Integer> stack2 = new MyStack<>(5);
        assertEquals(0, stack2.size());
    }

    @Test
    @DisplayName("Push Test, Adds Element to Stack and Increases Size")
    public void testPush() {
        MyStack<String> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
        
        stack.push("first");
        assertEquals(1, stack.size());
        assertFalse(stack.isEmpty());
        
        stack.push("second");
        assertEquals(2, stack.size());
        
        stack.push("third");
        assertEquals(3, stack.size());
    }


}
