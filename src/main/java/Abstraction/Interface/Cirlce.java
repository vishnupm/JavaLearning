package Abstraction.Interface;

import Abstraction.Circle;

public class Cirlce implements Shapes {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.drawShape();
        c.colorShape();
        c.moveShape();
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing circle");
    }

    @Override
    public void colorShape() {
        System.out.println("Coloring circle");
    }

    @Override
    public void moveShape() {
        System.out.println("Moving circle");
    }
}
