package com.migliaci.ign.license;

/** CalculationHelper.java 
* Computes solution value for a given population and manages program flow 
*
* @author Michael Migliacio
* @version 0.9a 4/18/2012.
*/

public class CalculationHelper {

	/**
	 * totalPlates returns a value for total number of plates generated given a
	 * number of digits and number of letters
	 * 
	 * @param digits
	 * @param letters
	 * @return total number of possible plates generated based on number of
	 *         digits and letters given
	 */
	public long totalPlates(long digits, long letters) {
		if (digits == 0) {
			return permutationFunctionOrdered(26, letters);
		}
		if (letters == 0) {
			return permutationFunctionOrdered(10, digits);
		}

		return (permutationFunctionOrdered(10, digits) * permutationFunctionOrdered(
				26, letters));
	}

	/**
	 * permutationFunction Computes the number of possible permutations based on
	 * the mathematical permutation formula, when order is important, but
	 * repetition not allowed). ( (n!)/(n-r)! )
	 * 
	 * @param n
	 * @param r
	 * @return total number of possible permutations as a long value note:
	 *         this function is not used in current solution but was researched
	 *         for potential use.
	 */
	public long permutationFunction(long n, long r) {
		return ((factorialFunction(n)) / (factorialFunction(n - r)));
	}

	/**
	 * combinationFuction Computers number of possible combinations based on
	 * mathematical combination formula, when order is not important and
	 * repetition is not allowed. ((n!) / ((r!) * (n-r)!)
	 * 
	 * @param n
	 * @param r
	 * @return total number of possible combinations as a long value note:
	 *         this function is not used in current solution but was researched
	 *         for potential use.
	 */
	public long combinationFunction(long n, long r) {

		return ((factorialFunction(n)) / (factorialFunction(r) * factorialFunction(n
				- r)));
	}

	/**
	 * permutationFunctionOrdered Computes number of possible permutations when
	 * order is important and repetition is allowed.
	 * 
	 * @param n
	 * @param r
	 * @return total numebr of possible permutations as a long value
	 */
	public long permutationFunctionOrdered(long n, long r) {

		return (long)Math.pow(n, r);
	}

	/**
	 * factorialFunction Computes factorial for parameter n
	 * 
	 * @param n
	 * @return n! (as a long value) note: There are built-in Java functions
	 *         for computing factorial as well.
	 */
	public long factorialFunction(long n) {
		long temp;

		if (n <= 1) {
			return 1;
		} else {
			temp = n * factorialFunction(n - 1);
			return temp;
		}

	}

}
