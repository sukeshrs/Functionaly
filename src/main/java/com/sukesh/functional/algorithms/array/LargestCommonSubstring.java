package com.sukesh.functional.algorithms.array;

public class LargestCommonSubstring {
    public String findLargestCommonPrefix(String[] list) {
        if(list == null || list.length ==0){
            return "";
        }
        String prefix = list[0];

        if(!prefix.equals("")) {
            for (int i = 1; i < list.length; i++) {
                while (list[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
        }
        return prefix;
    }
}
