
package com.cpt.ai.numberguess.calculate;

/**
 * Calculation class for guessing the number
 */
public class Calculation {

	/** The lower limit. */
	int lowerLimit;
	
	/** The upper limit. */
	int upperLimit;
	
	/** The guess. */
	int guess;
	
	/**
	 * Initialises the program variables.
	 */
	public void init(){
		lowerLimit = 1;
		upperLimit = 100;
		guess = (lowerLimit + upperLimit)/2;
		
		System.out.println("Think of a number between "+ lowerLimit + " and " + upperLimit);
	}
	
	/**
	 * Method to guess the number based on upperlimit
	 */
	public void guessNumber(){
		init();
		
		CalculationAlgo calAlgo  = CalculationAlgoFactory.createSearchAlgo(upperLimit);
		guess = calAlgo.calculate(guess, lowerLimit, upperLimit);
		
		display();
		postProcess();
	}
	
	/**
	 * Display the guessed number.
	 */
	public void display(){
		System.out.println(" We got it... Your number is : "+ guess);
	}
	
	/**
	 * Post process. Incase any post process is required
	 */
	public void postProcess(){
		
	}
	
}
