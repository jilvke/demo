package com.example.demo.softwaredesign;

class SquareTest {
    public static void resize(Square rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setSideLength(rectangle.getWidth() + 1);
            System.out.println("width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
        }
        System.out.println("方法结束：width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
        }
        System.out.println("方法结束：width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
    }

    public static void main(String[] args) {
/*        Square square = new Square();
        square.setSideLength(20);
        resize(square);*/
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setLength(40);
        resize(rectangle);
    }

}