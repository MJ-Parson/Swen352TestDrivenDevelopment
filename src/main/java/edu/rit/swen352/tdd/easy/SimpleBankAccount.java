package edu.rit.swen352.tdd.easy;

/**
 * An American bank account that permits deposits and withdrawals.
 * The balance must never be negative.
 * 
 * As a work-around to the floating point issue, I chose to have all input be in cents.
 * As an example, an input of 100 = 100 cents = $1.00
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor:
 *     <ul>
 *       <li>with both an initial balance as {@code float} value</li>
 *       <li>a no-arg ctor that sets the value to zero</li>
 *     </ul>
 *   </li>
 *   <li>getBalance: returns the current balance</li>
 *   <li>isAccountEmpty(): queries whether the balance is zero</li>
 *   <li>deposit(amount): add a {@code float} amount to the balance</li>
 *   <li>withdraw(amount): subtract a {@code float} amount from the balance</li>
 * </ul>
 */
public class SimpleBankAccount {

    private int balanceCents;
    
    public SimpleBankAccount(int initialBalanceCents) {
        this.balanceCents = initialBalanceCents;
    }

    public SimpleBankAccount() {
        this.balanceCents = 0;
    }

    public double getBalance() {
        return this.balanceCents;
    }

    public boolean isAccountEmpty() {
        return this.balanceCents == 0;
    }

}
