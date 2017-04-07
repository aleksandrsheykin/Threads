package com.company;

public class Main {
    static Second second;
    static FiveSecond fiveSecond;
    static SevenSecond sevenSecond;
    static volatile Integer count = 0;
    public static volatile Object locker = new Object();

    public static void main(String[] args) {
        second = new Second();
        fiveSecond = new FiveSecond();
        sevenSecond = new SevenSecond(second);
    }
}
