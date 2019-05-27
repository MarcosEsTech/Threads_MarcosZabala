package com.company;

public class Thread extends java.lang.Thread {

    private int n;
    private long time;

    public Thread(int n, long time){
        this.n = n;
        this.time = time;
    }

    public int getN(){
        return n;
    }

    public void setN(int n){
        this.n=n;
    }

    public long getTime(){
        return time;
    }

    public void setTime(long time){
        this.time=time;
    }

    public void run(){
        try {
            Thread.sleep((n+1)*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello " + (n+1));
    }
}
