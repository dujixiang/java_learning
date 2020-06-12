package com.dujixiang.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main12 {
    public static void main(String[] args) throws IOException {
        byte[] data;
        try (ByteArrayOutputStream output = new ByteArrayOutputStream()){
            output.write("Hello ".getBytes("UTF-8"));
            output.write("World!".getBytes("UTF-8"));
            data = output.toByteArray();
        }
        System.out.println(new String(data,"UTF-8"));
    }
}
