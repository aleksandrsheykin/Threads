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
        try {
            int i=0;
            while (true) {
                i++;
                Thread.sleep(1000);
                if (i==7) {
                    i = 0;
                    second.mustWrite = false;
                    //second.wait();
                    System.out.println("777");
                } else {
                    second.mustWrite = true;
                    //if (!second.isAlive()) second.notify();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
