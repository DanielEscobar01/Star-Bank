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
public class Company extends Customer {

    private String companyName;
    private String nit;
    private String commercialSection;

    /**
     * Constructor of a company
     *
     * @param id The identification of the company
     * @param name The name of the legal representative of the company
     * @param phone The phone of the company
     * @param address The address of the company
     * @param occupation The occupation of the company
     * @param companyName The name of the company
     * @param nit The NIT of the company
     * @param commercialSection The commercial section of the company
     */
    public Company(String id, String name, String phone, String address, String occupation, String companyName, String nit, String commercialSection) {
        super(id, name, phone, address, occupation);
        setNit(nit);
        setCompanyName(companyName);
        setCommercialSection(commercialSection);
    }

    /**
     * This method let us get the name of the company
     *
     * @return The name of the company
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method let us set the name of the company
     *
     * @param companyName The name of the company
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * This method let us get the NIT of the company
     *
     * @return The NIT of the company
     */
    public String getNit() {
        return nit;
    }

    /**
     * This method let us set the NIT of the company
     *
     * @param nit The nit of the company
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * This method let us get the commercial section of the company
     *
     * @return The commercial section of the company
     */
    public String getCommercialSection() {
        return commercialSection;
    }

    /**
     * This method let us set the commercial section of the company
     *
     * @param commercialSection The commercial section of the company
     */
    public void setCommercialSection(String commercialSection) {
        this.commercialSection = commercialSection;
    }

}
