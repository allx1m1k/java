package com.lux.classes.class4.examples;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitriy
 * Date: 27.05.14
 * Time: 22:12
 * To change this template use File | Settings | File Templates.
 */
public class Demo1 {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        rect1.heightRectangle = 2;
        rect1.widthRectangle = 5;
        System.out.println("Rectangle 1 area = " + rect1.getArea());

        Rectangle rect2 = new Rectangle();
        rect2.heightRectangle = 3;
        rect2.widthRectangle = 6;

        System.out.println("Rectangle 2 area = " + rect2.getArea());

        rect1 = rect2;
        rect2.widthRectangle = 100;

        System.out.println("Rectangle 1 area = " + rect1.getArea());
        System.out.println("Rectangle 2 area = " + rect2.getArea());
    }
}
