/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_pkg;

import java.util.ArrayList;
import java.util.Scanner;
import Class_pkg.*;

/**
 *
 * @author Usuario
 */
public class EmployeeClass extends PersonClass {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    private Scanner inst_datos = new Scanner(System.in);
    private int salary;
    private int Category;
    private CompanyClass company;
    
   

    // CONSTRUCTOR SIN PARAMETROS 
    public EmployeeClass() {
    }

    // CONSTRUCTOR CON PARAMETROS 
    //public EmployeeClass(String name, String last_name, int identification_number, String email, CompanyClass company) {
    //  super(name, last_name, identification_number, email);
    // this.company = company;
    //}
    public EmployeeClass(String name, String last_name, int identification_number, int salary, String email, int Category, CompanyClass company) {
        super(name, last_name, identification_number, email);
        this.salary = salary;
        this.Category = Category;
        this.company = company;
        
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the Category
     */
    public int getCategory() {
        return Category;
    }

    /**
     * @param Category the Category to set
     */
    public void setCategory(int Category) {
        this.Category = Category;
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
        ArrayList<EmployeeClass> arrayObjectPerson = new ArrayList<>();
        Boolean exit_program = false;
        while (!exit_program) {
            System.out.println(ANSI_BLUE + "======================================================" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "               EMPRESA  MINTIC 2021" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "======================================================" + ANSI_RESET);
            System.out.println(ANSI_RED + "Selecciona una opcion del menú: " + ANSI_RESET);
            System.out.println("         1.Añadir empleados");
            System.out.println("         2.Listar empleados");
            System.out.println("         3.Editar empleado");
            System.out.println("         4.Eliminar empleado");
            System.out.println("         5.Salir del sistema");
            System.out.println("         Tu respuesta:");
            int option = Integer.parseInt(inst_datos.nextLine());
            switch (option) {
                case 1:
                    System.out.println(ANSI_RED + "Cuantos empleados desea añadir" + ANSI_RESET);
                    int num_employee = Integer.parseInt(inst_datos.nextLine());
                    System.out.println(ANSI_BLUE + "======================================================");
                    System.out.println(ANSI_BLUE + "           Formulario registro de empleados" + ANSI_RESET);
                    for (int i = 1; i <= num_employee; i++) {

                        System.out.println(ANSI_RED + " \n INFORMACION EMPLEADO " + i + "\n" + ANSI_RESET);

                        System.out.println(ANSI_RED + "Nombre: " + ANSI_RESET);
                        String Name = inst_datos.nextLine();

                        System.out.println(ANSI_RED + "Apellido: " + ANSI_RESET);
                        String Last_name = inst_datos.nextLine();

                        System.out.println(ANSI_RED + "Numero de identificacion: " + ANSI_RESET);
                        int Identification = Integer.parseInt(inst_datos.nextLine());

                        System.out.println(ANSI_RED + "Salario: " + ANSI_RESET);
                        int salary = Integer.parseInt(inst_datos.nextLine());

                        System.out.println(ANSI_RED + "Email: " + ANSI_RESET);
                        String Email = inst_datos.nextLine();
                        
                        CompanyClass company = new CompanyClass("MINTIC 2022", "1234567-8", "cra 50 #80 90");
                        System.out.println(ANSI_RED + "categoria:  \n 1. Administrativo:  \n 2. subordinado:  ");
                        int Category = Integer.parseInt(inst_datos.nextLine());
                                     
                        

                        EmployeeClass employee = new EmployeeClass(Name, Last_name, Identification, salary, Email, Category, company);
                        arrayObjectPerson.add(employee);
                        System.out.println(ANSI_BLUE + "========================Empleado creado con exito==============================");

                    }
                    break;

                case 2:
                    System.out.println(ANSI_BLUE + "========================BASE DE DATOS DE EMPELADOS==============================");
                    for (int i = 0; i < arrayObjectPerson.size(); i++) {
                        System.out.println("\n Empleado" + (i + 1));
                        EmployeeClass employee = arrayObjectPerson.get(i);
                        System.out.println(ANSI_RED + "Nombre: " + ANSI_RESET + employee.getName());
                        System.out.println(ANSI_RED + "Apellido:" + ANSI_RESET + employee.getLast_name());
                        System.out.println(ANSI_RED + "Numero Identificacion: " + ANSI_RESET + employee.getIdentification_number());
                        System.out.println(ANSI_RED + "Salario: " + ANSI_RESET + employee.getSalary());
                        System.out.println(ANSI_RED + "Email: " + ANSI_RESET + employee.getEmail());
                        System.out.println(ANSI_RED + "Categoria: " + ANSI_RESET + employee.getCategory());
                        System.out.println(ANSI_RED + "Company: " + ANSI_RESET + employee.getCompany());
                    }
                    break;
                case 3:
                    System.out.println(ANSI_BLUE + "========================EDITAR REGISTRO EMPLEADO==============================");
                    System.out.println(ANSI_RED + "Indicanos el indicie del empleado a modificar");
                    int index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= arrayObjectPerson.size()) {
                        EmployeeClass employee = arrayObjectPerson.get(index - 1);
                        System.out.println(ANSI_RED + "Informacion registrada del empleado: " + employee.getName() + " " + employee.getLast_name());
                        System.out.println(ANSI_RED + "Nombre: " + ANSI_RESET + employee.getName());
                        System.out.println(ANSI_RED + "Apellido:" + ANSI_RESET + employee.getLast_name());
                        System.out.println(ANSI_RED + "Numero Identificacion: " + ANSI_RESET + employee.getIdentification_number());
                        System.out.println(ANSI_RED + "Salario: " + ANSI_RESET + employee.getSalary());
                        System.out.println(ANSI_RED + "Email: " + ANSI_RESET + employee.getEmail());
                        System.out.println(ANSI_RED + "Categoria: " + ANSI_RESET + employee.getCategory());
                        System.out.println(ANSI_RED + "Company: " + ANSI_RESET + employee.getCompany());
                        System.out.println(ANSI_BLUE + "¿Qué dato desea editar? \n  1.Nombre\n  2.Apellido\n  3.Numero de identificacion\n  4.Salario\n  5.Email\n  6.Categoria\n   " + ANSI_RESET);
                        int option_edit = Integer.parseInt(inst_datos.nextLine());
                        switch (option_edit) {
                            case 1:
                                System.out.println(ANSI_RED + "Nombre nuevo" + ANSI_RESET);
                                String name = inst_datos.nextLine();
                                employee.setName(name);
                                break;
                            case 2:
                                System.out.println(ANSI_RED + "Apellido nuevo" + ANSI_RESET);
                                String Apellido = inst_datos.nextLine();
                                employee.setLast_name(Apellido);
                                break;
                            case 3:
                                System.out.println(ANSI_RED + "Numero identificacion nuevo" + ANSI_RESET);
                                int ID = Integer.parseInt(inst_datos.nextLine());
                                employee.setIdentification_number(ID);
                                break;
                            case 4:
                                System.out.println(ANSI_RED + "salario nuevo" + ANSI_RESET);
                                int salario = Integer.parseInt(inst_datos.nextLine());
                                employee.setSalary(salario);
                                break;
                            case 5:
                                System.out.println(ANSI_RED + "Email nuevo" + ANSI_RESET);
                                String Email = inst_datos.nextLine();
                                employee.setEmail(Email);
                                break;
                            case 6:
                                System.out.println(ANSI_RED + "Categoria nueva" + ANSI_RESET);
                                int categoria = Integer.parseInt(inst_datos.nextLine());
                                employee.setCategory(categoria);
                                break;
                            default:
                                System.out.println(ANSI_BLUE + "======================================================");
                                System.out.println(ANSI_BLUE + "               OPCION INVALIDA");
                                System.out.println(ANSI_BLUE + "======================================================");
                        }

                    }
                    break;
                case 4:
                    System.out.println(ANSI_BLUE + "========================ELIMINAR REGISTRO EMPLEADO==============================");
                    System.out.println(ANSI_RED + "Indicanos el indicie del empleado a eliminar del sistema" + ANSI_RESET);
                    index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= arrayObjectPerson.size()) {
                        EmployeeClass employee = arrayObjectPerson.get(index - 1);
                        System.out.println(ANSI_RED + "Seguro que desea eliminar el registro de: " + ANSI_RESET + employee.getName() + " " + employee.getLast_name());
                        String delete_employee = inst_datos.nextLine();
                        if (delete_employee.toLowerCase().equals("si") || delete_employee.toLowerCase().equals("sí")) {
                            arrayObjectPerson.remove(index - 1);
                        } else {
                            System.out.println(ANSI_RED + "Proceso cancelado" + ANSI_RESET);
                        }
                    } else {
                        System.out.println(ANSI_BLUE + "======================================================");
                    }
                    System.out.println(ANSI_BLUE + "               OPCION INVALIDA");
                    System.out.println(ANSI_BLUE + "======================================================" + ANSI_RESET);

                    break;
                case 5:
                    exit_program = true;
                    System.out.println(ANSI_BLUE + "======================================================");
                    System.out.println(ANSI_BLUE + "               SALIENDO DEL PROGRAMA");
                    System.out.println(ANSI_BLUE + "======================================================");
                    break;
                default:
                    System.out.println(ANSI_BLUE + "======================================================");
                    System.out.println(ANSI_BLUE + "               OPCION INVALIDA");
                    System.out.println(ANSI_BLUE + "======================================================");
            }
        }
    }

}
