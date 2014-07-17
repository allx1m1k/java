package com.lux.classes;

/**
 * Created by dima on 7/14/2014.
 */
public class Manager {
    //реализация принципа иверсия зависисмости
    Worker w; //Worker сделаем interface и конкретную реализацию мы инжектим в конструкторе
    //так мы получаем слабую связанность

    public Manager (Worker aWorker) {
        this.w = aWorker;

    }
    //Worker worker = new LasyWorker();
    //new Manager(worker)
    //как правило на практике мы даже не создаем LasyWorker- за нас это делает Inversion of C0ntrol Container (Spring, Google juice)
    public void manage() {
      Worker worker = new Worker();
        worker.work();
        //тут мы получили сильную связанность классов
        //класс Manager зависит от Worker
        //1. сложность внесения изменения если появился LasyWorker
        //2. сложности с модульными тестами, т.к. Manager инстаирует класс Worker
        //Принцип инверсия зависисмости говорит что класс Manager не должен создавать класс Worker
        //а должен получать его откудато из-вне
    }
}
