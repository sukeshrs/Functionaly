package com.sukesh.functional.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicMagic {
    public static void main(String[] args) {
        /** Thread safe integer . Best to use for increment operations */
        AtomicInteger enhancedInteger = new AtomicInteger();
        enhancedInteger.set(1);
        updateValue(enhancedInteger);
        System.out.println("Value of the integer" + enhancedInteger.get());
        enhancedInteger.compareAndSet(2,10);
        System.out.println(enhancedInteger);

        enhancedInteger.compareAndSet(2,15);
        System.out.println(enhancedInteger);
    }

    private static void updateValue(AtomicInteger enhancedInteger) {
        enhancedInteger.set(2);
    }
}
