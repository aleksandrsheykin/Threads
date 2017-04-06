package com.company;

public class Main {
    static Second second;
    static FiveSecond fiveSecond;

    public static void main(String[] args) {
        second = new Second();
        fiveSecond = new FiveSecond();

        int i = 0;
        while (i<8) {
            if (second.isFifth()) {
                fiveSecond.run();
                second.refresh();
            } else {
                second.run();
            }
            i++;
        }

    }


}
