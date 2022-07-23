package com.sukesh.functional.algorithms.map;

import java.util.Map;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ConcurrentTest {
    static Map<String , Long> orders = new ConcurrentHashMap<>();

    public static void main(String args[]) throws InterruptedException {
        orders.put("doordash" , 0l);
        orders.put("amazon" , 0l);
        orders.put("uber", 0l);
        orders.put("lyft" , 0l);


        String string = "Sukesh";
        IntStream value1 = string.chars();
        value1.forEach(System.out::println);
       int value = string.indexOf("m");
       System.out.println(value);

        ExecutorService service = Executors.newFixedThreadPool(2);

        service.submit(ConcurrentTest::processOrders);
        service.submit(ConcurrentTest::processOrders);

        service.awaitTermination(3, TimeUnit.SECONDS);
        service.shutdown();
        System.out.println(orders);

        ScheduledExecutorService service1 = Executors.newScheduledThreadPool(10);
        service1.schedule(()-> System.out.println("Running"),0,TimeUnit.MILLISECONDS);
        service1.scheduleAtFixedRate(()-> System.out.println("Running") , 5 ,6,TimeUnit.SECONDS);

        service1.scheduleWithFixedDelay(() -> System.out.println("Run") , 1,7, TimeUnit.SECONDS);


      //  services.schedule(()->System.out.print("RUnning"), 10, TimeUnit.MILLISECONDS);
    }

    private static void processOrders() {
        for (String city : orders.keySet()){
            for (int i =0 ; i < 50 ;i++){
                Long oldOrder = orders.get(city);
                orders.put(city, oldOrder + 1);
            }
        }
    }
}
