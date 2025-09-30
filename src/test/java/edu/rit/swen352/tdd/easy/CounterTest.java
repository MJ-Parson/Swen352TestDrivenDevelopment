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

    @Test
    @DisplayName("GetUpper test, check accurate")
    public void testGetUpper() {
        Counter counter = new Counter();
        int upper1 = Integer.MAX_VALUE;
        assertEquals(counter.getUpper(), upper1);
        int upper2 = 4;
        Counter counter2 = new Counter(upper2,0);
        assertEquals(counter2.getUpper(), upper2);
    }

    @Test
    @DisplayName("Constructor Logic, check lower < upper")
    public void testConstructorLogic() {
        // upperbound < lowerbound, so switch around
        Counter counter = new Counter(8,11);
        assertEquals(counter.getLower(), 8);
        assertEquals(counter.getUpper(), 11);
        assertTrue(counter.getLower() <= counter.getUpper());
    }

    @Test
    @DisplayName("GetCount, test at constructor")
    public void testGetCountConstruction() {
        int lower = 0;
        Counter counter1 = new Counter();
        assertEquals(counter1.getLower(), counter1.getCount());
        int lower2 = -99;
        Counter counter2 = new Counter(lower2);
        assertEquals(counter2.getLower(), counter2.getCount());
        int lower3 = 999999999;
        Counter counter3 = new Counter(1000000000,lower3);
        assertEquals(counter3.getLower(), counter3.getCount());

        
    }
}
