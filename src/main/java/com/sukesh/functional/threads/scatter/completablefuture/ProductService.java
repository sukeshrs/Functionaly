package com.sukesh.functional.threads.scatter.completablefuture;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductService {
    AtomicInteger threadNumber = new AtomicInteger();


    public Set<Integer> getProductPricing(){
        Set<Integer> prices = new HashSet<>();
        CompletableFuture<Void> future = CompletableFuture.runAsync(new Task("url1","id1",prices));
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(new Task("url2","id2",prices));
        CompletableFuture<Void> future2 = CompletableFuture.runAsync(new Task("url3","id3",prices));

        CompletableFuture<Void> allTasks = CompletableFuture.allOf(future,future1,future2);
        try {
            allTasks.get(300, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }

        return prices;
    }

    private class Task implements Runnable{
        private String url;
        private String productId;

        private Set<Integer> prices;

        public Task(String url, String productId, Set<Integer> prices) {
            this.url = url;
            this.productId = productId;
            this.prices = prices;
        }

        @Override
        public void run() {
            int threadNo = threadNumber.incrementAndGet();
            Random random = new Random();
            random.nextInt();
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            prices.add(random.nextInt());
            //Each thread decrements the count  after the operation is done
            System.out.println("Test called" + ": " + Thread.currentThread().getName());
        }
    }

}