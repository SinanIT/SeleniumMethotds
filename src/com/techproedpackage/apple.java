package com.techproedpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class apple {

    public static void main(String[] args) {
        System.out.println(nestedAnagram("broedj cat", "act robed"));
    }

    static boolean nestedAnagram(String string1, String string2) {
        if (string1.length() != string2.length())
            return false;

        String[] string1Array = string1.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String word : string1Array) {

            char[] charArray = word.toCharArray();

            Arrays.sort(charArray);
            System.out.println(charArray);
            map.put(String.valueOf(charArray), 0);//
            System.out.println(map);

        }

        String[] string2Array = string2.split(" ");

        for (String word : string2Array) {

            char[] charArray = word.toCharArray();

            Arrays.sort(charArray);

            System.out.println(charArray);

            if (!map.containsKey(String.valueOf(charArray))) {
                return false;
            }
        }
        return true;
    }
}

