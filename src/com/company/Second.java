package com.company;

import java.sql.Date;

/**
 * Created by admin on 06.04.2017.
 */
public class Second extends Thread {
    private int numSec = 0;
    private int numSec7 = 0;

    @Override
    public void run()
    {
        try {
            sleep(1000);
            System.out.println(System.currentTimeMillis());
            numSec++;
            numSec7++;
            if (numSec==5) {
                numSec = 0;
            }
            if (numSec7==7) {
                numSec7 = 0;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isFifth() {
        return numSec==4?true:false;
    }

    public boolean isSeventh() {
        return numSec7==6?true:false;
    }

    public void refresh() {
        numSec = 0;
    }

    public void refresh7() {
        numSec7 = 0;
    }
}
