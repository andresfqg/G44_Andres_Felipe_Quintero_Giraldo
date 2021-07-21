/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_pkg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonClass {
    
    private Scanner inst_datos = new Scanner(System.in);
    private String name;
    private String last_name;
    private int identification_number;
    private String email;

// CONSTRUCTOR SIN PARAMETROS 
    public PersonClass() {
    }

    // CONSTRUCTOR SIN PARAMETROS
    public PersonClass(String name, String last_name, int identification_number, String email) {
        this.name = name;
        this.last_name = last_name;
        this.identification_number = identification_number;
        this.email = email;
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
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the identification_number
     */
    public int getIdentification_number() {
        return identification_number;
    }

    /**
     * @param identification_number the identification_number to set
     */
    public void setIdentification_number(int identification_number) {
        this.identification_number = identification_number;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public void crud_person() {
        ArrayList<PersonClass> arrayObjectPerson = new ArrayList<>();
        System.out.println("Indicanos que base de datos desea consultar:\n  1. Empleados\n  2.CLientes");
        int index = Integer.parseInt(inst_datos.nextLine());
        Boolean exit_program = false;
        while (!exit_program) {
            System.out.println("======================================================");
            System.out.println("               EMPRESA  MINTIC 2021");
            System.out.println("======================================================");
        }
    }
}
