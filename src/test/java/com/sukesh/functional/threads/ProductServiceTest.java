package com.sukesh.functional.threads;

import com.sukesh.functional.threads.scatter.ProductService;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class ProductServiceTest {
    private ProductService service = new ProductService();

    @Test
    void shouldReturnTheAggregatedResultsFromTheServices(){
       Set<Integer> prices = service.getProductPricing();
       System.out.println(prices);
    }
}
