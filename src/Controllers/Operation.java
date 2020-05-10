/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Accounts.Account;
import Office.BranchOffice;
import java.util.Date;

/**
 * This class will let us record an operation
 *
 * @author danielescobar
 */
public class Operation {

    private Date date;
    private String account;
    private String type;
    private BranchOffice branchOffice;
    private double amount;

    /**
     * This constructor will set up the values of the operation
     *
     * @param account The account of the operation
     * @param type 0:Operation==deposit, 1:Operation==withdraw,
     * 2:Operation==Deactivate, 3:Operation==Activate
     */
    public Operation(String accountId, int type) {
        switch (type) {
            case 0:
                setType("Deposit");
                break;
            case 1:
                setType("Withdraw");
                break;
            case 2:
                setType("Deactivate");
                break;
            case 3:
                setType("Activate");
                break;
        }
        setAccount(accountId);
        Date date = new Date();
        setDate(date);
        setAmount(0);
    }

    /**
     * This method let us get the date of the operation
     *
     * @return The date of the operation
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method let us set the date of the operation
     *
     * @param date The date of the operation
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method let us get the account of the operation
     *
     * @return The account of the operation
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method let us set the account of the operation
     *
     * @param account The account of the operation
     */
    public void setAccount(String accountID) {
        this.account = accountID;
    }

    /**
     * This method let us get the type of operation
     *
     * @return The type of operation
     */
    public String getType() {
        return type;
    }

    /**
     * This method let us set the type of the operation
     *
     * @param type The type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method let us get the branch office of the operation
     *
     * @return The branchOffice of the operation
     */
    public BranchOffice getBranchOffice() {
        return branchOffice;
    }

    /**
     * This method let us set the branch office of the operation
     *
     * @param branchOffice The branchOffice of the operation
     */
    public void setBranchOffice(BranchOffice branchOffice) {
        this.branchOffice = branchOffice;
    }

    @Override
    public String toString() {
        return "{" + "Date=" + date + ", Account=" + account + ", Type=" + type + ", Amount=" + amount + '}';
    }

    /**
     * This method ley us get the amount of the operation
     *
     * @return The amount of the operation
     */
    public double getAmount() {
        return amount;
    }

    /**
     * This method let us set the amount of the operation
     *
     * @param amount The amount of the operation
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

}
