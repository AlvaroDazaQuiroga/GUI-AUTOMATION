package org.fundacionjala.movies;

class Rental {

    private Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int calculateFrequentRenterPoints() {
        return movie.calculateFrequentRenterPoints(daysRented);
    }

    public double calculateAmount() {
        return movie.calculateAmount(daysRented);
    }

    public Movie getMovie() {
        return movie;
    }
}