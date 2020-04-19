/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;

/**
 * This class let us create a branch office
 * @author danielescobar
 */
public class BranchOffice {

    private String id;
    private String address;
    private String name;
    private String city;

    /**
     * Constructor of a branch office
     * @param id The identification of the branch office
     * @param address The address of the branch office
     * @param name The name of the branch office
     * @param city The city of the branch office
     */
    public BranchOffice(String id, String address, String name, String city) {
        setId(id);
        setAddress(address);
        setName(name);
        setCity(city);
    }

    /**
     * This method let us get the identification of the branch office
     *
     * @return The identification of the branch office
     */
    public String getId() {
        return id;
    }

    /**
     * This method let us set the identification of the branch office
     *
     * @param id The identification of the branch office
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method let us get the address of the branch office
     *
     * @return The address of the branch office
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method let us set the address of the branch office
     *
     * @param address The address of the branch office
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method let us get the name of the branch office
     *
     * @return The name of the branch office
     */
    public String getName() {
        return name;
    }

    /**
     * This method let us set the name of the branch office
     *
     * @param name The name of the branch office
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method let us get the city of the branch office
     *
     * @return The city of the branch office
     */
    public String getCity() {
        return city;
    }

    /**
     * This method let us set the city of the branch office
     *
     * @param city The city of the branch office
     */
    public void setCity(String city) {
        this.city = city;
    }

}
