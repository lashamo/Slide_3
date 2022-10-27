package com.learn.slide3.polymorhism.overriding;

public class Runner {

    public static void main(String[] args) {
        Figure figure = new Figure();
        System.out.println(figure.getArea());

        Square square = new Square(10);
        System.out.println(square.getArea());

        Circle circle = new Circle(7);
        System.out.println(circle.getArea());


        Figure squareFigure = new Square(15);
        Figure circleFigure = new Circle(12);
        Figure[] figures = new Figure[2];
        figures[0] = squareFigure;
        figures[1] = circleFigure;

        for (int i = 0; i < 2; i++) {
            System.out.println(figures[i].getArea());
        }
    }
}
