package com.company;

import java.util.Date;

/**
 * Created by admin on 06.04.2017.
 */
public class Second extends Thread {
    Thread s;

    public Second() {
        s = new Thread(this, "SecondThread");
        s.start();
    }

    @Override
    public void run()
    {
        try {
            while (true) {
                sleep(1000);
                Main.count++;
                System.out.println(new Date());
                synchronized(Main.locker) {
                    Main.locker.notify();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
