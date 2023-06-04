package main;

import java.util.*;

import logic.Diamond;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter a type of shape and n:");
				String[] input = scanner.nextLine().split(" ");
				String shape = input[0];
				int n = Integer.parseInt(input[1]);
				
				if(shape.equals("Diamond")){
					if(n%2 == 0 ) {
						throw new Exception();
					}else if(n <=0 || n > 50){
						throw new Exception();
					}else {
						System.out.println("Pass");
						Diamond diamond = new Diamond();
						diamond.diamondShape(n);
						diamond.printDiamond();
						
						break;
					}
				}else if(shape.equals("Butterfly")){
					if(n%2 != 0 ) {
						throw new Exception();
					}else if(n <=0 || n > 50){
						throw new Exception();
					}else {
						System.out.println("Pass");
						break;
					}
				}else {
					throw new Exception();
			}
				
				
			}catch(Exception e) {
				System.out.println("Invalid input, Please try again.");
			}
		}

	}

}
