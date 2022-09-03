package com.sukesh.functional.threads.scatter.countdownlatch;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductService {

    AtomicInteger threadNumber = new AtomicInteger();
    ExecutorService service = Executors.newFixedThreadPool(3);
    CountDownLatch latch = new CountDownLatch(3);


    public Set<Integer> getProductPricing(){
        Set<Integer> prices = new HashSet<>();
        service.submit(new Task("url1" , "aws" , prices ,latch));
        service.submit(new Task("url2", "gcp" , prices , latch));
        service.submit(new Task("url3", "azure" , prices , latch));
        //Wait for the latch to count down to Zero
        try {
           // latch.await();
            // If the threads does not complete by 3 seconds the program will continue after 3 seconds
            latch.await(300, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return prices;
    }

    private class Task implements Runnable{

        private final CountDownLatch latch;
        private String url;
        private String productId;

        private Set<Integer> prices;

        public Task(String url, String productId, Set<Integer> prices, CountDownLatch latch) {
            this.url = url;
            this.productId = productId;
            this.prices = prices;
            this.latch = latch;
        }

        @Override
        public void run() {
            int threadNo = threadNumber.incrementAndGet();
            Random random = new Random();
            random.nextInt();
            try {
                if(threadNo == 1) {
                    Thread.sleep(400);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            prices.add(random.nextInt());
            //Each thread decrements the count  after the operation is done
            latch.countDown();
            System.out.println("Test called" + ": " + Thread.currentThread().getName());
        }
    }

}

