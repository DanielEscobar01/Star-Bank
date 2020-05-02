/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import com.google.gson.Gson;

/**
 * This class let us create a cashier
 *
 * @author danielescobar
 */
public class Cashier {

    Gson gson = new Gson();
    String json;

    /**
     * This method let us add an account to JSON
     *
     * @param id The identification of the customer account
     * @param titularId The identification of the customer
     * @param typeAccount The type of account
     */
    public void addAccount(String id, String titularId, String typeAccount) {
        Verify verification = new Verify();
        verification.addAccount(id, titularId, typeAccount);
    }

    /**
     * This method let us deactivate an account
     *
     * @param id The identification of the account to be deleted
     * @param titularId The identification of the titular of the account
     * @param typeAccount The type of account to be deleted
     */
    public void deactivateAccount(String id, String titularId, String typeAccount) {
        Verify verify = new Verify();
        verify.deactivateAccount(id, titularId, typeAccount);
    }

    /**
     * This method let us make a deposit into an account
     * @param accountType The type of the account 
     * @param accountId The identification of the account
     * @param typeAccount The type of the account
     * @param amount The amount to be deposited into the account
     */
    public void makeDeposit(String accountType, String accountId, double amount) {
        Verify verify = new Verify();
        verify.makeDeposit(accountId, accountType, amount);
    }

}
