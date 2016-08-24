package org.fundacionjala.movies;

/**
 * Created by AlvaroDaza on 8/24/2016.
 */
public class NewRealeaseMovie extends Movie {
    public static final double VALUE_MULTIPLICATOR = 3.0;
    public static final int DEFAULT_OPTION_ELSE = 1;
    public static final int DEFAULT_OPTION_IF = 2;
    public static final int DEFAULT_DAYS_RENTED_LIMIT = 1;

    public NewRealeaseMovie(String title) {
        super(title);
    }

    public double calculateAmount(int daysRented) {
        return daysRented * VALUE_MULTIPLICATOR;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return (daysRented > DEFAULT_DAYS_RENTED_LIMIT) ? DEFAULT_OPTION_IF : DEFAULT_OPTION_ELSE;
    }
}
