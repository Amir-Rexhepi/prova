package com.example;

public class Main {
    public static void main(String[] args) {
        MioThread t1 = new MioThread(100);
        MioThread t2 = new MioThread(200);
        t1.start();
        t2.start();
        
    }
}