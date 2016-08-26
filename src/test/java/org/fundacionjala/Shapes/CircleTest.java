package org.fundacionjala.Shapes;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Test for {@Link Circle}
 */
public class CircleTest {

    private Shapes shapes;
    public static final double DELTA = 0.5;

    @Before
    public void setUp() {
        final int radio = 5;
        shapes = new Circle(radio);
    }

    @Test
    public void test_calculateArea_verifyTheCalculationOfCircleArea() {
       final double resultArea = 78.5;
        assertEquals(shapes.calculateArea(), resultArea, DELTA);
    }

    @Test
    public void test_calculatePerimeter_varifyTheCalculationOfCirclePerimeter() {
        final double resultPerimeter = 31;shapes.calculatePerimeter();
        assertEquals(shapes.calculatePerimeter(), resultPerimeter, DELTA);
    }

}
