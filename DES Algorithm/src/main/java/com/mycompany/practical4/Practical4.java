/*

//DES Algorithm:-
//Part1:-

package com.mycompany.destest1;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import java.util.BASE64Encoder;
import java.util.BASE64Dncoder;

public class Destest1 {

    private SecretKey key;
    public String theKey;

    public void generateKey() throws Exception {
        DESKeySpec deskeySpec = new DESKeySpec(theKey.getBytes());
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        key = keyFactory.generateSecret(deskeySpec);
    }

    public String encrypt(String messg) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(cipher.ENCRYPT_MODE, key);
        byte[] stringBytes = messg.getBytes("UTF-8");
        byte[] raw = cipher.doFinal(stringBytes);
        BASE64Encoder encode = new BASE64Encoder();
        String base64 = encode.encode(raw);
        return base64;
    }

    public String decrypt(String encrypted) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(cipher.DECRYPT_MODE, key);
        BASE64Decoder decode = new BASE64Decoder();
        byte[] raw = decode.decodeBuffer(encrypted);
        byte[] stringBytes = cipher.doFinal(raw);
        String clear = new String(stringBytes, "UTF-8");
        return clear;
    }

    public static void main(String[] args) {
        String messg = "Shallun Monteiro";
        String decrypted;
        String encrypted;
        Destest1 des = new Destest1();
        des.theKey = "1,2,3,4,5,6";
        try {
            des.generateKey();
            System.out.println("Clear Message: " + messg);
            encrypted = des.encrypt(messg);
            decrypted = des.decrypt(encrypted);
            System.out.println("Encrypted Message: " + encrypted);
            System.out.println("Decrypted Message: " + decrypted);
        } catch (Exception e) {
        }
    }
}

*/

//---------------------------------------------------------------------------------------------------------------------


/*
//DES Algorithm:-
//Part2:-

package com.mycompany.destest1;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import java.util.Base64;

public class Destest1 {

    private SecretKey key;
    public String theKey;

    public void generateKey() throws Exception {
        DESKeySpec deskeySpec = new DESKeySpec(theKey.getBytes());
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        key = keyFactory.generateSecret(deskeySpec);
    }

    public String encrypt(String messg) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(cipher.ENCRYPT_MODE, key);
        byte[] stringBytes = messg.getBytes("UTF-8");
        byte[] raw = cipher.doFinal(stringBytes);
        String base64 = Base64.getEncoder().encodeToString(raw);
        return base64;
    }

    public String decrypt(String encrypted) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(cipher.DECRYPT_MODE, key);
        byte[] raw = Base64.getDecoder().decode(encrypted);
        byte[] stringBytes = cipher.doFinal(raw);
        String clear = new String(stringBytes, "UTF-8");
        return clear;
    }

    public static void main(String[] args) {
        String messg = "Shallun Monteiro";
        String decrypted;
        String encrypted;
        Destest1 des = new Destest1();
        des.theKey = "12345678"; // Note: DES key should be 8 bytes long
        try {
            des.generateKey();
            System.out.println("Clear Message: " + messg);
            encrypted = des.encrypt(messg);
            decrypted = des.decrypt(encrypted);
            System.out.println("Encrypted Message: " + encrypted);
            System.out.println("Decrypted Message: " + decrypted);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

*/

//--------------------------------------------------------------------------------------------------------------------------


/*
//AES Algorithm:-
//Part1:-

package com.mycompany.destest1;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Aestest {

    private byte[] keyValue;

    public Aestest(String key) {
        keyValue = key.getBytes();
    }

    private Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, "AES");
        return key;
    }

    public String encrypt(String messg) throws Exception {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] raw = cipher.doFinal(messg.getBytes());
        BASE64Encoder encoder = new BASE64Encoder();
        String base64 = encoder.encode(raw);
        return base64;
    }

    public String decrypt(String encrypted) throws Exception {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] raw = decoder.decodeBuffer(encrypted);
        byte[] stringBytes = cipher.doFinal(raw);
        String clear = new String(stringBytes, "UTF8");
        return clear;
    }

    public static void main(String[] args) {
        String messg = "MITTU DON";
        String decrypted;
        String encrypted;
        Aestest aest = new Aestest("1v39eptlvuhaqqsr");
        try {
            System.out.println("AES:");
            System.out.println("Clear Message: " + messg);
            encrypted = aest.encrypt(messg);
            System.out.println("Encrypted Message: " + encrypted);
            decrypted = aest.decrypt(encrypted);
            System.out.println("Decrypted Message: " + decrypted);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

*/

//---------------------------------------------------------------------------------------------------------------------------------

/*

//AES Algorithm:-
//Part2:-

package com.mycompany.destest1;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;

public class Aestest {

    private byte[] keyValue;

    public Aestest(String key) {
        keyValue = key.getBytes();
    }

    private Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, "AES");
        return key;
    }

    public String encrypt(String messg) throws Exception {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] raw = cipher.doFinal(messg.getBytes());
        String base64 = Base64.getEncoder().encodeToString(raw);
        return base64;
    }

    public String decrypt(String encrypted) throws Exception {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] raw = Base64.getDecoder().decode(encrypted);
        byte[] stringBytes = cipher.doFinal(raw);
        String clear = new String(stringBytes, "UTF-8");
        return clear;
    }

    public static void main(String[] args) {
        String messg = "MITTU DON";
        String decrypted;
        String encrypted;
        Aestest aest = new Aestest("1v39eptlvuhaqqsr");
        try {
            System.out.println("AES:");
            System.out.println("Clear Message: " + messg);
            encrypted = aest.encrypt(messg);
            System.out.println("Encrypted Message: " + encrypted);
            decrypted = aest.decrypt(encrypted);
            System.out.println("Decrypted Message: " + decrypted);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

*/