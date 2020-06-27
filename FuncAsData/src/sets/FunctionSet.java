package sets;

import funcInterface.MyFunction;

/**
 * The function set represents a set of functions.
 * The class is only an example for the treatment of functions as data so there is no exception handling.
 */
public class FunctionSet {
	private MyFunction[] arrayOfFunctions;
	
	/**
	 * creates a new FunctionSet instance whose number of elements is being set at the numOfFunctions parameter.
	 * @param numOfFunctions represents the number of functions in the set
	 */
	public FunctionSet(int numOfFunctions) {
		this.arrayOfFunctions = new MyFunction[numOfFunctions];
	}
	
	/**
	 * Returns the reference of the actual instance the array of functions of this function set.
	 * @return returns a reference to an array of type MyFunction
	 */
	public MyFunction[] getArrayOfFunctions() {
		return this.arrayOfFunctions;
	}
	
	/**
	 * Returns the number of elements of the current set.
	 * @return returns an integer which represents the length of the inner array
	 */
	public int getNumberOfFunctions() {
		return this.arrayOfFunctions.length;
	}
	
	/**
	 * Adds a function to the set.
	 * @param function is the function to be added at the set
	 */
	public void addFunction(MyFunction function) {
		for (int i = 0; i < arrayOfFunctions.length; i++) {
			if (arrayOfFunctions[i] == null) {
				this.arrayOfFunctions[i] = function;
				return;
			}
		}
	}
	
	/**
	 * Applies the arguments a and b to the function at the index parameter.
	 * @param index represents the position of the function in the array of functions
	 * @param a represents the first parameter of type double
	 * @param b represents the second parameter of type double
	 * @return returns the processed value/result of the given function
	 */
	public double applyAt(int index, double a, double b) {
		return arrayOfFunctions[index].apply(a, b);
	}
	
}
