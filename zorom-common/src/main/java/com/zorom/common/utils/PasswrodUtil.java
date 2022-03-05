package com.zorom.common.utils;

import com.zorom.common.sm4.SMS4;
import org.springframework.security.crypto.codec.Base64;

import java.nio.charset.StandardCharsets;


public class PasswrodUtil {
    /**
     * 默认的16位的key
     */
   private final  static byte[] key = { 0x01, 0x23, 0x45, 0x67, (byte) 0x89, (byte) 0xab,
            (byte) 0xcd, (byte) 0xef, (byte) 0xfe, (byte) 0xdc,
            (byte) 0xba, (byte) 0x98, 0x76, 0x54, 0x32, 0x10 };
    public static void main(String[] args) {
        System.out.println(key.length);
        String str =PasswrodUtil.encodeSms4("aaaaaaaaa");
        System.out.println(str);
        String str1 =PasswrodUtil.decodeSms4(str);
        System.out.println(str1);
    }

    public static String encodeSms4(CharSequence charSequence){
        String str = charSequence.toString();
        String base64Str = new String(Base64.encode(str.getBytes(StandardCharsets.UTF_8)));
        byte[] in =base64Str.getBytes(StandardCharsets.UTF_8);
        for (int i =in.length%16;i<16; i++) {
            base64Str =base64Str+" ";
        }
        byte[] newIn = base64Str.getBytes(StandardCharsets.UTF_8);
        byte[] out = new byte[newIn.length];
        SMS4 sms4 = new SMS4();
        sms4.sms4(newIn,newIn.length,key ,out,1);
        return new String(Base64.encode(out));
    }
    public  static String decodeSms4(CharSequence charSequence){
        String str = charSequence.toString();
        byte[] in =Base64.decode(str.getBytes(StandardCharsets.UTF_8));
        byte[] out = new byte[in.length];
        SMS4 sms4 = new SMS4();
        sms4.sms4(in,in.length,key ,out,0);
        return new String(Base64.decode(out));
    }
}
