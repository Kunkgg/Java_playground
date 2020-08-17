package com.test;

import com.test.Test.*;

class UseTestInsidePkg {
    public static void main(String[] args){

        double value = 99.5;

        String formattedRMB = getFormattedRMB(value);
        System.out.println("formattedRMB = " + formattedRMB);
    }
}
