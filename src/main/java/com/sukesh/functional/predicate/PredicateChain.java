package com.sukesh.functional.predicate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateChain {
    private static final Logger LOGGER = LoggerFactory.getLogger(PredicateChain.class);
    private static final String MESSAGE_PREFIX = "The String ";
    private static final String IS_STRING = " is ";
    private static final String WITH_IN_LIMITS_MSG = "with in limits";
    private static final String OUT_OF_LIMITS_MSG = "not with in limits";


    public static void main(String[] args) {
        // Simple predicates
        Predicate<String> p1 = s -> s.length() > 5;
        Predicate<String> p2 = s -> s.length() < 20;

        //Combined predicates
        Predicate<String> p3 = p1.and(p2);

        //Get all the strings from the list
        List<String> stringList = buildStringList();

        stringList.forEach(stringValue -> buildMessageFormatter(stringValue, p3));
    }

    private static Consumer<String> getWriteLogConsumer() {
        Consumer<String> writeLogMessage = s -> LOGGER.info(s);
        return writeLogMessage;
    }

    private static List<String> buildStringList() {
        return Arrays.asList("Hello how are you", "Good Morning", "Happy New Yaer", "Coffee", "Hello", "Where", "What");
    }

    private static void buildMessageFormatter(String stringValue, Predicate<String> predicate) {
        Consumer<String> writeLogMessage = getWriteLogConsumer();
        StringBuilder builder = new StringBuilder(MESSAGE_PREFIX);
        builder.append(stringValue)
                .append(IS_STRING)
                .append(predicate.test(stringValue) ? WITH_IN_LIMITS_MSG : OUT_OF_LIMITS_MSG);
        writeLogMessage.accept(builder.toString());
    }

}
