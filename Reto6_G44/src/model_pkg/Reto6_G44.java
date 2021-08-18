package model_pkg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import model_pkg.conexion;
import views_pkg.FrameHospitals;

/**
 *
 * @author Usuario
 */
public class Reto6_G44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        conexion inst_connect = new conexion();
        DatamodelDB inst_data = new DatamodelDB();
        FrameHospitals inst_frame = new FrameHospitals();
        inst_connect.getConnection();
        inst_frame.setVisible(true);
        inst_data.getOwners(1);

    }
    
}
