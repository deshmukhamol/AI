package com.cpt.ai.numberguess.calculate;

import java.util.Scanner;

public class BinarySearchAlgo implements CalculationAlgo {

	@Override
	public int calculate(int guess, int lowerLimit, int upperLimit) {
			
			while(true){
				System.out.println("Your Number is "+ guess);
				System.out.println("Enter your input (higher/lower/true or end) : ");
				
				Scanner scan = new Scanner(System.in);		
					String choice = scan.next();
					
					if("lower".equalsIgnoreCase(choice)){
						upperLimit = guess - 1;
						guess = (lowerLimit + upperLimit)/2;
					} 
					else if("higher".equalsIgnoreCase(choice)){
						lowerLimit = guess + 1;
						guess = (lowerLimit + upperLimit)/2;
					}
					else if("true".equalsIgnoreCase(choice) || "end".equalsIgnoreCase(choice)){
						break;
					}
					else {
						System.out.println("Invalid choice. Please try again ");
					}
				}
			return guess;
			
	}
}
