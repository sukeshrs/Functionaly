package com.sukesh.functional.equals;

import com.sukesh.functional.threads.BlockinggQueue;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Concurrency {
    public static void main(String[] args) {
        BlockingQueue<String> bq =  new LinkedBlockingDeque<String>(10);
      //  BlockingQueue<String> bq =  new LinkedBlockingDeque<String>(10);
        Set set = new TreeSet();

        ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
        map.put("foo", "bar");
        map.put("han", "solo");
        map.put("r2", "d2");
        map.put("c3", "p0");


        map.forEach((key,value) -> System.out.printf("%s = %s\n", key, value));

        System.out.println(ForkJoinPool.getCommonPoolParallelism());


        LocalDate currentDate = LocalDate.now();
        LocalDate currentDate1 = currentDate;
        currentDate = LocalDate.MAX;


        AtomicInteger invalue = new AtomicInteger();
        AtomicInteger invalue1 = invalue;
        invalue = new AtomicInteger(1);

        System.out.println(invalue == invalue1);

        List<String> strings = new ArrayList<>();
        List<String> strings1 = strings;
        strings = new ArrayList<>();

        System.out.println(strings == strings1);

        final LocalDate date = LocalDate.now();

    }


    int count = 0;

    void increment() {
        count = count + 1;
    }



}
