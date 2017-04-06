package com.company;

import java.sql.Date;

/**
 * Created by admin on 06.04.2017.
 */
public class Second extends Thread {
    private int numSec = 0;

    @Override
    public void run()
    {
        try {
            sleep(1000);
            System.out.println(System.currentTimeMillis());
            numSec++;
            if (numSec==6) {
                numSec = 0;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isFifth() {
        return numSec==4?true:false;
    }

    public void refresh() {
        numSec = 0;
    }
}
