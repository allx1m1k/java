package com.lux.classes.class7.orchestr_example;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitriy
 * Date: 05.06.14
 * Time: 19:02
 * To change this template use File | Settings | File Templates.
 */
public class Orchester {

    private Playable[] members;
    private int cnt;

    public Orchester(int membersCount) {
        members = new Playable[membersCount];
        cnt = 0;
    }

    public void addMember(Playable member) {
        members[cnt++] = member;
    }

    public void play() {
        for (Playable member : members) {
            member.play();
        }
    }
}
