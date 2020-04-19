/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customers;

import Accounts.Account;
import java.util.HashMap;

/**
 * This class let us create customers
 * @author danielescobar
 */
public abstract class Customer {

    private String id;
    private String name;
    private String phone;
    private String address;
    private String occupation;
    private boolean isSubscribed;
    private HashMap<String, Account> accounts = new HashMap<>();

    /**
     * The constructor of a customer 
     * @param id The identification of the customer
     * @param name  The name of the customer
     * @param phone The phone of the customer
     * @param address   The address of the customer
     * @param occupation    The occupation of the 
     */
    public Customer(String id, String name, String phone, String address, String occupation) {
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.name = name;
        this.occupation = occupation;
        this.isSubscribed = false;
    }

    /**
     * This method let us get the customer identification
     *
     * @return The identification of the customer
     */
    public String getId() {
        return id;
    }

    /**
     * This method let us set the identification of the Customer
     *
     * @param id The identification of the customer
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method let us get the name of the customer
     *
     * @return The name of the customer
     */
    public String getName() {
        return name;
    }

    /**
     * This method let us set the name of the customer
     *
     * @param name The name of the customer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method let us get the phone of the customer
     *
     * @return The phone of the customer
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method let us set the phone of the customer
     *
     * @param phone The phone of the customer
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method let us get the address of the customer
     *
     * @return The address of the customer
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method let us set the address of the customer
     *
     * @param address The address of the customer
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method let us get the occupation of the customer
     *
     * @return The occupation of the customer
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * This method let us set the occupation of the customer
     *
     * @param occupation The occupation of the customer
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * This method let us know if the customer is subscribed or not
     *
     * @return True if the customer is subscribed, False if not.
     */
    public boolean isSubscribed() {
        return isSubscribed;
    }

    /**
     * This method let us set if the customer is subscribed
     *
     * @param isSubscribed The status of the subscription of the customer
     */
    public void setIsSubscribed(boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    /**
     * @return the accounts
     */
    public HashMap<String, Account> getAccounts() {
        return accounts;
    }

    /**
     * @param accounts the accounts to set
     */
    public void setAccounts(HashMap<String, Account> accounts) {
        this.accounts = accounts;
    }

}
