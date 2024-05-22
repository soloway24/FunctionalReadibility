package edu.kuznets.functionalreadibility2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupV1 {

    public static Map<Integer, List<Integer>> getGrouped(List<Integer> values) {
        Map<Integer, List<Integer>> groupedMap = new HashMap<>();

        for (Integer value : values) {
            int key = value % 3;
            if (!groupedMap.containsKey(key)) {
                groupedMap.put(key, new ArrayList<>());
            }
            groupedMap.get(key).add(value);
        }

        return groupedMap;
    }
}
