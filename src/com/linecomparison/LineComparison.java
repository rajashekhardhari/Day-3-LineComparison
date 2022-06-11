package com.linecomparison;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program...");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Four numbers");
		System.out.println("Enter x1:-");
		int x1 = scanner.nextInt();

		System.out.println("Enter y1:-");
		int y1 = scanner.nextInt();

		System.out.println("Enter x2:-");
		int x2 = scanner.nextInt();

		System.out.println("Enter y2:-");
		int y2 = scanner.nextInt();

		System.out.println("Enter x3:-");
		int x3 = scanner.nextInt();

		System.out.println("Enter y3:-");
		int y3 = scanner.nextInt();

		System.out.println("Enter x4:-");
		int x4 = scanner.nextInt();

		System.out.println("Enter y4:-");
		int y4 = scanner.nextInt();

		double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of Line1 is: " + length1);
		String str1 = Double.toString(length1);
		System.out.println("str:-" + str1);

		double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		System.out.println("Length of Line2 is: " + length2);
		String str2 = Double.toString(length1);
		System.out.println("str2:-" + str2);

		System.out.println(str2.compareTo(str1));

	}
}
