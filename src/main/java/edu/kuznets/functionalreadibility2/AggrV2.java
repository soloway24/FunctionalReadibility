package edu.kuznets.functionalreadibility2;

import java.util.List;

public class AggrV2 {

    public static Integer getMax(List<Integer> values) {
        return values
                .stream()
                .max(Integer::compareTo)
                .orElse(0);
    }

    public static Integer getSum(List<Integer> values) {
        return values
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static Double getAvg(List<Integer> values) {
        return values
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }
}