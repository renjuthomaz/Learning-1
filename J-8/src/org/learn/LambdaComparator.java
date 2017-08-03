package org.learn;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparator {

	public static void main(String[] args) {

		/*
		 * Comparator<String> comparator = new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return
		 * o1.compareTo(o2); }
		 * 
		 * };
		 */

		// Comparator<String> lambdaComparator = (String o1, String o2) ->
		// o1.compareTo(o2);

		List<String> names = Arrays.asList("aaaaaaa", "aaa", "aaaa", "aaaaa");
		Collections.sort(names, (String o1, String o2) -> o1.compareTo(o2));
		names.forEach(System.out::println);
		/*for (String s : names) {
			System.out.println(s);
		}*/
	}
}
