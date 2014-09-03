package com.lux.training.class19.version1;

import java.util.concurrent.TimeUnit;
import java.lang.Class;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class PhilosophersTest1 {

	
	private final static String[] PHILOSOPHERS_NAMES = {"KANT", "NIETZSCHE", "SOCRATES", "PLATO", "HEGEL"};
	private final static int PHILOSOPHERS_COUNT = 5;
	
	public static void main(String[] args) throws InterruptedException {

		Fork[] forks = new Fork[PHILOSOPHERS_COUNT];
		for (int i = 0; i < PHILOSOPHERS_COUNT; i++) {
			forks[i] = new Fork(i+1);
		}
		
		
		
		Philosopher[] philosophers = new Philosopher[PHILOSOPHERS_COUNT];
		Thread[] threads = new Thread[PHILOSOPHERS_COUNT];
		for (int i = 0; i < PHILOSOPHERS_COUNT; i++) {
			philosophers[i] = new Philosopher(PHILOSOPHERS_NAMES[i], forks[i], (i < PHILOSOPHERS_COUNT - 1) ? forks[i+1] : forks[0]); 
			threads[i] = new Thread(philosophers[i]);
			threads[i].start();
			System.out.println(philosophers[i]);
		}
		
		TimeUnit.SECONDS.sleep(10);
		
		Philosopher.stopRequested = true;
		
		for (Thread thread : threads) {
			thread.join();
		}
		
		System.out.println("----------------------------------------------------------------");
		for (Philosopher philosopher : philosophers) {
			philosopher.printResults();
		}
	}

}

class Super { 
    Super() { printThree();
    
    Object obj = new Object();
    Class<?> clazz = obj.getClass();

    
    Annotation[] a = clazz.getAnnotations();
    } 
    void printThree() { System.out.println("three"); } 
} 
class Test extends Super { 
    int three = (int)Math.PI;  // That is, 3 
    void printThree() { System.out.println(three); } 
 
    public static void main(String[] args) { 
        Test t = new Test(); 
        t.printThree(); 
    } 
}
