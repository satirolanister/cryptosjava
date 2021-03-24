/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import seguridad.Seguridad;


/**
 *
 * @author servicedesk05
 */
public class Login {
    
    private String userlogin;
    private String passlogin;
    
    
    public void signUp(String user, String pass){
       Seguridad seguridad = new Seguridad();

       this.userlogin = user;
       this.passlogin = pass;

       seguridad.encriptar(userlogin, passlogin);
    }
    
}
