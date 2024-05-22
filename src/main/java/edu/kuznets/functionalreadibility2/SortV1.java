package edu.kuznets.functionalreadibility2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import static java.util.Map.Entry.comparingByValue;

public class SortV1 {

    private static List<Integer> getSorted(List<Integer> values) {
        List<Integer> clone = new ArrayList<>(values);
        Collections.sort(clone);
        return clone;
    }

    public static List<Integer> getSortedKeys(Map<Integer, Integer> map) {
        List<Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(comparingByValue());

        List<Integer> keys = new ArrayList<>();
        for (var entry : entries) {
            keys.add(entry.getKey());
        }
        return keys;
    }
}
