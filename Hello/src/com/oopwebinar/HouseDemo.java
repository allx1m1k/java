package com.oopwebinar;




/**
 * Created by dima on 13.08.2015.
 */
public class HouseDemo {

    public static void main(String[] args) {
        House house = new House(16);
        Owner owner = new Owner("Pupkin");


        house.settle(owner);
        System.out.println(house.toString());

    }
}
