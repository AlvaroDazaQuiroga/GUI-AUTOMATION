package org.fundacionjala.movies;

/**
 * Created by AlvaroDaza on 8/24/2016.
 */
public class ChildrensMovie extends Movie {
    public static final double VALUE_MULTIPLICATOR = 1.5;
    public static final int DAYS_RENTED_LIMIT = 3;
    public static final double INITIAL_AMOUNT = 1.5;
    public static final int DEFAULT = 1;

    public ChildrensMovie(String title) {
        super(title);
    }

    public double calculateAmount(int daysRented) {
        double thisAmount = INITIAL_AMOUNT;
        if (daysRented > DAYS_RENTED_LIMIT)
            thisAmount += (daysRented - 3) * VALUE_MULTIPLICATOR;
        return thisAmount;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return DEFAULT;
    }
}
