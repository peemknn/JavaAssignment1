package main;

import java.util.Scanner;

import logic.Diamond;
import logic.Butterfly;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter a type of shape and n:");
				//input shape and n and them split into 2 variables
				String[] input = scanner.nextLine().split(" ");
				String shape = input[0];
				int n = Integer.parseInt(input[1]);
				
				//input shape is diamond
				if (shape.equals("Diamond")) {
					//if n is even
					if (n % 2 == 0) {
						throw new Exception();
					//if n is not between 1 and 50
					} else if (n <= 0 || n > 50) {
						throw new Exception();
					} else {
						Diamond diamond = new Diamond();
						diamond.diamondShape(n);
						break;
					}
				//input shape is butterfly
				} else if (shape.equals("Butterfly")) {
					//if n is even
					if (n % 2 != 0) {
						throw new Exception();
					//if n is not between 1 and 50
					} else if (n <= 0 || n > 50) {
						throw new Exception();
					
					} else {
						Butterfly butterfly = new Butterfly();
						butterfly.butterflyShape(n);
						break;
					}
				} else {
					//input shape is invalid
					throw new Exception();
				}

			} catch (Exception e) {
				//error message
				System.out.println("Invalid input, Please try again.");
			}
		}

	}

}
