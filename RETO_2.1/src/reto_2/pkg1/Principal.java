/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_2.pkg1;

import Class_pkg.*;
import static Class_pkg.EmployeeClass.ANSI_BLUE;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    private static Scanner inst_entrada_datos = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean exit_program = false;
        while (!exit_program) {
            EmployeeClass Employee = new EmployeeClass();
            ClientClass Client = new ClientClass();
            System.out.println(ANSI_BLUE + "======================================================" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "      BIENVENIDO AL SISTEMA DE GESTION DE PERSONAS" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "======================================================" + ANSI_RESET);
            System.out.println(ANSI_RED + "Ingrese el numero de la base de datos a consultar: \n  1.Empleados\n  2.Clientes\n  3.Salir");
            int option = Integer.parseInt(inst_entrada_datos.nextLine());
            switch (option) {
                case 1:
                     Employee.crud_person();
                    break;
                case 2:
                    Client.crud_person();
                    break;
                case 3:
                    exit_program = true;
                    System.out.println(ANSI_BLUE+"======================================================");
                    System.out.println(ANSI_BLUE+"               SALIENDO DEL PROGRAMA");
                    System.out.println(ANSI_BLUE+"======================================================");
                    break;
                default:
                    System.out.println(ANSI_BLUE+"======================================================");
                    System.out.println(ANSI_BLUE+"               OPCION INVALIDA");
                    System.out.println(ANSI_BLUE+"======================================================");
            }
        }
    }
}
