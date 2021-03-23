package seguridad;

import java.util.Base64;


public class Seguridad {

       
    public Seguridad(){
    };

    public void encriptar(String user, String pass){
        String userdb = "alex";
        String passdb = "hola";
             // Getting encoder  
        Base64.Encoder encoder = Base64.getEncoder();  
        // Encoding URL  
        String eStr = encoder.encodeToString(userdb.getBytes());  
        String pStr = encoder.encodeToString(passdb.getBytes());
        
        if(user == " " && pass == " "){
            System.out.println("Usuario o contraseña no pueden ser vacios");
        }else{
            Base64.Decoder decoder = Base64.getDecoder();  
            String dStr = new String(decoder.decode(eStr));  
            String fStr = new String(decoder.decode(pStr)); 
            
            if(dStr.equalsIgnoreCase(user) && fStr.equalsIgnoreCase(pass)){
                System.out.println("Acceso concedido");
            }else{
                System.out.println("Acceso no concedido");
            }

        };
        
        
        
        
    };    
    
   
}
