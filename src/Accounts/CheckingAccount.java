/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

/**
 * This class let us create checking accounts
 * @author danielescobar
 */
public class CheckingAccount extends Account {

    /**
     * Constructor of the checking account
     *
     * @param id The identification of the account
     * @param titularId The identification of the titular of the account
     */
    public CheckingAccount(String id, String titularId) {
        super(id, titularId);
    }

    /**
     * This method let us do a withdraw from the account The account must have
     * $10.000 at every moment
     *
     * @param value The amount to withdraw
     */
    @Override
    public void withdraw(double value) {
        //The bank will retire the value plus the 1.7% of comission
        if (super.getBalance() >= 10000 + value + (value * 0.017)) {
            this.setBalance(this.getBalance() - value);
        }
    }

}
