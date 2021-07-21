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
public class ClientClass extends PersonClass {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    private Scanner inst_datos = new Scanner(System.in);
    private String address;
    private String number_phone;
    private CompanyClass company;

    public ClientClass() {
    }

    public ClientClass(String name, String last_name, int identification_number, String email, String address, String number_phone) {
        super(name, last_name, identification_number, email);
        this.address = address;
        this.number_phone = number_phone;
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

    /**
     * @return the number_phone
     */
    public String getNumber_phone() {
        return number_phone;
    }

    /**
     * @param number_phone the number_phone to set
     */
    public void setNumber_phone(String number_phone) {
        this.number_phone = number_phone;
    }

    /**
     * @return the company
     */
    public CompanyClass getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(CompanyClass company) {
        this.company = company;
    }

    @Override
    public void crud_person() {
        PersonClass Person = new PersonClass();
        ArrayList<ClientClass> arrayObjectPerson = new ArrayList<>();
        Boolean exit_program = false;
        while (!exit_program) {
            System.out.println(ANSI_BLUE + "======================================================" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "               EMPRESA  MINTIC 2021" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "======================================================" + ANSI_RESET);
            System.out.println(ANSI_RED + "Selecciona una opcion del menú: " + ANSI_RESET);
            System.out.println("         1.Añadir Clientes");
            System.out.println("         2.Listar Clientes");
            System.out.println("         3.Editar Cliente");
            System.out.println("         4.Eliminar Cliente");
            System.out.println("         5.Salir del sistema");
            System.out.println("         Tu respuesta:" + ANSI_RESET);
            int option = Integer.parseInt(inst_datos.nextLine());
            switch (option) {
                case 1:
                    System.out.println(ANSI_RED + "Cuantos Clientes desea añadir" + ANSI_RESET);
                    int num_Client = Integer.parseInt(inst_datos.nextLine());
                    System.out.println(ANSI_BLUE + "======================================================");
                    System.out.println(ANSI_BLUE + "           Formulario registro de empleados" + ANSI_RESET);
                    for (int i = 1; i <= num_Client; i++) {

                        System.out.println(ANSI_RED + " \n INFORMACION CLIENTE " + i + "\n" + ANSI_RESET);

                        System.out.println(ANSI_RED + "Nombre: " + ANSI_RESET);
                        String Name = inst_datos.nextLine();

                        System.out.println(ANSI_RED + "Apellido: " + ANSI_RESET);
                        String Last_name = inst_datos.nextLine();

                        System.out.println(ANSI_RED + "Numero de identificacion: " + ANSI_RESET);
                        int Identification = Integer.parseInt(inst_datos.nextLine());

                        System.out.println(ANSI_RED + "Email: " + ANSI_RESET);
                        String Email = inst_datos.nextLine();

                        System.out.println(ANSI_RED + "Direccion: " + ANSI_RESET);
                        String Address = inst_datos.nextLine();

                        System.out.println(ANSI_RED + "Telefono: " + ANSI_RESET);
                        String number_phone = inst_datos.nextLine();

                        ClientClass Client = new ClientClass(Name, Last_name, Identification, Email, Address, number_phone);
                        arrayObjectPerson.add(Client);
                        System.out.println(ANSI_RED + "========================Cliente creado con exito==============================" + ANSI_RESET);
                    }
                    break;

                case 2:
                    System.out.println(ANSI_BLUE + "========================BASE DE DATOS DE CLIENTES==============================" + ANSI_RESET);
                    for (int i = 0; i < arrayObjectPerson.size(); i++) {
                        System.out.println(ANSI_RED+"\n CLIENTE " + (i + 1)+ANSI_RESET);
                        ClientClass Client = arrayObjectPerson.get(i);
                        System.out.println(ANSI_RED + "Nombre: " + ANSI_RESET + Client.getName());
                        System.out.println(ANSI_RED + "Apellido:" + ANSI_RESET + Client.getLast_name());
                        System.out.println(ANSI_RED + "Numero Identificacion: " + ANSI_RESET + Client.getIdentification_number());
                        System.out.println(ANSI_RED + "Email: " + ANSI_RESET + Client.getEmail());
                        System.out.println(ANSI_RED + "Direccion: " + ANSI_RESET + Client.getAddress());
                        System.out.println(ANSI_RED + "Telefono: " + ANSI_RESET + Client.getNumber_phone());
                    }
                    break;
                case 3:
                    System.out.println(ANSI_BLUE + "========================EDITAR REGISTRO CLIENTE==============================" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "Indicanos el indicie del cliente a modificar" + ANSI_RESET);
                    int index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= arrayObjectPerson.size()) {
                        ClientClass Client = arrayObjectPerson.get(index - 1);
                        System.out.println(ANSI_RED + "Informacion registrada del empleado: " + ANSI_RESET + Client.getName() + " " + Client.getLast_name());
                        System.out.println(ANSI_RED + "Nombre: " + ANSI_RESET + Client.getName());
                        System.out.println(ANSI_RED + "Apellido:" + ANSI_RESET + Client.getLast_name());
                        System.out.println(ANSI_RED + "Numero Identificacion: " + ANSI_RESET + Client.getIdentification_number());
                        System.out.println(ANSI_RED + "Email: " + ANSI_RESET + Client.getEmail());
                        System.out.println(ANSI_RED + "Direccion: " + ANSI_RESET + Client.getAddress());
                        System.out.println(ANSI_RED + "Telefono: " + ANSI_RESET + Client.getNumber_phone());
                        System.out.println(ANSI_BLUE + "¿Qué dato desea editar? \n  1.Nombre\n  2.Apellido\n  3.Numero de identificacion\n  4.Email\n  5.Direccion\n  6.Telefono\n   " + ANSI_RESET);
                        int option_edit = Integer.parseInt(inst_datos.nextLine());
                        switch (option_edit) {
                            case 1:
                                System.out.println(ANSI_RED + "Nombre nuevo" + ANSI_RESET);
                                String name = inst_datos.nextLine();
                                Client.setName(name);
                                break;
                            case 2:
                                System.out.println(ANSI_RED + "Apellido nuevo" + ANSI_RESET);
                                String Apellido = inst_datos.nextLine();
                                Client.setLast_name(Apellido);
                                break;
                            case 3:
                                System.out.println(ANSI_RED + "Numero identificacion nuevo" + ANSI_RESET);
                                int ID = Integer.parseInt(inst_datos.nextLine());
                                Client.setIdentification_number(ID);
                                break;
                            case 4:
                                System.out.println(ANSI_RED + "Email nuevo" + ANSI_RESET);
                                String Email = inst_datos.nextLine();
                                Client.setEmail(Email);
                                break;
                            case 5:
                                System.out.println(ANSI_RED + "Direccion nuevo" + ANSI_RESET);
                                String Direccion = inst_datos.nextLine();
                                Client.setAddress(Direccion);
                                break;
                            case 6:
                                System.out.println(ANSI_RED + "Telefono nueva" + ANSI_RESET);
                                String Telefono = inst_datos.nextLine();
                                Client.setNumber_phone(Telefono);
                                break;
                            default:
                                System.out.println(ANSI_BLUE + "======================================================");
                                System.out.println(ANSI_BLUE + "               OPCION INVALIDA");
                                System.out.println(ANSI_BLUE + "======================================================");

                        }
                    }
                    break;
                case 4:
                    System.out.println(ANSI_BLUE + "========================ELIMINAR REGISTRO CLIENTE==============================");
                    System.out.println(ANSI_RED+"Indicanos el indicie del Cliente a eliminar del sistema"+ANSI_RESET);
                    index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= arrayObjectPerson.size()) {
                        ClientClass Client = arrayObjectPerson.get(index - 1);
                        System.out.println(ANSI_RED+"Seguro que desea eliminar el registro de: " +ANSI_RESET+ Client.getName() + " " + Client.getLast_name());
                        String delete_Client = inst_datos.nextLine();
                        if (delete_Client.toLowerCase().equals("si") || delete_Client.toLowerCase().equals("sí")) {
                            arrayObjectPerson.remove(index - 1);
                        } else {
                            System.out.println(ANSI_BLUE+"Proceso cancelado");
                        }
                    } else {
                        System.out.println(ANSI_BLUE + "======================================================");
                        System.out.println(ANSI_BLUE + "               OPCION INVALIDA");
                        System.out.println(ANSI_BLUE + "======================================================");
                    }
                    break;
                case 5:
                    exit_program = true;
                    System.out.println(ANSI_BLUE + "======================================================");
                    System.out.println(ANSI_BLUE + "               SALIENDO DEL PROGRAMA");
                    System.out.println(ANSI_BLUE + "======================================================");
                    break;
                default:
                    System.out.println(ANSI_BLUE+"======================================================");
                    System.out.println(ANSI_BLUE+"               OPCION INVALIDA");
                    System.out.println(ANSI_BLUE+"======================================================");
            }

        }
    }
}
