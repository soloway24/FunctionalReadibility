package edu.kuznets.functionalreadibility2;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static edu.kuznets.functionalreadibility2.Utils.SOME_INT_MAP;
import static java.util.Optional.ofNullable;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.IntStream.range;

public class InitListV2 {

    public static List<Integer> getHundredFromMap() {
        return range(0, 100)
                .boxed()
                .map(i -> ofNullable(SOME_INT_MAP.get(i)))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();
    }

    public static List<Integer> getHundredEven() {
        return range(0, 100)
                .boxed()
                .filter(i -> i % 2 == 0)
                .toList();
    }

    public static List<Integer> getHundredPlusOne() {
        return range(0, 100)
                .boxed()
                .map(i -> i + 1)
                .toList();
    }

    public static List<Integer> getHundred() {
        return range(0, 100)
                .boxed()
                .toList();
    }

    public static Map<Integer, Integer> getHundredSquared() {
        return range(0, 100)
                .boxed()
                .collect(toMap(identity(), i -> i * i));
    }
}