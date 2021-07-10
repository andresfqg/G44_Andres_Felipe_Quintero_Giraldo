/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personclass;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class PersonClass {

    public PersonClass(String nombre_persona, String Tipo_doc, int numero_doc, String fecha_nacimiento, char genero, String ciudad_nacimiento, boolean tiene_hijos, boolean trabaja, String EPS) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inst_scanner = new Scanner(System.in);
        Date fecha_actual = new Date(100,4,13);
        SimpleDateFormat nuevo_formato_fecha = new SimpleDateFormat("dd/MM/yyyy");
        Person intspePerson = new Person("Andres", "C.C", 1053, nuevo_formato_fecha.format(fecha_actual), 'M', "Manizales", false, false, "Sura"); 
      
     // IMPRIMO LA FUNCION   
        System.out.println("*********** Funcion**********\n"+ intspePerson.consultar_info_persona());
    
     //LLAMO EL METODO 
       System.out.println("\n*********** Metodo**********\n");
       intspePerson.consultar_info_persona_metodo();
       
     // LLAMO METODO QUE CONSULTA POR CEDULA
        System.out.println("\n*********** Consulta por cedula **********\n");
        intspePerson.consultar_info_persona_por_cedula(1053);
        
     //CONSULTAR POR CEDULA INTRODUCCIDA POR EL USUARIO
        System.out.println("\n******Consulta por cedula ingresada por el usuario*****");
        System.out.println("\nDiligencie la cedula a consultar:");
        int cedula_persona =inst_scanner.nextInt();
        intspePerson.consultar_info_persona_por_cedula(cedula_persona);
     
     
    }
      
}
