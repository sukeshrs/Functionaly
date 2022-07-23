package com.sukesh.functional.function;

import com.sukesh.functional.Person;
import com.sukesh.functional.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FunctionUsage {
    private static final Logger LOGGER  = LoggerFactory.getLogger(FunctionUsage.class);
    public static void main(String[] args) {
        List<String> modifiableList = CommonUtil.buildStringList();
        //UnaryOperator extends Function interface.it accepts and returns the same parameter
        modifiableList.replaceAll(value -> value.toLowerCase(Locale.ROOT));
        LOGGER.info("Lowercase list : {}" , modifiableList);

        //List of Objects
        List<Person> personList = CommonUtil.returnPersonList();

        //List of Names
        List<String > names = Arrays.asList("john");
        //Find the persons with the name from the nameList
        List<Person> filteredList = personList.stream()
                .filter(person -> names.contains(person.getFirstName()))
                .collect(Collectors.toList());

        LOGGER.info("Filtered based on name list : {}" , filteredList);

    }
}
