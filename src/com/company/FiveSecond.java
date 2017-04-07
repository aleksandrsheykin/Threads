package com.company;

import static java.lang.Thread.sleep;

/**
 * Created by admin on 06.04.2017.
 */
public class FiveSecond implements Runnable {
    Thread t;
    Second second;
    int count;
    Object obj;

    public FiveSecond() {
        t = new Thread(this, "FiveSecondThread");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized(Main.locker) {
                    Main.locker.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (Main.count%5==0) {
                System.out.println("Hello! I FiveSeconds thread");
            }
        }
    }

}
