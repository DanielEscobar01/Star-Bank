/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class will let us access into the JSON
 *
 * @author danielescobar
 */
public class Database {

    Gson gson = new Gson();
    String json;

    /**
     * This method let us get the JSON with the respective account type
     *
     * @param typeAccount The type of account your looking for
     * @return The JSON with all the accounts of that type
     */
    public String returnJson(String typeAccount) {
        String json = "";
        switch (typeAccount) {
            case "Savings Account":
                try (BufferedReader br = new BufferedReader(new FileReader("savingsAccounts.json"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
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
            case "Checkings Account":
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
        return null;
    }

    /**
     * This method let us save a new account into the JSON file
     *
     * @param typeAccount The type of account to be saved
     * @param account The account.ToString()
     */
    public void writeNewAccount(String typeAccount, String account) {
        switch (typeAccount) {
            case "Savings Account":
                String json = returnJson("Savings Account");
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
                break;
            case "Checkings Account":
                json = returnJson("Checkings Account");
                auxiliar = json.substring(0, json.length() - 1); //Removes the last ]
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
                break;
        }
    }

    /**
     * This method let us clean the JSON to add new values
     *
     * @param typeAccount
     */
    public void cleanJson(String typeAccount) {
        String json = "";
        switch (typeAccount) {
            case "Savings Account":
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("savingsAccounts.json"))) {
                    bw.write(json);
                } catch (FileNotFoundException ex) {
                    System.out.println(ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case "Checkings Account":
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("checkingsAccounts.json"))) {
                    bw.write(json);
                } catch (FileNotFoundException ex) {
                    System.out.println(ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
        }
    }

    /**
     * This method let us get the operations
     * @return The operations of the company
     */
    public String returnOperations() {
        String json = "";
        try (BufferedReader br = new BufferedReader(new FileReader("operations.json"))) {
            String line;
            while ((line = br.readLine()) != null) {
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
     * This method let us add a new operation
     * @param operation The operation to be added
     */
    public void addOperation(String operation){
        String json = returnJson("Savings Account");
                String auxiliar = json.substring(0, json.length() - 1); //Removes the last ]
                if (json.length() == 2) {
                    auxiliar = auxiliar + operation;
                } else {
                    auxiliar = auxiliar + "," + operation;
                }
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("operations.json"))) {
                    bw.write(auxiliar);
                } catch (FileNotFoundException ex) {
                    System.out.println(ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
    }
            
    /**
     *
     * @param json
     * @param accountType
     * @param accounts
     */
    public void overwrite(String json, String accountType, Object[] accounts) {

    }

}
