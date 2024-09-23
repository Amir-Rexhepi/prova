package com.example;

public class MioThread extends Thread {

    private int contatore; 
     public MioThread(int n){
        contatore = n;
     }
    
    public void run(){
        for(int i=0; i<contatore; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }

    }
}
