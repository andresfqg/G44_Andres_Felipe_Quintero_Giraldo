/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_pkg;

/**
 *
 * @author Usuario
 */
public class CompanyClass {
   private String name;
   private String NIT;
   private String address;

   
    
    // CONSTRUCTOR CON PARAMETROS 
    public CompanyClass(String name, String NIT, String address) {
        this.name = name;
        this.NIT = NIT;
        this.address = address;
    }
   
   

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the NIT
     */
    public String getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
     
}
