package com.company;

/**
 * Created by admin on 06.04.2017.
 */
public class SevenSecond implements Runnable {
    Thread t;
    Second second;

    public SevenSecond(Second second) {
        t = new Thread(this, "FiveSecondThread");
        this.second = second;
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            if (Main.count%7==0) {
                System.out.println("Hello! I FiveSeconds thread");
                try {
                    synchronized(Main.locker) {
                        Main.locker.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
