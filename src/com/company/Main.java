package com.company;

public class Main {
    static Second second;
    static FiveSecond fiveSecond;
    static SevenSecond sevenSecond;

    public static void main(String[] args) {
        second = new Second();
        fiveSecond = new FiveSecond(second);
        sevenSecond = new SevenSecond(second);

        int i = 0;
        while (i<15) {

            i++;
        }

    }


}
