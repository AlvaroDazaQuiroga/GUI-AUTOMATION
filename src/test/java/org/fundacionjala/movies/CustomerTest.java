package org.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by AlvaroDaza on 8/24/2016.
 */
public class CustomerTest {

    @Test
    public void test_Customer_VerifyIfTheCustomerInstanceCorrectly()
    {
        Customer customer=new Customer("Alvaro");
        assertEquals(customer.getName(),"Alvaro");
    }
    @Test
    public void test_Customer_VerifyIfTheCustomerInstanceWhitOutName()
    {
        Customer customer=new Customer("");
        assertEquals(customer.getName(),"");
    }
    @Test
    public void test_calculateTotalFrequentRenterPoints_VerifyIfTheRenterPointsAreCorrectly(){
        Customer customer=new Customer("Alvaro");
        RegularMovie regularMovie=new RegularMovie("Mad max");
        Rental rental=new Rental(regularMovie,20);
        customer.addRental(rental);
        int value=customer.calculateTotalFrequentRenterPoints();
        assertEquals(value,1);
    }
    @Test
    public void test_calculateAmount_VerifyIfTheAmountValueisCorrectly(){
        Customer customer=new Customer("Alvaro");
        RegularMovie regularMovie=new RegularMovie("Mad max");
        Rental rental=new Rental(regularMovie,20);
        customer.addRental(rental);
        double value;
        value = customer.calculateTotalAmount();
        assertEquals(value,29,0.5);
    }

}