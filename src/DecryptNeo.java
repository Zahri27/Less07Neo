public class DecryptNeo {
 public static void main(String[] args) {
 String message = "-$''$<k<#\"?.k9*))\"?";
String key = "%&";
 Decryptor decryptor = new Decryptor();
 String decryptedMessage = decryptor.decryptMessage(message, key);
 System.out.println("Расшифрованное сообщение: " + decryptedMessage);
}
}

    class Decryptor {
 public String decryptMessage(String encryptedMessage, String key) {
 int keyAsInt = getKeyAsInt(key);
 StringBuilder decryptedMessage = new StringBuilder();

 for (int i = 0; i < encryptedMessage.length(); i++) {
 char encryptedChar = encryptedMessage.charAt(i);
 char decryptedChar = (char) (encryptedChar ^ keyAsInt);
 decryptedMessage.append(decryptedChar);

}

 return decryptedMessage.toString();
 }

 private int getKeyAsInt(String key) {
int keyAsInt = 0;
for (char c : key.toCharArray()) {
 keyAsInt += c;
}
 return keyAsInt;
 }
    }

