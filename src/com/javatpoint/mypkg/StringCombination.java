package com.javatpoint.mypkg;

import java.util.ArrayList;
import java.util.List;

public class StringCombination {
	public static void main(String[] args) {
		String s = "India";
		List<String> l = combination(s);
		System.out.println(l);
	}


	static List<String> combination(String s) {

		List<String> l = new ArrayList<String>();
		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int j = i;
			Recursion(i, j, ch.length, ch, l);

		}
		return l;
	}

	static void Recursion(int i, int j, int chLength, char ch[], List<String> l) {

		char subChar[] = new char[(j + 1) - i];
		int subIndex = 0;
		int Ref = i;
		while (Ref <= j) {
			subChar[subIndex++] = ch[Ref++];
		}
		l.add(new String(subChar));

		if (j + 1 == chLength) {
			return;
		}
		Recursion(i, j + 1, chLength, ch, l);
	}

}
