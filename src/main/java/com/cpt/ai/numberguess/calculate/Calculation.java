package com.cpt.ai.numberguess.calculate;

public class Calculation {

	int lowerLimit;
	int upperLimit;
	int guess;
	
	public void init(){
		lowerLimit = 1;
		upperLimit = 100;
		guess = (lowerLimit + upperLimit)/2;
		
		System.out.println("Think of a number between "+ lowerLimit + " and " + upperLimit);
	}
	
	public void guessNumber(){
		init();
		
		CalculationAlgo calAlgo  = CalculationAlgoFactory.createSearchAlgo(upperLimit);
		guess = calAlgo.calculate(guess, lowerLimit, upperLimit);
		
		display();
		postProcess();
	}
	
	public void display(){
		System.out.println(" We got it... Your number is : "+ guess);
	}
	
	public void postProcess(){
		
	}
	
}
