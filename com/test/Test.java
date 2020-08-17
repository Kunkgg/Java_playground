package com.test;

public class Test {
    public static void main(String[] args) {
        System.out.println("Here is com.test.Test");
    }

    public static String getFormattedRMB (double value) {
        return String.format("RMB %.2f", value);
    }
}
