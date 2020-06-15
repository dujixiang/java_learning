package com.dujixiang.thread;

public class Main2 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}


class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("start new thread!");
    }
}