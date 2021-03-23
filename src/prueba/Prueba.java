/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import seguridad.Seguridad;
import java.util.Scanner;

/**
 *
 * @author servicedesk05
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String userlogin = "";
       String passlogin = "";
       Seguridad seguridad = new Seguridad();
       
       System.out.println("Bienvenido, ingrese por favor");
       System.out.println("por favor ingrese usuario");
       Scanner userentrada = new Scanner(System.in);
       userlogin = userentrada.nextLine();
       System.out.println("por favor ingrese contraseña");
       Scanner passentrada = new Scanner(System.in);
       passlogin = passentrada.nextLine();
       
       seguridad.encriptar(userlogin, passlogin);
       
    };
    
    
}
