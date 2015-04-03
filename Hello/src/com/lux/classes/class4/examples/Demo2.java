package com.lux.classes.class4.examples;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitriy
 * Date: 27.05.14
 * Time: 22:13
 * To change this template use File | Settings | File Templates.
 */
public class Demo2 {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        rect1.heightRectangle = 2;
        rect1.widthRectangle = 5;

        changeHeight1(rect1);
        System.out.println("Rectangle 1 height = " + rect1.heightRectangle);

        changeHeight2(rect1.heightRectangle);
        System.out.println("Rectangle 1 height = " + rect1.heightRectangle);

    }

    public static void changeHeight1(Rectangle r) {
        r.heightRectangle = 200;
    }

    public static void changeHeight2(int height) {
        height = 300;
    }
}
