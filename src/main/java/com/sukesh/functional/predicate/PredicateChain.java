package com.sukesh.functional.predicate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateChain {
    public static final Logger LOGGER = LoggerFactory.getLogger(PredicateChain.class);

    public static void main(String[] args) {
        // Simple predicates
        Predicate<String> p1 = s -> s.length() > 5;
        Predicate<String> p2 = s -> s.length() < 20;

        //Combined predicates
        Predicate<String> p3 = p1.and(p2);

        //Get all the strings from the list
        List<String> stringList = buildStringList();

        // Log message consumer.Takes a String argument and logs it
        Consumer<String> writeLogMessage = s -> LOGGER.info(s);

        stringList.forEach(stringValue -> {
            StringBuilder builder = new StringBuilder("The string ");
            builder.append(stringValue)
                    .append(" is ")
                    .append(p3.test(stringValue) ? "with in limits" : "not with in limits");
            writeLogMessage.accept(builder.toString());
        });
    }

    private static List<String> buildStringList() {
        return Arrays.asList("Hello how are you", "Good Morning", "Happy New Yaer", "Coffee", "Hello", "Where", "What");
    }


}
