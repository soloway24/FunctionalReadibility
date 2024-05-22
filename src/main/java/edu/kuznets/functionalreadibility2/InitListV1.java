package edu.kuznets.functionalreadibility2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static edu.kuznets.functionalreadibility2.Utils.SOME_INT_MAP;

public class InitListV1 {

    public static List<Integer> getHundredFromMap() {
        List<Integer> hundredFromMap = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Integer fromMap = SOME_INT_MAP.get(i);
            if (fromMap != null) {
                hundredFromMap.add(i);
            }
        }
        return hundredFromMap;
    }

    public static List<Integer> getHundredEven() {
        List<Integer> hundredEven = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                hundredEven.add(i);
            }
        }
        return hundredEven;
    }

    public static List<Integer> getHundredPlusOne() {
        List<Integer> hundredPlusOne = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            hundredPlusOne.add(i + 1);
        }
        return hundredPlusOne;
    }

    public static List<Integer> getHundred() {
        List<Integer> hundred = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            hundred.add(i);
        }
        return hundred;
    }

    public static Map<Integer, Integer> getHundredSquared() {
        Map<Integer, Integer> hundredSquared = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            hundredSquared.put(i, i * i);
        }
        return hundredSquared;
    }
}
