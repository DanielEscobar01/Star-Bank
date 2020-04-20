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

    /**
     * This method let us get the JSON of savings accounts
     *
     * @return The string with savings accounts JSON
     */
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

    /**
     * This method let us get the JSON of checking accounts
     *
     * @return The string with checking accounts JSON
     */
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

    /**
     * This method let us write a new account into savings account JSON
     *
     * @param json The string of JSON file
     * @param account The string with values of account
     */
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

    /**
     * This method let us write a new account into checking account JSON
     *
     * @param json The string of JSON file
     * @param account The string with values of account
     */
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
        Verify verification = new Verify();
        verification.addAccount(id, titularId, typeAccount);  
    }

    public void deactivateAccount() {

    }

}
