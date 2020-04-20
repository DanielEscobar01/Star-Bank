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
 * @author danielescobar
 */
public class Verify {
    
    
    
    
    
    
    /**
     * This method let us add an account to JSON
     *
     * @param id The identification of the customer account
     * @param titularId The identification of the customer
     * @param typeAccount The type of account
     */
    public void addAccount(String id, String titularId, String typeAccount) {
        Database database = new Database();
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
