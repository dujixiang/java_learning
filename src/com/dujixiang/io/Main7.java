package com.dujixiang.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main7 {
    public static void main(String[] args) {

    }

    //简单的FileInputStream实例
    public void readFile() throws IOException{
        InputStream input = new FileInputStream("E:\\code\\java_learning\\source\\iotest1.txt");
        for(;;){
            int n = input.read();
            if(n==-1){
                break;
            }
            System.out.println(n);
        }
        input.close();
    }

    //通过try-finally实现读取完成后关闭文件
    public void readFile2() throws IOException{
        InputStream input = null;
        try{
            input = new FileInputStream("E:\\code\\java_learning\\source\\iotest1.txt");
            int n;
            while((n = input.read()) != -1){
                System.out.println(n);
            }
        }finally {
            if (input != null){
                input.close();
            }
        }
    }

    //利用try(source)语句简化关闭过程，感觉类似python里的with(open)
    public void readFile3() throws IOException{
        try(InputStream input = new FileInputStream("E:\\code\\java_learning\\source\\iotest1.txt")){
            int n;
            while ((n = input.read()) != -1){
                System.out.println(n);
            }
        }
    }

    //利用缓冲区一次读取多个字节
    public void readFile4() throws IOException{
        try(InputStream input = new FileInputStream("E:\\code\\java_learning\\source\\iotest1.txt")){
            //定义1000个字节大小的缓冲区
            byte[] buffer = new byte[1000];
            int n;
            while ((n = input.read(buffer)) != -1){
                System.out.println("read " + n + " bytes.");
            }
        }
    }
}

