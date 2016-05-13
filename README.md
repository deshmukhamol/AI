## Guess the right number 
Main purpose of the program is to identify the number guessed. In simple words, guess a number and program will find it out.

## Methods of execution of the program
1. Run the main method of App.java OR
2. Run maven:test

## Assumptions/Declarations
1. Range of numbers is finite. At the moment its (1 - 100).Though can be changed in the initialisation method in Calculation class
2. Standard features - Logging, Security have yet to be implemented.
3. The Number guessed and the number of retries are not stored. Though can be stored for empirical purpose
4. Currently the algorithm to find the number is based on binary search. Any new algorithm is just a matter of adding a new CalcuationAlgo implementor
5. Exception Handling is pending

## Design Philosophy / Class Details
* App - Executor class
* Calculation - Responsible for execution of the right algorithm,data initialisation,output
* CalculationAlgoFactory - Factory class for giving the right CalculationAlgo class.Currently decides on basis of upper limit of range
* CalculationAlgo - Interface for the calculation algorithm
* BinarySearchAlgo - Loosely based on binary search algorithm for guessing the number
