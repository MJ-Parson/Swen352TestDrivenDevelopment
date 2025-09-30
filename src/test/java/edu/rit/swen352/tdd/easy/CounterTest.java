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
    public void testConstructorLower() {
        int lowerbound = 4;
        Counter counter = new Counter(lowerbound);
        assertInstanceOf(Counter.class, counter);
    }

    @Test
    @DisplayName("Constructor Test, No Parameters Given")
    public void testConstructorNone() {
        Counter counter = new Counter();
        assertInstanceOf(Counter.class, counter);
    }

    @Test
    @DisplayName("GetLower test, check accurate")
    public void testGetLower() {
        Counter counter = new Counter();
        assertEquals(counter.getLower(),0);
        int lower2 = 8;
        Counter counter2 = new Counter(lower2);
        assertEquals(counter2.getLower(), lower2);
        int lower3 = -9;
        Counter counter3 = new Counter(9,lower3);
        assertEquals(counter3.getLower(), lower3);
    }
}
