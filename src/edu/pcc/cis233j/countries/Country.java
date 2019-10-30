package edu.pcc.cis233j.countries;

/**
 * A country in the world
 * @author Cara Tang
 */
public class Country {
	private int id;
	private String name;
	private long population;
	private double medianAge;
	private String language;
	private long coastlineKm;
	
	/**
	 * Create a Country object with the given properties
	 */
	public Country(int id, String name, long population, double medianAge, String language, long coastlineKm) {
		this.id = id;
		this.name = name;
		this.population = population;
		this.medianAge = medianAge;
		this.language = language;
		this.coastlineKm = coastlineKm;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getPopulation() {
		return population;
	}

	public double getMedianAge() {
		return medianAge;
	}

	public String getLanguage() { return language; }

	public long getCoastlineKm() {
		return coastlineKm;
	}

}
