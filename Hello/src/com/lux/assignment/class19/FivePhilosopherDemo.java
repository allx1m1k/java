package com.lux.assignment.class19;

/**
 * Created by dima on 8/21/2014.
 */
public class FivePhilosopherDemo {

    public static void main(String[] args) {
        //создадим массив вилок
        Fork[] forks = new Fork[5];
        for (int i = 0; i< 5; i++) {
            forks[i] = new Fork(i, 0);
        }

        //создадим философа
        Philosopher philosopher0 = new Philosopher("Socrat", 0);
        Thread p0Thread = new Thread(philosopher0, philosopher0.getName());
        philosopher0.setForks(forks);

        //создадим философа
        Philosopher philosopher1 = new Philosopher("Pluton", 1);
        Thread p1Thread = new Thread(philosopher1, philosopher1.getName());
        philosopher1.setForks(forks);

        p0Thread.start();
        try {

            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p1Thread.start();

    }
}
/*
        //создадим коллекцию философов
        List<Philosopher> philosophers = new ArrayList<>();
        //поместим философов в список
        philosophers.add(new Philosopher("Platon"));
        philosophers.add(new Philosopher("Aristotel"));
        philosophers.add(new Philosopher("Lukreciy"));
        philosophers.add(new Philosopher("Socrat"));
        philosophers.add(new Philosopher("Zarathrustra"));
        //создадим связанную коллекцию вилок
        List<Fork> forks = new LinkedList<>();
        forks.add(new Fork(0));
        forks.add(new Fork(0));
        forks.add(new Fork(0));
        forks.add(new Fork(0));
        forks.add(new Fork(0));
*/

