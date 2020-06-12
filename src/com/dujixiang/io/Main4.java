package com.dujixiang.io;

import java.io.File;
import java.io.IOException;

//创建和删除文件
public class Main4 {
    public static void main(String[] args) throws IOException {
        File f = File.createTempFile("tmp-",".txt");
        f.deleteOnExit();
        System.out.println(f.isFile());
        System.out.println(f.getAbsolutePath());
    }
}
