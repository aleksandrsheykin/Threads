package com.company;

/**
 * Created by admin on 06.04.2017.
 */
public class FiveSecond extends Thread {

    @Override
    public void run() {
        try {
            sleep(1000);
            System.out.println("Hello! I FiveSeconds thread");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
