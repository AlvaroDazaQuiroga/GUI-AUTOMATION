package org.fundacionjala.movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new ChildrensMovie("Bambie"),10));
        customer.addRental(new Rental(new NewRealeaseMovie("Batman 10 la venganza de robin"),30));
        customer.addRental(new Rental(new RegularMovie("Mad max"),20));
        System.out.println(customer.statement());
    }
}
