package edu.kuznets.functionalreadibility2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.min;

public class FilterListV1 {

    public static List<Integer> getFiltered(List<Integer> values) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer i : values) {
            if (i > 0 && i * i % 3 == 1) {
                filtered.add(i + i - 1);
            }
        }
        return filtered;
    }

    public static Map<Integer, List<Integer>> getMapFiltered(Map<Integer, List<Integer>> map) {
        Map<Integer, List<Integer>> filtered = new HashMap<>();
        for (var entry : map.entrySet()) {
            if (min(entry.getValue()) > 0) {
                filtered.put(entry.getKey(), entry.getValue());
            }
        }
        return filtered;
    }
}
