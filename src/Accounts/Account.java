/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

import Controllers.Operation;
import java.util.ArrayList;


/**
 * This class let us create accounts
 * @author danielescobar
 */
public abstract class Account {

    protected String id;
    protected String titularId;
    protected float balance;
    protected boolean isActive;
    protected String office;
    protected ArrayList<Operation> operations = new ArrayList<>();
    //protected BranchOffice branchOffice;

    /**
     * The constructor of a regular account
     * @param id The identification of the account
     * @param titularId The identification of the titular of the account
     */
    public Account(String id, String titularId) {
        this.id = id;
        this.titularId = titularId;
        this.balance = 0;
        this.isActive = false;
        this.office = "PPal";
    }

    /**
     * This method let us know the identification of the account
     *
     * @return The identification of the account
     */
    public String getId() {
        return id;
    }

    /**
     * This method let us set the identification to an account
     *
     * @param id The identification of the account
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method let us get the identification of the titular of the account
     *
     * @return The titular identification
     */
    public String getTitularId() {
        return titularId;
    }

    /**
     * This method let us set the identification to a titular of the account
     *
     * @param titularId The identification of the account titular
     */
    public void setTitularId(String titularId) {
        this.titularId = titularId;
    }

    /**
     * This method let us get the balance of the account
     *
     * @return The balance of the account
     */
    public float getBalance() {
        return balance;
    }

    /**
     * This method let us set the balance of the account
     *
     * @param balance The balance of the account
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * This method let us know if the account is active
     *
     * @return The status of the account True if the account is active, else
     * return False
     */
    public boolean isActive() {
        return isActive;
    }

    /**
     * This method let us set the status of the account
     *
     * @param isActive Set the current status of the account
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * This method let us get the office of the account
     *
     * @return The office of the account
     */
    public String getOffice() {
        return office;
    }

    /**
     * This method let us set the office of the account
     *
     * @param office The office to set
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * This method let us do a withdraw, must be implemented in Checking and
     * Savings account
     *
     * @param value The value to be withdraw from the account
     */
    abstract public void withdraw(float value);
}
