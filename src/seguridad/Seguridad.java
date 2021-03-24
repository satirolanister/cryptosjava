package seguridad;

import java.util.Base64;
import presentacion.home;
import presentacion.signIn;



public class Seguridad {
    
    private String userdb = "alex";
    private String passdb = "hola";
       
    public void encriptar(String user, String pass){
        home h = new home();
        signIn s = new signIn();
             // Getting encoder  
        Base64.Encoder encoder = Base64.getEncoder();  
        // Encoding URL  
        String eStr = encoder.encodeToString(this.userdb.getBytes());  
        String pStr = encoder.encodeToString(this.passdb.getBytes());
        
        if(user == " " && pass == " "){
            System.out.println("Usuario o contraseña no pueden ser vacios");
        }else{
            Base64.Decoder decoder = Base64.getDecoder();  
            String dStr = new String(decoder.decode(eStr));  
            String fStr = new String(decoder.decode(pStr)); 
            
            if(dStr.equalsIgnoreCase(user) && fStr.equalsIgnoreCase(pass)){
                s.dispose();
                s.setVisible(false);
                h.setVisible(true);
                h.info(dStr);
            }else{
              s.setVisible(true);
            }
                
        };
        
        
        
        
    };    
    
   
}
