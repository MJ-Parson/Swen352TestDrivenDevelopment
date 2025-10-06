package edu.rit.swen352.tdd.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link SimpleBankAccount} component.
 */
class SimpleBankAccountTest {

    @Test
    @DisplayName("Constructor Test, Create Account with Initial Balance in Cents")
    public void testConstructor() {
        int initialBalanceCents = 10000; // $100.00
        SimpleBankAccount account = new SimpleBankAccount(initialBalanceCents);
        assertInstanceOf(SimpleBankAccount.class, account);
    }

    @Test
    @DisplayName("Constructor Test, No Args Sets Balance to Zero")
    public void testConstructorNoArg() {
        SimpleBankAccount account = new SimpleBankAccount();
        assertInstanceOf(SimpleBankAccount.class, account);
    }

}
