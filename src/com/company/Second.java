package com.company;

import java.util.Date;

/**
 * Created by admin on 06.04.2017.
 */
public class Second extends Thread {
    public boolean mustWrite;
    Thread s;

    public Second() {
        mustWrite = true;
        s = new Thread(this, "SecondThread");
        s.start();
    }

    @Override
    public void run()
    {
        try {
            while (true) {
                //synchronized(this) {
                    sleep(1000);
                    System.out.println(new Date());
                //}
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
