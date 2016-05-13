/*
 * 
 */
package com.cpt.ai.numberguess.calculate;

/**
 * A factory for creating Calculation Algorithm objects.
 */
public class CalculationAlgoFactory {

	/**
	 * Creates a new object for calculation of the guessing the number.
	 *
	 * @param upperLimit the upper limit
	 * @return the calculation algorithm object
	 */
	public static CalculationAlgo createSearchAlgo(int upperLimit){
		CalculationAlgo calc = null;
		if(upperLimit <= 100){
			calc = new BinarySearchAlgo();
		}
		else {
			calc = new BinarySearchAlgo();
		}
		return calc;
	}
	
}
