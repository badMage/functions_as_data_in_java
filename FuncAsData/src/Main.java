import sets.FunctionSet;
import funcInterface.MyFunction;

/**
 * This class shows the usage of functions as data in Java.
 * In order to be able to do this there is a package with a functional interface which represents the actual functions.
 * In this case the actual MyFunction.apply implementations are realized by lambda expressions.
 */
public class Main {

	public static void main(String[] args) {
		FunctionSet mySet = new FunctionSet(3);
	
		// adding some functions to the function set
		mySet.addFunction((a, b) -> {
			return a + b;
		});
		
		mySet.addFunction((a, b) -> {
			return Math.pow(a, b);
		});
		
		mySet.addFunction((a, b) -> {
			return a*a + b*b;
		});

		// test:
		for (int index = 0; index < mySet.getArrayOfFunctions().length; index++) {
			System.out.println(mySet.getArrayOfFunctions()[index].apply(4, 5));
		}
	}
	
	
}
