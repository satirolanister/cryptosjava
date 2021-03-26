package seguridad;


import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import seguridad.Claves;


public class Asimetrico {
    private static final String algorithm = "RSA";
    private static Cipher cipher;
    private static KeyFactory keyFactory;
    private static Base64.Decoder decoder = Base64.getDecoder();
    private static Base64.Encoder encoder = Base64.getEncoder();

    private static PublicKey getPublicKey(String publicKey) throws Exception {
        String publicKeyAsPEM = publicKey.replace("-----BEGIN PUBLIC KEY-----", "");
        publicKeyAsPEM = publicKeyAsPEM.replace("-----END PUBLIC KEY-----", "");
        publicKeyAsPEM = publicKeyAsPEM.replace("\n", "");
        byte[] publicKeyBytes = decoder.decode(publicKeyAsPEM);
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(publicKeyBytes);
        return keyFactory.generatePublic(x509EncodedKeySpec);
    }

    private static PrivateKey getPrivateKey(String privateKey) throws Exception {
        String privateKeyAsPEM = privateKey.replace("-----BEGIN PRIVATE KEY-----", "");
        privateKeyAsPEM = privateKeyAsPEM.replace("-----END PRIVATE KEY-----", "");
        privateKeyAsPEM = privateKeyAsPEM.replace("\n", "");
        byte[] privateKeyBytes = decoder.decode(privateKeyAsPEM);
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
        return keyFactory.generatePrivate(pkcs8EncodedKeySpec);
    }

    private static String encrypt(String publicKeyAsString, String message) throws Exception {
        PublicKey publicKey = getPublicKey(publicKeyAsString);
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());
        return encoder.encodeToString(encryptedBytes);
    }

    private static String decrypt(String privateKeyAsString, String cipherText) throws Exception {
        PrivateKey privateKey = getPrivateKey(privateKeyAsString);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] encryptedBytes = decoder.decode(cipherText);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }
    
    public String cifrado(String user) throws Exception{
        
        Claves c = new Claves();
        String publicKey = c.getPublicKey();
        /*String privateKey = c.getPrivateKey();*/
        
        cipher = Cipher.getInstance(algorithm);
        keyFactory = KeyFactory.getInstance(algorithm);

        String u = user;
        String encrypted = encrypt(publicKey, u);
        return encrypted;
        
        /*String decrypted = decrypt(privateKey, encrypted);
        System.out.println("El mensaje descifrado es: " + decrypted);*/
    
    }
}
