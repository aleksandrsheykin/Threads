package com.company;

/**
 * Created by admin on 06.04.2017.
 */
public class SevenSecond extends Thread {
    @Override
    public void run() {
        try {
            sleep(1000);
            System.out.println("I SevenSeconds thread 777");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
