package com.dujixiang.io;

import java.io.File;

public class Main2 {
    public static void main(String[] args) {
        File f = new File("..");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
//        System.out.println(f.getCanonicalPath());
    }
}
