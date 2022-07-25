package com.sukesh.functional.function;

import java.util.List;
import java.util.Map;
import java.util.Set;
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

    public boolean checkIfMapContainsAllEntries(List<String> carList, Map<String, String> carPriceMap) {
        Set<String> uniqueEntries = carList.stream().collect(Collectors.toSet());
        return  carPriceMap.keySet()
                .containsAll(uniqueEntries);
    }

    public boolean checkIfMapDoesNotContainANyOfTheEntries(List<String> carList, Map<String, String> map) {
        return map.keySet()
                .stream()
                .noneMatch(key -> carList.contains(key));
    }
}
