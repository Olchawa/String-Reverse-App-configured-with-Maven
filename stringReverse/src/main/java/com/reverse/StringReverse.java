package com.reverse;

import java.util.Scanner;

public class StringReverse {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);	
		System.out.println("Type the string:");
		String source = scanner.nextLine();
		System.out.print(reverseString(source));
	}

	public static String reverseString(String src) {

		StringBuilder builder = new StringBuilder();

		for (String word : src.split(" ")) {
			builder.append(new StringBuilder(word).reverse().toString() + " ");
		}	
		builder.deleteCharAt(builder.lastIndexOf(" "));
		return builder.toString();

	}
}