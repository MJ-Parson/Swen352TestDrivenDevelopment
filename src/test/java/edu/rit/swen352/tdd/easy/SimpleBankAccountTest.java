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
        assertEquals(0, account1.getBalance());
        
        int testbalance2 = 25050;
        SimpleBankAccount account2 = new SimpleBankAccount(testbalance2);
        assertEquals(testbalance2, account2.getBalance());
        
        int testbalance3 = 10000;
        SimpleBankAccount account3 = new SimpleBankAccount(testbalance3);
        assertEquals(testbalance3, account3.getBalance());
    }

    @Test
    @DisplayName("IsAccountEmpty Test, Returns True When Balance is 0")
    public void testIsAccountEmpty() {
        SimpleBankAccount account1 = new SimpleBankAccount();
        assertTrue(account1.isAccountEmpty());
        
        SimpleBankAccount account2 = new SimpleBankAccount(10000);
        assertFalse(account2.isAccountEmpty());
        
        SimpleBankAccount account3 = new SimpleBankAccount(0);
        assertTrue(account3.isAccountEmpty());
    }

    @Test
    @DisplayName("Deposit Test, Adds Amount in Cents to Balance")
    public void testDeposit() {
        SimpleBankAccount account = new SimpleBankAccount(10000); //$100
        account.deposit(5000); //$50
        assertEquals(15000, account.getBalance()); //$150
        
        account.deposit(2575); // $25.75
        assertEquals(17575, account.getBalance()); //$175.75
    }

}
