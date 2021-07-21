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
public class AdminClass {
    private int subordinates;

    public AdminClass(int subordinates) {
        this.subordinates = subordinates;
    }

    AdminClass(AdminClass subordinates) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the subordinates
     */
    public int getSubordinates() {
        return subordinates;
    }

    /**
     * @param subordinates the subordinates to set
     */
    public void setSubordinates(int subordinates) {
        this.subordinates = subordinates;
    }
}
