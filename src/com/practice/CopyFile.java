package com.practice;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException{
        if (args.length != 2){
            System.out.println("Usage:\n java CopyFile.java <source> <target>");
            System.exit(1);
        }
        copy(args[0],args[1]);
    }

    static void copy(String source, String target) throws IOException{
        try(InputStream input = new FileInputStream(source)){
            try(OutputStream output = new FileOutputStream(target)){
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
