package edu.pcc.cis233j.countries;

import java.util.List;

/**
 * Read from the Country database and print data on the countries
 * @author Cara Tang
 */
public class Main {
	public static void main(String[] args) {
		CountryDB cdb = new CountryDB();
		List<Country> countries = cdb.getCountries();

		for (Country country : countries) {
			System.out.println("Country:");
			System.out.println("Name: " + country.getName()
					+ "  Population: " + country.getPopulation()
					+ "  Median Age: " + country.getMedianAge()
                    + "  Language: " + country.getLanguage()
					+ "  Coastline: " + country.getCoastlineKm() + "km");
		}
	}
}