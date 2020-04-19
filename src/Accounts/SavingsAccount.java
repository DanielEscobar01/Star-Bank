/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

/**
 * This method let us create savings accounts
 * @author danielescobar
 */
public class SavingsAccount extends Account {

    private float interest;
    
    /**
     * Constructor of the saving account 
     * @param id The identification of the account
     * @param titularId The identification of the titular of the account
     */
    public SavingsAccount(String id, String titularId) {
        super(id, titularId);
    }

    /**
     * This method let us get the interest rate of the savings account
     *
     * @return The interest of the savings account
     */
    public float getInterest() {
        return interest;
    }

    /**
     * This method let us set the interest for the savings account
     *
     * @param interest The interest of the savings account
     */
    public void setInterest(float interest) {
        this.interest = interest;
    }

    /**
     * This method let us convert an object of this class to string for later
     * use in JSON
     *
     * @return String with values of all attributes in JSON format
     */
    @Override
    public String toString() {
        return "Account{" + "Id=" + id + ", titularId=" + titularId + ", balance=" + balance + "isActivate=" + isActive + "branchoffice= " + '}';
    }

    /**
     * This method let us do a withdraw from the account The account must have
     * $10.000 at every moment
     *
     * @param value The amount to withdraw
     */
    @Override
    public void withdraw(float value) {
        //The bank will retire the value plus the 2% of comission
        if (super.getBalance() >= 10000 + value + (value * 0.02)) {
            this.setBalance(this.getBalance() - value);
        }
    }

}
