package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if(sentence.isEmpty() || sentence == null){
            return new HashMap<>();
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        // Split words by non-word characters and eliminate punctuation
        var words = sentence.toLowerCase().split("\\W+");
        for(String word : words){
            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }
        return hashMap;
    }
}
