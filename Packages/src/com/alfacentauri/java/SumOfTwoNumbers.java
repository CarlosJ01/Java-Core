package com.alfacentauri.java;

import java.util.Scanner;
import static java.lang.Integer.*; // se pueden importar los static de clases
import static java.lang.System.out;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		out.println("Enter 2 integers");
		Scanner scanner = new Scanner(System.in);
		
		int num1 = parseInt(scanner.next()); // usar los static de las clases
		int num2 = parseInt(scanner.next());
		
		out.println("Sum is "+(num1 + num2));
	}
}
