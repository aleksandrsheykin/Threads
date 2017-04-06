package com.company;

/**
 * Created by admin on 06.04.2017.
 */
public class FiveSecond implements Runnable {
    Thread t;
    Second second;

    public FiveSecond(Second second) {
        t = new Thread(this, "FiveSecondThread");
        this.second = second;
        t.start();
    }

    @Override
    public void run() {
        try {
            int i=0;
            while (true) {
                Thread.sleep(1000);
                synchronized(second) {
                    i++;
                    if (i == 5) {
                        i = 0;
                        second.wait();
                        System.out.println("Hello! I FiveSeconds thread");
                    } else {
                        if (!second.isAlive()) second.notify();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
