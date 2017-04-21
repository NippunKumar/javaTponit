package com.javatpoint.mypkg;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class AlphabetFrequency {
	public static void main(String args[]){
		String[] names = { "aa", "bc", "aa", "db", "qq", "rd", "", "db" };
		
		System.out.println("Duplicate elements in array");
		Map<String, Integer> myMap = new HashMap<>();

		// build hash table with count
		for (String name : names) {
			Integer count = myMap.get(name);
			if (count == null) {
				myMap.put(name, 1);
			} else {
				myMap.put(name, ++count);
			}
		}

		// Print duplicate elements from array
		Set<Entry<String, Integer>> entrySet = myMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {
				System.out.println("Duplicate element in the given is array : " + entry.getKey() + "  and Its Frequency is--> "
						+ entry.getValue());
			}
		}
	}
}
