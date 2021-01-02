package com.sukesh.functional.predicate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Predicate;

public class PredicateUsage {

    public static final Logger LOGGER = LoggerFactory.getLogger(PredicateUsage.class);

    public static void main(String[] args) {
        //Java 7 way
        Predicate<String> p = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return  s.contains("and");
            }
        };

        //Java 8 way
        Predicate<String> pred = s -> s.contains("and");

        LOGGER.info("Contains 'and' ? : " + pred.test("Jack and Jill"));
        LOGGER.info("Contains 'and' ? : " + pred.test("Jack or Jill"));
    }
}
