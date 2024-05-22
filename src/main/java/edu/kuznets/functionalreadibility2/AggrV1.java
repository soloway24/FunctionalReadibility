package edu.kuznets.functionalreadibility2;

import java.util.List;

import static java.lang.Math.max;

public class AggrV1 {

    public static Integer getMax(List<Integer> values) {
        int max = 0;
        for (Integer i : values) {
            max = max(max, i);
        }
        return max;
    }

    public static Integer getSum(List<Integer> values) {
        int sum = 0;
        for (Integer i : values) {
            sum += i;
        }
        return sum;
    }

    public static Double getAvg(List<Integer> values) {
        double sum = 0;

        for (Integer i : values) {
            sum += i;
        }

        return values.isEmpty()
                ? 0
                : sum / values.size();
    }
}
