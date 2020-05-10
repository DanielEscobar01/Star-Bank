/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Accounts.CheckingAccount;
import Accounts.SavingsAccount;
import com.google.gson.Gson;
import javax.swing.JOptionPane;

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
        Database database = new Database();
        switch (typeAccount) {
            case "Savings Account":
                SavingsAccount[] savingsAccounts = gson.fromJson(database.returnJson(typeAccount), SavingsAccount[].class);
                for (int i = 0; i < savingsAccounts.length; i++) {
                    if (savingsAccounts[i].getId().equals(id)) {
                        return true;
                    }
                }
                break;
            case "Checkings Account":
                CheckingAccount[] checkingsAccounts = gson.fromJson(database.returnJson(typeAccount), CheckingAccount[].class);
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
     *
     * @param titularId The identification of the titular of the account
     * @param id The identification of the account
     * @param typeAccount The type of account to be checked
     * @return True if the titular identification of the account is the same as
     * the parameter, False if not.
     */
    public boolean isCorrectTitularId(String titularId, String id, String typeAccount) {
        Database database = new Database();
        switch (typeAccount) {
            case "Savings Account":
                SavingsAccount[] savingsAccounts = gson.fromJson(database.returnJson(typeAccount), SavingsAccount[].class);
                for (int i = 0; i < savingsAccounts.length; i++) {
                    if (savingsAccounts[i].getId().equals(id)) {
                        if (savingsAccounts[i].getTitularId().equals(titularId)) {
                            return true;
                        }
                    }
                }
                break;
            case "Checkings Account":
                CheckingAccount[] checkingsAccounts = gson.fromJson(database.returnJson(typeAccount), CheckingAccount[].class);
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

    /**
     * This method let us get the JSON with savings account from the database
     *
     * @return The JSON with savings accounts
     */
    public String getSavings() {
        return database.returnJson("Savings Account");
    }

    /**
     * This method let us get the JSON with checking accounts from the database
     *
     * @return The JSON with checking accounts
     */
    public String getCheckings() {
        return database.returnJson("Checkings Account");
    }

    /**
     * This method let us deactivate an account
     *
     * @param id The identification of the account to be deleted
     * @param titularId The identification of the titular of the account
     * @param typeAccount The type of account to be deleted
     */
    public void deactivateAccount(String id, String titularId, String typeAccount) {
        if (existAccountId(id, typeAccount)) {
            if (isCorrectTitularId(titularId, id, typeAccount)) {
                Database database = new Database();
                switch (typeAccount) {
                    case "Savings Account":
                        SavingsAccount[] savingsAccounts = gson.fromJson(database.returnJson(typeAccount), SavingsAccount[].class);
                        for (int i = 0; i < savingsAccounts.length; i++) {
                            if (savingsAccounts[i].getId().equals(id)) {
                                savingsAccounts[i].setIsActive(false);
                            }
                        }
                        database.cleanJson(typeAccount);
                        for (int i = 0; i < savingsAccounts.length; i++) {
                            String newSavingAccount = gson.toJson(savingsAccounts[i]) + "]";
                            database.writeNewAccount(typeAccount, newSavingAccount);
                        }
                        Operation operationA = new Operation(id, 2);
                        database.addOperation(operationA.toString() + "]");
                        break;
                    case "Checkings Account":
                        CheckingAccount[] checkingsAccounts = gson.fromJson(database.returnJson(typeAccount), CheckingAccount[].class);
                        for (int i = 0; i < checkingsAccounts.length; i++) {
                            if (checkingsAccounts[i].getId().equals(id)) {
                                checkingsAccounts[i].setIsActive(false);
                            }
                        }
                        database.cleanJson(typeAccount);
                        for (int i = 0; i < checkingsAccounts.length; i++) {
                            String newCheckingAccount = gson.toJson(checkingsAccounts[i]) + "]";
                            database.writeNewAccount(typeAccount, newCheckingAccount);
                        }
                        Operation operationB = new Operation(id, 2);
                        database.addOperation(operationB.toString() + "]");
                        break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "The account does not exist, please check the account ID and the type of account");
        }
    }

    /**
     * This method let us add an account to JSON
     *
     * @param id The identification of the customer account
     * @param titularId The identification of the customer
     * @param typeAccount The type of account
     */
    public void addAccount(String id, String titularId, String typeAccount) {
        if (existAccountId(id, typeAccount)) {
            JOptionPane.showMessageDialog(null, "The account is already created");
        } else {
            Gson gson = new Gson();     //Object to implements GSON API
            // Filtering information by type of account with cases
            switch (typeAccount) {
                case "Savings Account":
                    SavingsAccount a = new SavingsAccount(id, titularId);
                    String newSavingAccount = gson.toJson(a) + "]";
                    Operation operationA = new Operation(a.getId(), 3);
                    database.writeNewAccount(typeAccount, newSavingAccount);
                    database.addOperation(operationA.toString() + "]");
                    break;
                case "Checkings Account":
                    CheckingAccount b = new CheckingAccount(id, titularId);
                    String newCheckingAccount = gson.toJson(b) + "]";
                    Operation operationB = new Operation(b.getId(), 3);
                    database.writeNewAccount(typeAccount, newCheckingAccount);
                    database.addOperation(operationB.toString() + "]");
                    break;
            }
        }
    }

    /**
     * This method let us make a deposit into an account
     *
     * @param accountId The identification of the account
     * @param typeAccount The type of the account
     * @param amount The amount to be deposited into the account
     */
    public void makeDeposit(String accountId, String typeAccount, double amount) {
        Database database = new Database();
        if (existAccountId(accountId, typeAccount)) {
            switch (typeAccount) {
                case "Savings Account":
                    SavingsAccount[] savingsAccounts = gson.fromJson(database.returnJson(typeAccount), SavingsAccount[].class);
                    int j = 0;
                    for (int i = 0; i < savingsAccounts.length; i++) {
                        if (savingsAccounts[i].getId().equals(accountId)) {
                            savingsAccounts[i].deposit(amount);
                            j = i;
                        }
                    }
                    System.out.println(savingsAccounts[j].getBalance());
                    database.cleanJson(typeAccount);
                    for (int i = 0; i < savingsAccounts.length; i++) {
                        String newSavingAccount = gson.toJson(savingsAccounts[i]) + "]";
                        database.writeNewAccount(typeAccount, newSavingAccount);
                    }
                    Operation operationA = new Operation(accountId, 0);
                    operationA.setAmount(amount);
                    database.addOperation(operationA.toString() + "]");
                    break;
                case "Checkings Account":
                    CheckingAccount[] checkingsAccounts = gson.fromJson(database.returnJson(typeAccount), CheckingAccount[].class);
                    for (int i = 0; i < checkingsAccounts.length; i++) {
                        if (checkingsAccounts[i].getId().equals(accountId)) {
                            checkingsAccounts[i].deposit(amount);
                        }
                    }
                    database.cleanJson(typeAccount);
                    for (int i = 0; i < checkingsAccounts.length; i++) {
                        String newCheckingAccount = gson.toJson(checkingsAccounts[i]) + "]";
                        database.writeNewAccount(typeAccount, newCheckingAccount);
                    }
                    Operation operationB = new Operation(accountId, 0);
                    operationB.setAmount(amount);
                    database.addOperation(operationB.toString() + "]");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "The account does not exist, please check the account ID and the type of account");

        }
    }

    public void withDraw(String accountId, String titular, String typeAccount, double amount) {
        
    }

}
