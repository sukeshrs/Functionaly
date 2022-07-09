package com.sukesh.functional.threads.completableFuture;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ProductService {

    public Set<Integer> getProductPricing() {
        Set<Integer> prices = Collections.synchronizedSet(new HashSet<>());
        return prices;
    }

    private class Task implements Runnable{

        @Override
        public void run() {

        }
    }
}
