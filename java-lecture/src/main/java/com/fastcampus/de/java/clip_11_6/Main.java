package com.fastcampus.de.java.clip_11_6;

public class Main {
    public static void main(String[] args) {
        Bird pigeon = new Pigeon();
        Bird peocock = new Peacock();

        System.out.println("---- 비둘기 ----");
        pigeon.fly(1,1,3);

        System.out.println("---- 공작새 ----");
        peocock.fly(1,1,1);

        System.out.println("----높이 나는 비둘기 ----");
        pigeon.fly(3,3,500000);

    }
}
