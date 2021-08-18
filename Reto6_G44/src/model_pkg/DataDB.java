/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

/**
 *
 * @author Usuario
 */
public class DataDB {

    private int id_owner;
    private String owner;
    private int id_hospital;
    private String hospital;

    public DataDB() {
        this.id_owner = 0;
        this.owner = "";
        this.id_hospital = 0;
        this.hospital = "";

    }
    
     public int getId_hospital() {
        return id_hospital;
    }

    public void setId_hospital(int id_hospital) {
        this.id_hospital = id_hospital;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }


    public int getId_owner() {
        return id_owner;
    }

    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
