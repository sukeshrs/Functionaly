package com.sukesh.functional.collection;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapBenchMarking {

    @Test
    public void givenMaps_whenGetPut500KTimes_thenConcurrentMapFaster()
            throws Exception {
        Map<String, Object> hashtable = new Hashtable<>();
        Map<String, Object> synchronizedHashMap =
                Collections.synchronizedMap(new HashMap<>());
        Map<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        Map<String, Object>  hashMap= new HashMap<>();
        Map<String, Object>  concurrentSkipListMap= new ConcurrentSkipListMap<>();
        long hashtableAvgRuntime = timeElapseForGetPut(hashtable);
        long syncHashMapAvgRuntime =
                timeElapseForGetPut(synchronizedHashMap);
        long concurrentHashMapAvgRuntime =
                timeElapseForGetPut(concurrentHashMap);
        long hashMapAverageTime = timeElapseForGetPut(hashMap);

        long concurrentSkipListMapTime = timeElapseForGetPut(concurrentSkipListMap);

        System.out.println("hashtableAvgRuntime" + hashtableAvgRuntime);
        System.out.println("hashtableAvgRuntime" + syncHashMapAvgRuntime);
        System.out.println("hashtableAvgRuntime" + concurrentHashMapAvgRuntime);
        System.out.println("hashtableAvgRuntime" + hashMapAverageTime);
        System.out.println("hashtableAvgRuntime" + concurrentSkipListMapTime);

        assertTrue(hashtableAvgRuntime > concurrentHashMapAvgRuntime);
        assertTrue(syncHashMapAvgRuntime > concurrentHashMapAvgRuntime);
    }

    private long timeElapseForGetPut(Map<String, Object> map)
            throws InterruptedException {
        ExecutorService executorService =
                Executors.newFixedThreadPool(4);
        long startTime = System.nanoTime();
        for (int i = 0; i < 4; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 500_000; j++) {
                    int value = ThreadLocalRandom
                            .current()
                            .nextInt(10000);
                    String key = String.valueOf(value);
                    map.put(key, value);
                    map.get(key);
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        return (System.nanoTime() - startTime) / 500_000;
    }
}
