/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Accounts.Account;
import Accounts.SavingsAccount;
import Office.BranchOffice;
import java.util.Date;

/**
 * This class will let us record an operation
 *
 * @author danielescobar
 */
public class Operation {

    private Date date;
    private Account account;
    private String type;
    private BranchOffice branchOffice;

    public Operation() {
        SavingsAccount sv = new SavingsAccount("nn", "22");
        this.account = sv;
    }

    /**
     * This constructor will set up the values of the operation
     *
     * @param type 0:Operation==deposit, 1:Operation==withdraw,
     * 2:Operation==Deactivate
     */
    public Operation(int type) {
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
                break;
        }

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
    public Account getAccount() {
        return account;
    }

    /**
     * This method let us set the account of the operation
     *
     * @param account The account of the operation
     */
    public void setAccount(Account account) {
        this.account = account;
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
     * @return The branchOffice of the operation
     */
    public BranchOffice getBranchOffice() {
        return branchOffice;
    }

    /**
     * This method let us set the branch office of the operation
     * @param branchOffice The branchOffice of the operation
     */
    public void setBranchOffice(BranchOffice branchOffice) {
        this.branchOffice = branchOffice;
    }

}
