package org.example;

public class App {
  public static void main(String[] args) {
        // Circle
        circle c = new circle(5);
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Circle perimeter: " + c.getPerimeter());
        System.out.println("Circle circumference: " + c.getCircumference());

        // Rectangle
        rectangle r = new rectangle(4, 6);
        System.out.println("Rectangle area: " + r.getArea());
        System.out.println("Rectangle perimeter: " + r.getPerimeter());
        System.out.println("Rectangle sides: " + r.numberOfSides());

        // Right Triangle
        righttriangle rt = new righttriangle(3, 4);
        System.out.println("Right triangle area: " + rt.getArea());
        System.out.println("Right triangle perimeter: " + rt.getPerimeter());
        System.out.println("Right triangle sides: " + rt.numberOfSides());

        // Square
        square s = new square(5);
        System.out.println("Square area: " + s.getArea());
        System.out.println("Square perimeter: " + s.getPerimeter());
        System.out.println("Square sides: " + s.numberOfSides());

        // Isosceles Right Triangle
        isoscelesrighttriangle iso = new isoscelesrighttriangle(5);
        System.out.println("Isosceles Right Triangle area: " + iso.getArea());
        System.out.println("Isosceles Right Triangle perimeter: " + iso.getPerimeter());
        System.out.println("Isosceles Right Triangle sides: " + iso.numberOfSides());
    }
}
