package com.company;

public class Main {
    static Second second;
    static FiveSecond fiveSecond;
    static SevenSecond sevenSecond;

    public static void main(String[] args) {
        second = new Second();
        fiveSecond = new FiveSecond();
        sevenSecond = new SevenSecond();

        int i = 0;
        while (i<15) {
            if (second.isFifth()) {
                fiveSecond.run();
                second.refresh();
            } else {
                if (second.isSeventh()) {
                    sevenSecond.run();
                    second.refresh7();
                } else {
                    second.run();
                }
            }
            i++;
        }

    }


}
