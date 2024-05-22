package edu.kuznets.functionalreadibility2;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class GroupV2 {

    public static Map<Integer, List<Integer>> getGrouped(List<Integer> values) {
        return values
                .stream()
                .collect(groupingBy(i -> i % 3));
    }
}