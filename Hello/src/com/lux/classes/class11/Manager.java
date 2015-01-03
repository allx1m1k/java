package com.lux.classes.class11;

/**
 * Created by dima on 7/14/2014.
 */
public class Manager {
    //реализация принципа иверсия зависисмости
    Worker w; //Worker сделаем interface и конкретную реализацию мы инжектим в конструкторе (см. ниже)
    //так мы получаем слабую связанность в отличие от случая, когда Worker отдельный класс
    //и экземпляр Worker создается оператором new в теле Класса Manager вот так:
    //Worker worker = new Worker();

    public Manager (Worker aWorker) {
        this.w = aWorker;
    }
    //Worker worker = new LasyWorker();
    //new Manager(worker)
    //как правило на практике мы даже не создаем LasyWorker- за нас это делает Inversion of C0ntrol Container (Spring, Google juice)
    public void manage() {
      //Worker worker = new Worker();
        //тут мы получили сильную связанность классов
        //класс Manager зависит от Worker
        //1. сложность внесения изменения если появился LasyWorker
        //2. сложности с модульными тестами, т.к. Manager инстаирует (создает экземпляр) класс Worker
        //!!! Принцип инверсия зависисмости говорит что класс Manager не должен создавать класс Worker
        //а должен получать его откудато из-вне !!!
        w.work();
    }
}
