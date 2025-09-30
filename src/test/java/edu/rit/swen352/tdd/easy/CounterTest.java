package edu.rit.swen352.tdd.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link Counter} component.
 */
class CounterTest {

    @Test
    @DisplayName("Constructor Test, All Parameters")
    public void testConstructor(){
        int upperbound=1;
        int lowerbound=-1;
        Counter counter = new Counter(upperbound,lowerbound);
        assertInstanceOf(Counter.class,counter);
    }

    @Test
    @DisplayName("Constructor Test, Only Lower Given")
    public void testConstructorUpper() {
        int lowerbound = 4;
        Counter counter = new Counter(lowerbound);
        assertInstanceOf(Counter.class, counter);
    }
}
