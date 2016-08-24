package org.fundacionjala.movies;

/**
 * Created by AlvaroDaza on 8/24/2016.
 */
public class RegularMovie extends Movie {
    public static final double VALUE_MULTIPLICATOR = 1.5;
    public static final int DAYS_RENTED_LIMIT = 2;
    public static final int INITIAL_AMOUNT = 2;
    public static final int DEFAULT = 1;

    public RegularMovie(String title) {
        super(title);
    }

    public double calculateAmount(int daysRented) {
        double thisAmount = INITIAL_AMOUNT;
        if (daysRented > DAYS_RENTED_LIMIT)
            thisAmount += (daysRented - 2) * VALUE_MULTIPLICATOR;
        return thisAmount;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return DEFAULT;
    }
}
