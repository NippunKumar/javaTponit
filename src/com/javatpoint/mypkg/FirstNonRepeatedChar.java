package com.javatpoint.mypkg;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {
	
 public static void main(String[] args) {
	 System.out.println("The first non repeated character is "+
			 			FirstNonRepeatedChar.getFirstNonRepeatedChar("INDIA"));
	
}
	public static char getFirstNonRepeatedChar(String str) {
        Map<Character,Integer> count = new LinkedHashMap<>(str.length());
        
        for (char c : str.toCharArray()) {
            count.put(c, count.containsKey(c) ? count.get(c) + 1 : 1);
        }
        
        for (Entry<Character,Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }

}
