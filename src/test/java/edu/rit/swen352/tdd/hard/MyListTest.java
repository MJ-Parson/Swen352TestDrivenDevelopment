package edu.rit.swen352.tdd.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

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

    @Test
    @DisplayName("Test that before an add, there is an indexOOB error, after, return with the proper response")
    public void testGet() {
        MyList<Integer> list = new MyList<>();
        int element = 87;
        assertThrows(NoSuchElementException.class, () -> list.get(0));
        list.add(element);
        assertEquals(list.get(0), element);
    }

    @Test
    @DisplayName("Test that before an add, remove does nothing. After, removes an element by correct index.")
    public void testRemove() {
        MyList<Integer> list = new MyList<>();
        int element = 81;
        assertThrows(NoSuchElementException.class, () -> list.remove(0));
        
        list.add(element);
        int resp = list.remove(0);
        assertEquals(element,resp);
    }

    @Test
    @DisplayName("Test forEach, implementing iterator, performing simple loop functions.")
    public void testForEach() {
        int[] elements = {81,99,32,32,1,1,1,0};
        MyList<Integer> list = new MyList<>();
        for(int element: elements){
            list.add(element); //fill list
        }
        int sum = 0;
        for(int element : list){
            sum += element;
        }
        assertEquals(sum, 247);
    }
}
