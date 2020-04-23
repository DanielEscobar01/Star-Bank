/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Accounts.CheckingAccount;
import Accounts.SavingsAccount;
import static Controllers.Database.writeCheckings;
import static Controllers.Database.writeSavings;
import com.google.gson.Gson;

/**
 * This class will let us check if the parameters are okay to be saved
 *
 * @author danielescobar
 */
public class Verify {

    Gson gson = new Gson();
    String json;
    Database database = new Database();

    /**
     * This method let us know if the account exist
     *
     * @param id The identification of the account
     * @param typeAccount The type of account
     * @return True if the account exist, False if not
     */
    public boolean existAccountId(String id, String typeAccount) {
        switch (typeAccount) {
            case "Savings Account":
                SavingsAccount[] savingsAccounts = gson.fromJson(json, SavingsAccount[].class);
                for (int i = 0; i < savingsAccounts.length; i++) {
                    if (savingsAccounts[i].getId().equals(id)) {
                        return true;
                    }
                }
                break;
            case "Checkings Account":
                CheckingAccount[] checkingsAccounts = gson.fromJson(json, CheckingAccount[].class);
                for (int i = 0; i < checkingsAccounts.length; i++) {
                    if (checkingsAccounts[i].getId().equals(id)) {
                        return true;
                    }
                }
                break;
        }
        return false;
    }

    /**
     * This method let us check if the titular of the account is correct
     * @param titularId     The identification of the titular of the account
     * @param id    The identification of the account
     * @param typeAccount   The type of account to be checked   
     * @return True if the titular identification of the account is the same as the parameter, False if not.
     */
    public boolean isCorrectTitularId(String titularId, String id, String typeAccount) {
        switch (typeAccount) {
            case "Savings Account":
                SavingsAccount[] savingsAccounts = gson.fromJson(json, SavingsAccount[].class);
                for (int i = 0; i < savingsAccounts.length; i++) {
                    if (savingsAccounts[i].getId().equals(id)) {
                        if (savingsAccounts[i].getTitularId().equals(titularId)) {
                            return true;
                        }
                    }
                }
                break;
            case "Checkings Account":
                CheckingAccount[] checkingsAccounts = gson.fromJson(json, CheckingAccount[].class);
                for (int i = 0; i < checkingsAccounts.length; i++) {
                    if (checkingsAccounts[i].getId().equals(id)) {
                        if (checkingsAccounts[i].getTitularId().equals(titularId)) {
                            return true;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public String getSavings() {
        return database.returnJsonSavings();
    }

    public String getCheckings() {
        return database.returnJsonCheckings();
    }

    /**
     * This method let us deactivate an account
     *
     * @param id The identification of the account to be deleted
     * @param titularId The identification of the titular of the account
     * @param typeAccount The type of account to be deleted
     */
    public void deactivateAccount(String id, String titularId, String typeAccount) {

    }

    /**
     * This method let us add an account to JSON
     *
     * @param id The identification of the customer account
     * @param titularId The identification of the customer
     * @param typeAccount The type of account
     */
    public void addAccount(String id, String titularId, String typeAccount) {
        Gson gson = new Gson();     //Object to implements GSON API
        // Filtering information by type of account with cases
        switch (typeAccount) {
            case "Savings Account":
                String jsonSavings = database.returnJsonSavings(); //The whole json file
                SavingsAccount a = new SavingsAccount(id, titularId);
                String newSavingAccount = gson.toJson(a) + "]";
                writeSavings(jsonSavings, newSavingAccount);
                break;
            case "Checkings Account":
                String jsonCheckings = database.returnJsonCheckings(); //The whole json file
                CheckingAccount b = new CheckingAccount(id, titularId);
                String newCheckingAccount = gson.toJson(b) + "]";
                writeCheckings(jsonCheckings, newCheckingAccount);
                break;
        }
    }

}
