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
            String loginuser = encoder.encodeToString(user.getBytes());
            String loginpass = encoder.encodeToString(pass.getBytes());
            
            if(loginuser != eStr){
                
                System.out.println("El usuario no es valido");
                
                if(loginpass != pStr){
                    
                System.out.println("La contrasela no es valida");
                
                }
            }else{
                System.out.println("hola fue exitoso");
            }
            
            
            System.out.println(eStr +" "+ loginuser);
            
            /*   // Getting decoder  
            Base64.Decoder decoder = Base64.getDecoder();  
            // Decoding URl  
            String dStr = new String(decoder.decode(eStr));  
            String fStr = new String(decoder.decode(pStr));  */
        };
        
        
        
        
    };    
    
   
}
