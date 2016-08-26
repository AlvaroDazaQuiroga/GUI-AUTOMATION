package org.fundacionjala.Shapes;

/**
 * This class is in charge to calculate the area and perimeter for a Square
 */
public class Square implements Shapes {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    /**
     *  {@inheritDoc}
     */
    public double calculateArea() {
        return Math.pow(side, 2);
    }
    /**
     *  {@inheritDoc}
     */
    public double calculatePerimeter() {
        return side * 4;
    }
    /**
     *  {@inheritDoc}
     */
    public String getKind() {
        return "Iam a Square";
    }

}
