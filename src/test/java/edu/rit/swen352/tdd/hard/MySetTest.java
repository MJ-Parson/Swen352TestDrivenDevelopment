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


}
