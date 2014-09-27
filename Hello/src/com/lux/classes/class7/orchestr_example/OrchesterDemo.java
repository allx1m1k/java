package com.lux.classes.class7.orchestr_example;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitriy
 * Date: 05.06.14
 * Time: 19:10
 * To change this template use File | Settings | File Templates.
 */
public class OrchesterDemo {
    public static void main(String[] args) {
        Orchester orchester = new Orchester(6);
        orchester.addMember(new Violine("red"));
        orchester.addMember(new Drum("red"));
        orchester.addMember(new Drum("blue"));
        orchester.addMember(new Drum("green"));
        orchester.addMember(new Dancer("Ivan", "Ivanov", true));
        orchester.addMember(new Singer("Ivan", "Ivanov", true, "bariton"));

        orchester.play();
    }
}
