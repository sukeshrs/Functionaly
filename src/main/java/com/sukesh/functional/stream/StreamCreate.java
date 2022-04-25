package com.sukesh.functional.stream;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreate {
    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();

        stream =  Stream.of("uno");

        stream = Stream.of("one", "two", "three");

        // A constant stream
        stream = Stream.generate(() -> "one");

        stream = Stream.iterate("+", s -> s + "+");

        IntStream intStream = ThreadLocalRandom.current().ints();

        intStream.forEach(System.out::println);

        IntStream characters = "hello".chars();
        characters.forEach(System.out::println);

    }
}
