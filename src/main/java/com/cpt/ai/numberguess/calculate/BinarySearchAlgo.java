
package com.cpt.ai.numberguess.calculate;

import java.util.Scanner;

/**
 * The Class implementing principles from binary search for arriving at the guessed number.
 */
public class BinarySearchAlgo implements CalculationAlgo {

	/* (non-Javadoc)
	 * @see com.cpt.ai.numberguess.calculate.CalculationAlgo#calculate(int, int, int)
	 */
	@Override
	public int calculate(int guess, int lowerLimit, int upperLimit) {
		Scanner scan = null;
		try{
			while(true){
				System.out.println("Your Number is "+ guess);
				System.out.println("Enter your input (higher/lower/true or end) : ");
				
				scan = new Scanner(System.in);		
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
			}
			finally{
				if(scan!= null){
					scan.close();
				}
			}

			
			return guess;
			
	}
}
