package edu.rit.swen352.tdd.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link MySet} component.
 */
class MySetTest {

    @Test
    @DisplayName("1b: Construct set with initial elements")
    void testConstructorWithElements() {
        MySet<String> set = new MySet<>("a", "b", "c");
        assertNotNull(set);
    }

}
