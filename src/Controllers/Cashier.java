/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Accounts.*;
import Customers.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class let us create a cashier
 *
 * @author danielescobar
 */
public class Cashier {

    Gson gson = new Gson();
    String json;
    //Savings Account
    //Checkings Account

    public String returnJsonSavings() {
        String json = "";
        try (BufferedReader br = new BufferedReader(new FileReader("savingsAccounts.json"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                json += line;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (json.length() == 0) {
            return "[]";
        } else {
            return json;
        }
    }

    public String returnJsonCheckings() {
        String json = "";
        try (BufferedReader br = new BufferedReader(new FileReader("checkingsAccounts.json"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                json += line;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (json.length() == 0) {
            return "[]";
        } else {
            return json;
        }
    }

    public static void writeSavings(String json, String account) {
        String auxiliar = json.substring(0, json.length() - 1); //Removes the last ]
        if (json.length() == 2) {
            auxiliar = auxiliar + account;
        } else {
            auxiliar = auxiliar + "," + account;
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("savingsAccounts.json"))) {
            bw.write(auxiliar);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeCheckings(String json, String account) {
        String auxiliar = json.substring(0, json.length() - 1); //Removes the last ]
        if (json.length() == 2) {
            auxiliar = auxiliar + account;
        } else {
            auxiliar = auxiliar + "," + account;
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("checkingsAccounts.json"))) {
            bw.write(auxiliar);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
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
        Gson gson = new Gson();     //Object to implements GSON API
        // Filtering information by type of account with cases
        switch (typeAccount) {
            case "Savings Account":
                String jsonSavings = returnJsonSavings(); //The whole json file
                SavingsAccount a = new SavingsAccount(id, titularId);
                String newSavingAccount = gson.toJson(a) + "]";
                writeSavings(jsonSavings, newSavingAccount);
                break;
            case "Checking Account":
                String jsonCheckings = returnJsonCheckings(); //The whole json file
                CheckingAccount b = new CheckingAccount(id, titularId);
                String newCheckingAccount = gson.toJson(b) + "]";
                writeCheckings(jsonCheckings, newCheckingAccount);
                break;
        }

    }

}
