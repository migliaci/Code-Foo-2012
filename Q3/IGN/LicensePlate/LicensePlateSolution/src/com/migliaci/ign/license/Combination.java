package com.migliaci.ign.license;

/** Combination.java 
* Holds data for a potential solution 
*
* @author Michael Migliacio
* @version 0.9a 4/18/2012.
*/

public class Combination {

	private String combo = ""; // combination value as a string
	private long value = 0; // solution value as a long
	private long population = 0; // population value
	private long extraPlates = 0; // extra plate value (passed into class)

	/**
	 * Constructor
	 * 
	 * @param cmb
	 * @param val
	 */
	public Combination(String cmb, long val) {
		combo = cmb;
		value = val;
	}

	/**
	 * getCombo getter method for combination value
	 * 
	 * @return combination value as a string
	 */
	public String getCombo() {

		return combo;
	}

	/**
	 * getSolutionString computes value of solution based on information
	 * provided
	 * 
	 * @return solution string
	 */
	public String getSolutionString() {
		
		//population/pattern/totalplates/excessplates
		
		return ("Population: " + getPopulation() + "\n" + "Pattern: " + getCombo() + "\n" + "Total Plates: " + value + "\n" + "Excess Plates: "
				+ getExtraPlates());

	}

	/**
	 * getValue getter method for value
	 * 
	 * @return value
	 */
	public long getValue() {
		return value;
	}

	/**
	 * setCombo setter method for combo value
	 * 
	 * @param newCombination
	 */
	public void setCombo(String newCombination) {
		combo = newCombination;
	}

	/**
	 * setValue setter method for value
	 * 
	 * @param newValue
	 */
	public void setValue(int newValue) {
		value = newValue;
	}

	/**
	 * getPopulation getter method for population value
	 * 
	 * @return population value
	 */
	public long getPopulation() {
		return population;
	}

	/**
	 * setPopulation setter method for population value
	 * 
	 * @param population
	 */
	public void setPopulation(long population) {
		this.population = population;
	}

	/**
	 * getExtraPlates getter method for extra plates value
	 * 
	 * @return extra plates value
	 */
	public long getExtraPlates() {
		return extraPlates;
	}

	/**
	 * setExtraPlates setter method for extra plates value
	 * 
	 * @param extraPlates
	 */
	public void setExtraPlates(long extraPlates) {
		this.extraPlates = extraPlates;
	}

}
