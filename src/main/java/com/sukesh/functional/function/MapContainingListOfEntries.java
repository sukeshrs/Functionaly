package com.sukesh.functional.function;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapContainingListOfEntries {
    public Map<String, String> getFilteredMap(Map<String, String> carPriceMap, List<String> carList) {
        Map<String, String> filteredMap = carPriceMap.entrySet()
                .stream()
                .filter(car -> carList.contains(car.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue));
        /**
         * The same logic can be written in a different syntax
         * instead of .collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue));
         * .collect(Collectors.toMap(car -> car.getKey() , car -> car.getValue()));
         */
        return filteredMap;
    }
}
