package edu.rit.swen352.tdd.easy;

import java.lang.IllegalStateException;

/**
 * An integral counter with an optional lower and upper bound.
 * The count must start at the lower limit and must not exceed the upper limit.
 * The count must never drop below the lower limit.
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor:
 *     <ul>
 *       <li>with both lower and upper bounds</li>
 *       <li>one that supplies a lower bound and defaults the upper limit to MAX_INTEGER</li>
 *       <li>a third (no-args) that also defaults the lower limit to 0</li>
 *       <li>NOTE: once set in a ctor the bounds attributes must be fixed</li>
 *     </ul>
 *   </li>
 *   <li>getLower: access lower limit</li>
 *   <li>getUpper: access upper limit</li>
 *   <li>getCount: access the current state of the counter</li>
 *   <li>increment: increase the count by one; throw {@link IllegalStateException} if count is already at the upper limit</li>
 *   <li>decrement: decrease the count by one; throw {@link IllegalStateException} if count is already at the lower limit</li>
 * </ul>
 */
public class Counter {

    int upperbound;
    int lowerbound;
    int count;
    // Test 1a: Constructor with all parameters met
    public Counter(int upperbound,int lowerbound) {
        if(upperbound >= lowerbound)
        {
            this.upperbound = upperbound;
            this.lowerbound = lowerbound;
        } else {
            this.lowerbound = upperbound;
            this.upperbound = lowerbound;
        }
        this.count = this.lowerbound;
        
    }
    // Test 1b: Constructor with just lower bound
    public Counter(int lowerbound) {
        this.lowerbound = lowerbound;
        this.upperbound = Integer.MAX_VALUE;
        this.count = this.lowerbound;
    }
    // Test 1c: Constructor with no bounds
    public Counter() {
        this.upperbound = Integer.MAX_VALUE;
        this.lowerbound = 0;
        this.count = this.lowerbound;
    }

    public int getLower() {
        return this.lowerbound;
    }

    public int getUpper() {
        return this.upperbound;
    }

    public int getCount() {
        return this.count;
    }

    public void increment() {
        if(this.count == this.upperbound) {
            throw new IllegalStateException("Cannot increment over upper bound.");
        }
        this.count += 1;
    }

    
}
