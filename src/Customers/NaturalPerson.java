/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customers;

/**
 *
 * @author danielescobar
 */
public class NaturalPerson extends Customer {

    /**
     * Constructor of natural person
     *
     * @param id The identification of the natural person
     * @param name The name of the natural person
     * @param phone The phone of the natural person
     * @param address The address of the natural person
     * @param occupation The occupation of the natural person
     */
    public NaturalPerson(String id, String name, String phone, String address, String occupation) {
        super(id, name, phone, address, occupation);
    }

}
