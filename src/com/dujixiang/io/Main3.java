package com.dujixiang.io;

import java.io.File;

public class Main3 {
    public static void main(String[] args) {
        File f1 = new File("E:\\code\\java_learning\\source");
        File f2 = new File("E:\\code\\java_learning\\source\\iotest1.txt");
        File f3 = new File("E:\\code\\java_learning\\source\\nothing");
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.isDirectory());
    }
}
