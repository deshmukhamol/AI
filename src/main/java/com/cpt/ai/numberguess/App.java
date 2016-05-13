
package com.cpt.ai.numberguess;

import com.cpt.ai.numberguess.calculate.Calculation;

/**
 * Main Program Executor
 */
public class App 
{
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main( String[] args )
    {
    	Calculation calc = new Calculation();
    	calc.guessNumber();    
    }
    
}
