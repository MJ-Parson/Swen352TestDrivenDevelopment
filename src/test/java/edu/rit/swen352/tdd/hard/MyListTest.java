package edu.rit.swen352.tdd.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link MyList} component.
 */
class MyListTest {

    @Test
    @DisplayName("Test Constructor is real, varargs of initial elements")
    public void testConstructor() {
        MyList<Integer> list = new MyList<>();
        assertInstanceOf(MyList.class, list);
    }

    @Test
    @DisplayName("Check that after construction, isEmpty is true")
    public void testIsEmpty() {
        MyList<Integer> list = new MyList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    @DisplayName("Check that after construction, size = 0")
    public void testSize() {
        MyList<Integer> list = new MyList<>();
        assertEquals(list.size(), 0);
    }

    @Test
    @DisplayName("Check that after an add, size is larger and not empty")
    public void testAdd() {
        MyList<Integer> list = new MyList<>();
        int element = 9;
        list.add(element);
        assertEquals(list.size(), 1);
        assertFalse(list.isEmpty());
    }
}
