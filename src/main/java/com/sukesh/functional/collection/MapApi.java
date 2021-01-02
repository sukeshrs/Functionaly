package com.sukesh.functional.collection;

import com.sukesh.functional.Person;
import com.sukesh.functional.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class MapApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(MapApi.class);
    public static void main(String[] args) {

        Map<String , List<Person>> peopleInCities = new TreeMap<>();
        Map<String , List<Person>> peopleInSuburbs = new HashMap<>();
        List<Person> peopleInCalifornia = peopleInCities.get("California");
        LOGGER.info("People in california  first try {}" , peopleInCalifornia);

        //getOrDefult returns a default value when the key is not present in the map
        peopleInCalifornia = peopleInCities.getOrDefault("California", Collections.EMPTY_LIST);
        LOGGER.info("People in california second try {}" , peopleInCalifornia);

        peopleInCities.computeIfAbsent("California",city -> new ArrayList<>()).add(CommonUtil.returnPersonList().get(0));
        peopleInCities.computeIfAbsent("New York",city -> new ArrayList<>()).add(CommonUtil.returnPersonList().get(1));

        peopleInSuburbs.computeIfAbsent("Mason",city -> new ArrayList<>()).add(CommonUtil.returnPersonList().get(2));
        peopleInSuburbs.computeIfAbsent("Winchester" ,city -> new ArrayList<>()).add(CommonUtil.returnPersonList().get(3));

    }
}
