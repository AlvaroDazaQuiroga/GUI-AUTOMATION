package org.fundacionjala.Shapes;

/**
 * Created by Lion on 8/25/2016.
 */
public class Main {
    public static final String MY_AREA = "  and  my Area is: ";
    public static final String MY_PERIMETER = "  and  my Perimeter is: ";

    public static void main(String[] args) {
        Shapes kind = new Square(10);
        System.out.println(kind.getKind() + MY_AREA + kind.calculateArea());
        System.out.println(kind.getKind() + MY_PERIMETER + kind.calculatePerimeter());
        kind = new Circle(10);
        System.out.println(kind.getKind() + MY_AREA + kind.calculatePerimeter());
        System.out.println(kind.getKind() + MY_PERIMETER + kind.calculateArea());
        kind = new Triangle(10, 2);
        System.out.println(kind.getKind() + MY_AREA + kind.calculatePerimeter());
        System.out.println(kind.getKind() + MY_PERIMETER + kind.calculateArea());
    }

}
