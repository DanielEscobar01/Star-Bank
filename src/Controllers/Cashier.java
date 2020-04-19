/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Accounts.*;
import Customers.*;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

/**
 *
 * @author danielescobar
 */
public class Cashier {

    Gson gson = new Gson();
    String json;
    //Savings Account
    //Checkings Account

    public void addAccount(String id, String titularId, String kindOfAccount) {
        //Verify information before creating an account using verification package
        if (kindOfAccount.equals("Savings Account")) {
            SavingsAccount a = new SavingsAccount(id, titularId);
            // Saber cuando poner el "]"
            String h = "";
            try (BufferedReader br = new BufferedReader(new FileReader("cuentas.json"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    h += line;
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            json = h + gson.toJson(a);
            System.out.println(json);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("cuentas.json"))) {
                bw.append(json + ",");
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            //La unica forma de añadirla es que tenga 20000 de saldo
        } else {
            CheckingAccount a = new CheckingAccount(id, titularId);
            String h = "";
            try (BufferedReader br = new BufferedReader(new FileReader("cuentas.json"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    h += line;
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            json = h + gson.toJson(a);
            System.out.println(json);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("cuentas.json"))) {
                bw.append(json + ",");
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }
}
