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

    @Test
    @DisplayName("GetBalance Test, Check Balance After Construction")
    public void testGetBalance() {
        SimpleBankAccount account1 = new SimpleBankAccount();
        assertEquals(0.0, account1.getBalance());
        
        double testbalance2 = 250.50;
        SimpleBankAccount account2 = new SimpleBankAccount(testbalance2);
        assertEquals(testbalance2, account2.getBalance());
        
        double testbalance3 = 1000.0;
        SimpleBankAccount account3 = new SimpleBankAccount(testbalance3);
        assertEquals(testbalance3, account3.getBalance());
    }

}
