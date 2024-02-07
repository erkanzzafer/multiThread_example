/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multithread;

/**
 *
 * @author zafer
 */
public class MultithreadingDemo extends Thread {

    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getName()
                    + " is running");
            for (int i = 5; i > 0; i--) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(1000);
            }
            Thread.sleep(1000);
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
