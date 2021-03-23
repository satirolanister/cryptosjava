/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import seguridad.Seguridad;
import java.util.Scanner;

/**
 *
 * @author servicedesk05
 */
public class Login {
    
    
    public void signUp(){
        Seguridad seguridad = new Seguridad();
        
       String userlogin = "";
       String passlogin = "";
       
       
       System.out.println("Bienvenido, ingrese por favor");
       System.out.println("por favor ingrese usuario");
       Scanner userentrada = new Scanner(System.in);
       userlogin = userentrada.nextLine();
       System.out.println("por favor ingrese contraseña");
       Scanner passentrada = new Scanner(System.in);
       passlogin = passentrada.nextLine();
       
       seguridad.encriptar(userlogin, passlogin);
    }
    
}
