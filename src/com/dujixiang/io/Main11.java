package com.dujixiang.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main11 {
    public static void main(String[] args) {

    }

    //一次写入一个字节
    public void writeFile() throws IOException{
        OutputStream output = new FileOutputStream("out/readme.txt");
        output.write(72);
        output.write(101);
        output.write(108);
        output.write(108);
        output.write(111);
        output.close();
    }

    //一次写入若干字节，利用OutputStream的重载方法void write(byte[])
    public void writeFile2() throws IOException{
        OutputStream output = new FileOutputStream("out/readme.txt");
        output.write("Hello".getBytes("UTF-8"));
        output.close();
    }

    //利用try(resource)保证正确关闭
    public void writeFile3() throws IOException{
        try (OutputStream output = new FileOutputStream("out/readme.txt")){
            output.write("Hello".getBytes("UTF-8"));
        }
    }
}
