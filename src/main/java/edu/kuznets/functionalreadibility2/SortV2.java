package edu.kuznets.functionalreadibility2;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;

public class SortV2 {

    private static List<Integer> getSorted(List<Integer> values) {
        return values
                .stream()
                .sorted()
                .toList();
    }

    public static List<Integer> getSortedKeys(Map<Integer, Integer> map) {
        return map
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .map(Entry::getKey)
                .toList();
    }
}