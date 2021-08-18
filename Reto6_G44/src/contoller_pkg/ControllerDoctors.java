/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoller_pkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model_pkg.DataDB;
import model_pkg.DatamodelDB;
import views_pkg.DialogDoctors;

  public class ControllerDoctors implements ActionListener {

    private final DialogDoctors view;

    public ControllerDoctors(DialogDoctors view) {
        this.view = view;
        getClinicas();
        ItemHospital item = (ItemHospital) view.cb_hospital.getSelectedItem();
        events();
    }

    public final void events() {
        view.cb_hospital.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

    public final void getClinicas() {
        ArrayList<DataDB> list;
        DatamodelDB model = new DatamodelDB();
        list = model.getHospitals(0);
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int id_hospital = list.get(i).getId_hospital();
                String hospital = list.get(i).getHospital();
                view.cb_hospital.addItem(new ItemHospital(id_hospital, hospital));
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron registro de clinicas", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }
}

