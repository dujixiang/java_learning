package com.test;

import java.io.*;

public class DjxTest {
    public static void main(String[] args) throws IOException {

        try(InputStream input = new FileInputStream("E:\\code\\java_learning\\resource\\iotest1.txt")){
            try(OutputStream output = new FileOutputStream("E:\\code\\java_learning\\resource\\iotest2.txt")){
                byte[] buffer = new byte[1000];
                int n;
                while((n = input.read(buffer)) != -1){
                    output.write(buffer);
                    System.out.println("read " + n + "bytes.");
                }
            }
        }
    }
}
