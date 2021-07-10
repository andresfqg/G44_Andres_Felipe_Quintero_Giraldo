/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personclass;

/**
 *
 * @author Usuario
 */
// CREO LAS VARIABLES DE FORMA PRIVATE
public class Person {

    private String nombre;
    private String tipo_documento;
    private int numero_documento;
    private String fecha_nacimiento;
    private char genero;
    private String ciudad_nacimiento;
    private boolean tiene_hijos;
    private boolean trabaja_actualmente;
    private String nombre_eps;

    //CREO EL CONSTRUCTOR DE LA CLASE 
    public Person(String nombre, String tipo_documento, int numero_documento, String fecha_nacimiento, char genero, String ciudad_nacimiento, boolean tiene_hijos, boolean trabaja_actualmente, String nombre_eps) {
        this.nombre = nombre;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
        this.ciudad_nacimiento = ciudad_nacimiento;
        this.tiene_hijos = tiene_hijos;
        this.trabaja_actualmente = trabaja_actualmente;
        this.nombre_eps = nombre_eps;
    }

//CREO LOS GETTER Y SETTER
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo_documento
     */
    public String getTipo_documento() {
        return tipo_documento;
    }

    /**
     * @param tipo_documento the tipo_documento to set
     */
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    /**
     * @return the numero_documento
     */
    public int getNumero_documento() {
        return numero_documento;
    }

    /**
     * @param numero_documento the numero_documento to set
     */
    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * @return the ciudad_nacimiento
     */
    public String getCiudad_nacimiento() {
        return ciudad_nacimiento;
    }

    /**
     * @param ciudad_nacimiento the ciudad_nacimiento to set
     */
    public void setCiudad_nacimiento(String ciudad_nacimiento) {
        this.ciudad_nacimiento = ciudad_nacimiento;
    }

    /**
     * @return the tiene_hijos
     */
    public boolean isTiene_hijos() {
        return tiene_hijos;
    }

    /**
     * @param tiene_hijos the tiene_hijos to set
     */
    public void setTiene_hijos(boolean tiene_hijos) {
        this.tiene_hijos = tiene_hijos;
    }

    /**
     * @return the trabaja_actualmente
     */
    public boolean isTrabaja_actualmente() {
        return trabaja_actualmente;
    }

    /**
     * @param trabaja_actualmente the trabaja_actualmente to set
     */
    public void setTrabaja_actualmente(boolean trabaja_actualmente) {
        this.trabaja_actualmente = trabaja_actualmente;
    }

    /**
     * @return the nombre_eps
     */
    public String getNombre_eps() {
        return nombre_eps;
    }

    /**
     * @param nombre_eps the nombre_eps to set
     */
    public void setNombre_eps(String nombre_eps) {
        this.nombre_eps = nombre_eps;
    }

    // CREO LA FUNCION
    public String consultar_info_persona() {
        String tiene_hijos;
        String trabaja_actualmente;
        if (isTrabaja_actualmente()== true){
            trabaja_actualmente ="actualemtne trabaja";
        } else 
            trabaja_actualmente ="actualemtne no trabaja";{
                }
        if (isTiene_hijos() == true) {
            tiene_hijos = "si tiene hijos";
        } else {
            tiene_hijos = "no tiene hijos";
        }
        return "Informacion del Usuario: \n" + "  >>Nombre: "+ getNombre() + " \n  >>tipo de documento: " + getTipo_documento() + 
                "\n  >>Numero documento: " + getNumero_documento() + "\n  >>Fecha de nacimiento: "+ getFecha_nacimiento()+ "\n  >>Genero: " + getGenero() + 
                "\n  >>Ciudad de nacimiento: " + getCiudad_nacimiento() + "\n  >>Nombre Eps: " + getNombre_eps() +
                "\n  >>¿Tiene hijos?:" + tiene_hijos + "\n  >>¿Actualmente trabaja?: " + trabaja_actualmente;
    }

    //CREO UN METODO 
    public void consultar_info_persona_metodo() {
        String tiene_hijos;
        String trabaja_actualmente;
        if (isTrabaja_actualmente()== true){
            trabaja_actualmente ="actualemtne trabaja";
        } else 
            trabaja_actualmente ="actualemtne no trabaja";{
                }
        if (isTiene_hijos() == true) {
            tiene_hijos = "si tiene hijos";
        } else {
            tiene_hijos = "no tiene hijos";
        }
        System.out.println("Informacion del Usuario: \n" + "  >>Nombre: "+ getNombre() + " \n  >>tipo de documento: " + getTipo_documento() + 
                "\n  >>Numero documento: " + getNumero_documento() + "\n  >>Fecha de nacimiento: "+ getFecha_nacimiento()+ "\n  >>Genero: " + getGenero() + 
                "\n  >>Ciudad de nacimiento: " + getCiudad_nacimiento() + "\n  >>Nombre Eps: " + getNombre_eps() +
                "\n  >>¿Tiene hijos?:" + tiene_hijos + "\n  >>¿Actualmente trabaja?: " + trabaja_actualmente);
    }

    //CONSULTAR POR PARAMETRO
    public void consultar_info_persona_por_cedula(int cedula) {
        String tiene_hijos;
         String trabaja_actualmente;
        if (isTrabaja_actualmente()== true){
            trabaja_actualmente ="actualemtne trabaja";
        } else 
            trabaja_actualmente ="actualemtne no trabaja";{
                }
        if (getNumero_documento() == cedula) {
            if (isTiene_hijos() == true) {
                tiene_hijos = "si tiene hijos";
            } else {
                tiene_hijos = "no tiene hijos";
            }
            System.out.println("Informacion del Usuario: \n" + "  >>Nombre: "+ getNombre() + " \n  >>tipo de documento: " + getTipo_documento() + 
                "\n  >>Numero documento: " + getNumero_documento() + "\n  >>Fecha de nacimiento: "+ getFecha_nacimiento()+ "\n  >>Genero: " + getGenero() + 
                "\n  >>Ciudad de nacimiento: " + getCiudad_nacimiento() + "\n  >>Nombre Eps: " + getNombre_eps() +
                "\n  >>¿Tiene hijos?:" + tiene_hijos + "\n  >>¿Actualmente trabaja?: " + trabaja_actualmente);
        }else{
            System.out.println("El usuario consultado con la cedula "+cedula+" no existe");
        }

    }

}
