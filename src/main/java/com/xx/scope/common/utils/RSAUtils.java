package com.xx.scope.common.utils;

import org.apache.tomcat.util.codec.binary.Base64;


import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * RSA加解密工具<br>
 */
public class RSAUtils {
    public static String RSA_ALGORITHM = "RSA";
    public static String UTF8 = "UTF-8";


    public static final String pub = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCNgKfMl3Qe2o3zAhiauL0ZFRi28M+6eKycupEQva2a00kXymqcwFgh2Jyak4sV1xIzJ3w9UvDkk0KaQGwtz5y0sTu68Ud2RTHDhoVvzCRWOgaZF4wQQmtBEeaukGmwxRcNLZ8xTLqKoyUpuTZsWpIS6fSGK9ZQ/LWpnqv4Hoi7awIDAQAB";
    public static final String pri = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAI2Ap8yXdB7ajfMCGJq4vRkVGLbwz7p4rJy6kRC9rZrTSRfKapzAWCHYnJqTixXXEjMnfD1S8OSTQppAbC3PnLSxO7rxR3ZFMcOGhW/MJFY6BpkXjBBCa0ER5q6QabDFFw0tnzFMuoqjJSm5NmxakhLp9IYr1lD8tameq/geiLtrAgMBAAECgYAG56ZIh4N1FfkjSJDmy+j+Vlc0Zh/c25Kgu0Hk7TyRd4nzjT8Skxg53pYVvOlmkW4j7ONVIrz6im0PleExgxYEcIjafqrK1z5dn/q2yItOA849Vow4k+6iEy1C+/6bxm5ZH0eDAob8MWczlGNvMXDX3kD8F3vUAbtINwzy6QdwUQJBANS/y1CVSYClCctf6nXcyRzB+9Lna6MRKVRscbEovZP1q6Z8ryknO5RqjDKWeDSDA+ejIMnpdL4lHH561EDFYBUCQQCqRPB3cn6TdmbugvVObXM/1Erp5tWZz8QF5VTyVpT4SPYha6ajfusfv3/wsKM6Y3yW+44CrA+C+/uRcxq+CQ1/AkAxsl+/AjB6UZMZI920DJAaHKJDoPV+0QpzgyWHubmXL4MaT/PmzBhZ0g3P32BS++vUl0GYiOVRaX/fd7fPLYwFAkAhf9rHxXD91ke+GWnl+ka4gi4TAuV3k5b/ifVCkKJSjxhNzv5EII5l+qlTU41pyXUTx35TLEMJBEakgT77sJBFAkBSSy0E5hb3hzCJesmvByZZZohLunMUM5UfVo/tUrmr4CsFRGloaTh3MoyrlOmeOw4HH2bCgKwmlD/AQ1AegAFg";


    /**
     * 创建公钥私钥
     *
     * @return
     * @throws Exception
     */
    public static KeyStore createKeys() throws Exception {
        KeyPairGenerator keyPairGeno = KeyPairGenerator.getInstance(RSA_ALGORITHM);
        keyPairGeno.initialize(1024);
        KeyPair keyPair = keyPairGeno.generateKeyPair();

        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();

        KeyStore keyStore = new KeyStore();
        keyStore.setPublicKey(Base64.encodeBase64String(publicKey.getEncoded()));
        keyStore.setPrivateKey(Base64.encodeBase64String(privateKey.getEncoded()));
        return keyStore;
    }

    /**
     * 获取公钥对象
     *
     * @param pubKeyData
     * @return
     * @throws Exception
     */
    public static RSAPublicKey getPublicKey(byte[] pubKeyData) throws Exception {
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(pubKeyData);
        KeyFactory keyFactory = KeyFactory.getInstance(RSA_ALGORITHM);
        return (RSAPublicKey) keyFactory.generatePublic(keySpec);
    }

    /**
     * 获取公钥对象
     *
     * @param pubKey
     *            公钥
     * @return
     * @throws Exception
     */
    public static RSAPublicKey getPublicKey(String pubKey) throws Exception {
        return getPublicKey(Base64.decodeBase64(pubKey));

    }

    /**
     * 获取私钥对象
     *
     * @param priKey
     *            私钥
     * @return
     * @throws Exception
     */
    public static RSAPrivateKey getPrivateKey(String priKey) throws Exception {
        return getPrivateKey(Base64.decodeBase64(priKey));
    }

    /**
     * 通过私钥byte[]将公钥还原，适用于RSA算法
     *
     * @param keyBytes
     * @return
     * @throws Exception
     */
    public static RSAPrivateKey getPrivateKey(byte[] keyBytes) throws Exception {
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(RSA_ALGORITHM);
        return (RSAPrivateKey) keyFactory.generatePrivate(keySpec);

    }

    public static String encryptByPublicKey(String data, String publicKey) throws Exception {
        return encryptByPublicKey(data, getPublicKey(publicKey));
    }

    /**
     * 公钥加密
     *
     * @param data
     * @param publicKey
     * @return
     * @throws Exception
     */
    public static String encryptByPublicKey(String data, RSAPublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] bytes = cipher.doFinal(data.getBytes(UTF8));
        return Base64.encodeBase64String(bytes);
    }

    public static String decryptByPublicKey(String data, String rsaPublicKey) throws Exception {
        return decryptByPublicKey(data, getPublicKey(rsaPublicKey));
    }

    /**
     * 公钥解密
     *
     * @param data
     * @param rsaPublicKey
     * @return
     * @throws Exception
     */
    public static String decryptByPublicKey(String data, RSAPublicKey rsaPublicKey) throws Exception {
        Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, rsaPublicKey);
        byte[] inputData = Base64.decodeBase64(data);
        byte[] bytes = cipher.doFinal(inputData);
        return new String(bytes, UTF8);
    }

    public static String encryptByPrivateKey(String data, String privateKey) throws Exception {
        return encryptByPrivateKey(data, getPrivateKey(privateKey));
    }

    /**
     * 私钥加密
     *
     * @param data
     * @param privateKey
     * @return
     * @throws Exception
     */
    public static String encryptByPrivateKey(String data, RSAPrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, privateKey);
        byte[] bytes = cipher.doFinal(data.getBytes(UTF8));
        return Base64.encodeBase64String(bytes);
    }

    public static String decryptByPrivateKey(String data, String privateKey) throws Exception {
        return decryptByPrivateKey(data, getPrivateKey(privateKey));
    }

    /**
     * 私钥解密
     *
     * @param data
     * @param privateKey
     * @return
     * @throws Exception
     */
    public static String decryptByPrivateKey(String data, RSAPrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] inputData = Base64.decodeBase64(data);
        byte[] bytes = cipher.doFinal(inputData);
        return new String(bytes, UTF8);
    }


    public static class KeyStore {
        private String publicKey;
        private String privateKey;

        public String getPublicKey() {
            return publicKey;
        }

        public void setPublicKey(String publicKey) {
            this.publicKey = publicKey;
        }

        public String getPrivateKey() {
            return privateKey;
        }

        public void setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
        }
    }


    public static void main(String[] args) throws Exception {
// 生成一对公私钥
        KeyStore keyPair = RSAUtils.createKeys();
        System.out.println("公钥：" + keyPair.getPublicKey());
        System.out.println("私钥：" + keyPair.getPrivateKey());
    }
}
