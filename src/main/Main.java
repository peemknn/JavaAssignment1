package main;

import java.util.Scanner;
import exception.InvalidNumberException;
import logic.Diamond;
import logic.Butterfly;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Please enter a type of shape and n:");
				
				// split into shape type and int n
				String[] input = scanner.nextLine().split(" ");
				if(input[0].equals("close")) {
					System.out.println("Bye...");
					break;
				}
				String shape = input[0];
				int n = Integer.parseInt(input[1]);
				

				//if input shape is diamond
				if (shape.equals("Diamond")) {
					// n should be between 1 and 50
					if (n <= 0 || n > 50) {
						throw new InvalidNumberException("n should be between 1 and 50.");
					// n should be odd with diamond
					} else if (n % 2 == 0) {
						throw new InvalidNumberException("With diamond shape, n should be odd.");
					// all input are valid , Print shape
					} else {
						Diamond diamond = new Diamond();
						diamond.diamondShape(n);
					}
				// if input shape is butterfly
				} else if (shape.equals("Butterfly")) {
					// n should be between 1 and 50
					if (n <= 0 || n > 50) {
						throw new InvalidNumberException("n should be between 1 and 50.");
					// n should be even with butterfly shape
					} else if (n % 2 != 0) {
						throw new InvalidNumberException("With butterfly shape, n should be even.");
					// all input are valid , Print shape
					} else {
						Butterfly butterfly = new Butterfly();
						butterfly.butterflyShape(n);
					}
				
				} else {
					throw new Exception();
				}
			}catch (InvalidNumberException e) {
				System.out.println("Error: " + e.getMessage());
			}catch (Exception e) {
				System.out.println("Error : Invalid input");
			}
		}

	}

}
