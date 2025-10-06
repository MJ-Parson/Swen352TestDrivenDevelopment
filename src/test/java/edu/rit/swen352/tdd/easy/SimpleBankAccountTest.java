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

    @Test
    @DisplayName("Withdraw Test, Subtracts Amount in Cents from Balance")
    public void testWithdraw() {
        SimpleBankAccount account = new SimpleBankAccount(10000); //$100
        account.withdraw(3000); //$30
        assertEquals(7000, account.getBalance());//$70
        
        account.withdraw(2050); //$20.50
        assertEquals(4950, account.getBalance()); //$49.50
        
        account.withdraw(4950); //$49.50
        assertEquals(0, account.getBalance());
        assertTrue(account.isAccountEmpty());
    }

    @Test
    @DisplayName("Withdraw Test, Cannot Withdraw More Than Balance")
    public void testWithdrawNegativePrevention() {
        SimpleBankAccount account = new SimpleBankAccount(5000); //$50
        assertThrows(IllegalStateException.class, () -> account.withdraw(10000));
        assertEquals(5000, account.getBalance());
        
        SimpleBankAccount account2 = new SimpleBankAccount(); //$0! broke!
        assertThrows(IllegalStateException.class, () -> account2.withdraw(100));
        assertEquals(0, account2.getBalance());
    }

}
