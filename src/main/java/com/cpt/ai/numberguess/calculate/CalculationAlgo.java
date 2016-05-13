
package com.cpt.ai.numberguess.calculate;

/**
 * Interface to be implemented to calculate the guessed number.
 */
public interface CalculationAlgo {

	/**
	 * Interface method to be implemented to calculate the number .
	 *
	 * @param guessed number
	 * @param lowerLimit 
	 * @param upperLimit 
	 * @return the guessed number
	 */
	public int calculate(int guess, int lowerLimit, int upperLimit);
}
