package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

	    System.out.println("Introduzca número de hilos a ejecutar.");

	    int x = scan.nextInt();

        for(int i=0;i<x;i++){
            long initialTime = System.currentTimeMillis();
            Thread thread = new Thread(i, initialTime);
            thread.start();
        }
    }
}
