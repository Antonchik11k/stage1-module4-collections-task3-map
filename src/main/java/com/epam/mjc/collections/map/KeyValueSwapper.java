package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swappedMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            String value = entry.getValue();
            Integer currentKey = entry.getKey();

            // Check if the value already exists in the swapped map
            if (swappedMap.containsKey(value)) {
                // Compare the current key with the one already in the map
                // Update if the current key is smaller
                if (currentKey < swappedMap.get(value)) {
                    swappedMap.put(value, currentKey);
                }
            } else {
                // If the value is not in the map yet, just put it
                swappedMap.put(value, currentKey);
            }
        }
        return swappedMap;
    }
}
