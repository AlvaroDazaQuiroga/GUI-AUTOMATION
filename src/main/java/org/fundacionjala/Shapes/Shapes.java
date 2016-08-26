package org.fundacionjala.Shapes;

/**
 * Interface class for calculate the area and perimeter
 */
interface Shapes {
    /**
     * Calculates the area
     *
     * @return a double value
     */
    double calculateArea();

    /**
     * Calculates the Perimeter
     *
     * @return a double value
     */
    double calculatePerimeter();

    /**
     * Return some text
     *
     * @return a String value
     */
    String getKind();
}
