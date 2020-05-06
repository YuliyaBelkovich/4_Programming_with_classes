package by.epam.javaIntro.simpleClass;

import java.awt.Point;

public class Triangle {

    /*Описать класс, представляющий треугольник.
     * Предусмотреть методы для создания объектов,
     * вычисления площади, периметра и точки пересечения медиан.
     */

    private Point a;
    private Point b;
    private Point c;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void isValidTriangle() {
        double sideA = a.distance(b);
        double sideB = b.distance(c);
        double sideC = a.distance(c);

        if (sideA * sideB * sideC == 0 || sideA + sideB <= sideC || sideA + sideC <= sideB) {
            System.out.println("This triangle doesn't exist");
        } else {
            System.out.println("Correct triangle");
        }
    }

    public double getSideAB() {
        return this.a.distance(this.b);
    }

    public double getSideBC() {
        return this.b.distance(this.c);
    }

    public double getSideAC() {
        return this.a.distance(this.c);
    }

    public double perimeter() {
        return getSideAB() + getSideBC() + getSideAC();
    }

    public double area() {
        double p = perimeter() / 2.;
        return Math.sqrt(p * (p - getSideAB()) * (p - getSideBC()) * (p - getSideAC()));
    }
}

