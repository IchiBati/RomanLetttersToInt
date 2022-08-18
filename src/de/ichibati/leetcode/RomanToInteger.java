package de.ichibati.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {


    public static Map<String, Integer> romanToInt = new HashMap<>();

    static {
        romanToInt.put("I", 1);
        romanToInt.put("V", 5);
        romanToInt.put("X", 10);
        romanToInt.put("L", 50);
        romanToInt.put("C", 100);
        romanToInt.put("D", 500);
        romanToInt.put("M", 1000);
    }
}
