package com.sukesh.functional.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReading {

    public static void main(String[] args) {
        String fileName = "C:\\data\\hello.txt";

        try {
           Path path = Paths.get(fileName);
           System.currentTimeMillis();
           System.out.println("Processors " + Runtime.getRuntime().availableProcessors());
            Stream<String> lines = Files.lines(path);
            List<String> list = lines.map(line -> line.toUpperCase(Locale.ROOT))
                    .collect(Collectors.toList());
            System.out.println(list);

            List<String> list1 = lines.map(line -> line.toUpperCase(Locale.ROOT))
                    .collect(Collectors.toList());
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
