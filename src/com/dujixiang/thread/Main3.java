package com.dujixiang.thread;

public class Main3 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("start new thread");
    }
}
