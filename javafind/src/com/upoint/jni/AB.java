package com.upoint.jni;

public class AB  extends Thread{
    public  Men men;
    public AB() {};
    public AB(Men men) {
        this.men = men;
    }
    @Override
    public void run() {
        int i = 100;
        while(i-->0) {
            System.out.println("线程中 值   i="+i+men.getAge());  
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
}
