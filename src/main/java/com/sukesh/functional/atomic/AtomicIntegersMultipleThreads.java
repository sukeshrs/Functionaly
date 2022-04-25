package com.sukesh.functional.atomic;

import com.sukesh.functional.util.ConcurrentUtil;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AtomicIntegersMultipleThreads {
    public static void main(String[] args) {
        AtomicInteger atomicInt = new AtomicInteger(0);
        ExecutorService executor = Executors.newFixedThreadPool(1);

        IntStream.range(0,1000)
                .forEach(i -> executor.submit(atomicInt::incrementAndGet));
        ConcurrentUtil.stop(executor);
        System.out.println(atomicInt.get());


//
//        IntStream.range(0, 1000)
//                .forEach(i -> {
//                    Runnable task = () ->
//                            atomicInt.accumulateAndGet(i, (n, m) -> n + m);
//                    executor.submit(task);
//                });
//        System.out.println(atomicInt.get());
//        ConcurrentUtil.stop(executor);
    }
}
