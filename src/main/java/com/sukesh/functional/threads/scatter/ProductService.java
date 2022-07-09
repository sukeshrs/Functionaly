package com.sukesh.functional.threads.scatter;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProductService{
    ExecutorService service = Executors.newFixedThreadPool(3);


    public Set<Integer> getProductPricing(){
        Set<Integer> prices = new HashSet<>();
        service.submit(new Task("url1" , "aws" , prices));
        service.submit(new Task("url2", "gcp" , prices));
        service.submit(new Task("url3", "azure" , prices));

        //waits a set amount of time for the tasks to complete
        try {
            Thread.sleep(0x1);
        } catch (InterruptedException e) {
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
            Random random = new Random();
            random.nextInt();
            prices.add(random.nextInt());
            System.out.println("Test called" + ": " + Thread.currentThread().getName());
        }
    }

}

