package edu.rit.swen352.tdd.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link MySet} component.
 */
class MySetTest {

    @Test
    @DisplayName("1a: Construct empty set with no arguments")
    void testConstructorEmpty() {
        MySet<String> set = new MySet<>();
        assertNotNull(set);
    }

    @Test
    @DisplayName("1b: Construct set with initial elements")
    void testConstructorWithElements() {
        MySet<String> set = new MySet<>("a", "b", "c");
        assertEquals(3, set.size());
    }

    @Test
    @DisplayName("2: Test isEmpty on empty and non-empty set")
    void testIsEmpty() {
        MySet<String> emptySet = new MySet<>();
        MySet<String> nonEmptySet = new MySet<>("a");

        assertTrue(emptySet.isEmpty());
        assertFalse(nonEmptySet.isEmpty());
    }

    @Test
    @DisplayName("3: Test size returns correct count")
    void testSize() {
        MySet<String> set = new MySet<>("a", "b", "c");
        assertEquals(3, set.size());
    }

    @Test
    @DisplayName("4: Test contains for existing/non-existing element")
    void testContains() {
        MySet<String> set = new MySet<>("a", "b");
        assertTrue(set.contains("a"));
        assertFalse(set.contains("c"));
    }

    @Test
    @DisplayName("5: Add element and verify size increase")
    void testAdd() {
        MySet<String> set = new MySet<>();
        set.add("a");
        assertEquals(1, set.size());
        assertTrue(set.contains("a"));
    }

}
