package com.learningdsa.striver;

import java.util.*;

class Pair {
    char character;
    int count;

    Pair() {

    }

    Pair(char character, int count) {
        this.character = character;
        this.count = count;
    }
}

public class CountFrequency
{
    public static void main(String[] args) {
        String s="tree";
        System.out.println(frequencySort(s));

    }
    public static String frequencySort(String s) {
        StringBuilder ans=new StringBuilder();
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(char ch:s.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> sortedList=new ArrayList<Map.Entry<Character,Integer>>(hm.entrySet());
        sortedList.sort(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        for (Map.Entry<Character,Integer> entry:sortedList)
        {
            for(int i=0;i<entry.getValue();i++)
            {
                ans.append(entry.getKey());
            }
        }
        return ans.toString();

    }
}
