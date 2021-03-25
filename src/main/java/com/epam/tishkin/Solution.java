package com.epam.tishkin;

public final class Solution {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(Singleton.getInstance());
        }).start();

        new Thread(() -> {
            System.out.println(Singleton.getInstance());
        }).start();
    }
}
