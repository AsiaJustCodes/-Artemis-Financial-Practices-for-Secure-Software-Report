package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
@RestController
public class SslServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SslServerApplication.class, args);
    }

    //FIXME: Add route to enable checksum return of static data example: String data = "Hello World Check Sum!";
    @RequestMapping("/hash")
    public String getHash() throws NoSuchAlgorithmException {
        String data = "Hello World Check Sum!";
        String name = "Asia Mayfield";
        String[] splitName = name.split(" ");
        String firstName = splitName[0];
        String lastName = splitName[splitName.length - 1];
        name = firstName + " " + lastName;

        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] sha256 = messageDigest.digest(name.getBytes(StandardCharsets.UTF_8));

        return "data: " + data + "<br/><br/>" + "Name: " + name + "<br/><br/>" +
                "Name of the Cipher Algorithm Used: SHA-256<br/>CheckSum value: " + bytesToHex(sha256);
    }

    public String bytesToHex(byte[] sha256) {
        BigInteger hex = new BigInteger(1, sha256);
        StringBuilder checksum = new StringBuilder(hex.toString(16));

        while (checksum.length() < 64) {
            checksum.insert(0, '0');
        }

        return checksum.toString();
    }
}
