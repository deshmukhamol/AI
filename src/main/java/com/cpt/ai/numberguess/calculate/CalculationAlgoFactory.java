package com.cpt.ai.numberguess.calculate;

public class CalculationAlgoFactory {

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
