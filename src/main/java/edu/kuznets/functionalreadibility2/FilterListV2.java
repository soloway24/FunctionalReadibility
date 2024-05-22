package edu.kuznets.functionalreadibility2;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import static java.util.Collections.min;
import static java.util.stream.Collectors.toMap;

public class FilterListV2 {

    private static List<Integer> getFiltered(List<Integer> values) {
        return values
                .stream()
                .filter(i -> i > 0)
                .filter(i -> i * i % 3 == 1)
                .map(i -> i + i - 1)
                .toList();
    }

    public static Map<Integer, List<Integer>> getMapFiltered(Map<Integer, List<Integer>> map) {
        return map
                .entrySet()
                .stream()
                .filter(entry -> min(entry.getValue()) > 0)
                .collect(toMap(Entry::getKey, Entry::getValue));
    }
}