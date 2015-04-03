package com.lux.classes.class4.examples;

import com.lux.classes.class10.examples.Point;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitriy
 * Date: 26.05.14
 * Time: 19:41
 * To change this template use File | Settings | File Templates.
 */
public class Rectangle {
    Point pointRectangle;
    int widthRectangle;
    int heightRectangle;


    public Rectangle(Point point, int width, int height) {
        pointRectangle = point;
        widthRectangle = width;
        heightRectangle = height;

    }

    public Rectangle() {

    }

    int getArea() {
        return widthRectangle*heightRectangle;
    }

    void setHeight(int h) {
        heightRectangle = h;
    }
}
