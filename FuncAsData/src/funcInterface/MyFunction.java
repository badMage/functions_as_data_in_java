package funcInterface;

/**
 * Functional interface which represents a function with two parameters a and b.
 */
public interface MyFunction {
	
	/**
	 * This is an unimplemented functional method which makes the interface functional.
	 * Since the actual implementation can vary there is no actual description of the method.
	 * @param a is the first argument of the method
	 * @param b is the second argument of the method
	 * @return returns some value of the primitive type "double" processed using both parameters a and b
	 */
	public double apply(double a, double b);
}
