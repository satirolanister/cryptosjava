/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad;

/**
 *
 * @author servicedesk05
 */
public class Claves {
    
        private String publicKey = "-----BEGIN PUBLIC KEY-----\n" +
                "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJIuQ+SfRUai7fizF6xciZJWV825w/RO\n" +
                "wWO7dDqrZXCqoiRNnJXIX+VVxe6qLrQz/k8E0ShPFolkVtcyy7/zHdsCAwEAAQ==\n" +
                "-----END PUBLIC KEY-----";
        private String privateKey = "-----BEGIN PRIVATE KEY-----\n" +
                "MIIBVQIBADANBgkqhkiG9w0BAQEFAASCAT8wggE7AgEAAkEAki5D5J9FRqLt+LMX\n" +
                "rFyJklZXzbnD9E7BY7t0OqtlcKqiJE2clchf5VXF7qoutDP+TwTRKE8WiWRW1zLL\n" +
                "v/Md2wIDAQABAkBVi++9jpvLD7R2U9Cp1OnJkvAFfA46HhC83cnSP9W4jahxqGps\n" +
                "bWWYaUN2LoK/E2dv8O5FLVKcXJZXDuozN6dxAiEA/TxPD/qhFJKQbPlnlij1/E8B\n" +
                "9PYzBP3RPvHrwqwFfXMCIQCTxsgCNFJ5PaVeg+UYYhWMVyRcF3CRE6V/c4585F1D\n" +
                "+QIgWtq9XvVDv5bJ/F8K3CP8BTbvc8y1B1BtN1Eijeib26MCIQCKLpykAw0DtfNG\n" +
                "mArHbCA+JNYpDvoBjt94eDPK8TeM8QIhAOSsqbydb3Y31ViC788SWkV6LgUR/7QV\n" +
                "tUUCtWxYjLzu\n" +
                "-----END PRIVATE KEY-----";

    public String getPublicKey() {
        return publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }
        
        
}
