package com.dujixiang.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main6 {
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get(".","project","study");
        System.out.println("p1: " + p1);
        Path p2 = p1.toAbsolutePath();
        System.out.println("p2: " + p2);
        Path p3 = p2.normalize();
        System.out.println("p3: " + p3);
        File f = p3.toFile();
        System.out.println("f: " + f);
        for (Path p : Paths.get("..").toAbsolutePath()){
            System.out.println(" " + p);
        }
    }
}
