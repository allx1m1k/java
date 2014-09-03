package com.lux.training.class19.version0;

public class Philosopher implements Runnable {

	private final static int THINK_TIME = 1;
	private final static int EAT_TIME = 1;

	private String name;
	private Fork leftFork;
	private Fork rightFork;

	private long totalWaitTime;
	private long startWaiting;
	private int eatCount;

	public static volatile boolean stopRequested;

	public Philosopher(String name, Fork leftFork, Fork rightFork) {
		this.name = name;
		this.leftFork = leftFork;
		this.rightFork = rightFork;
	}

	@Override
	public void run() {
		while (!stopRequested) {
			think();
				synchronized (leftFork) {
					synchronized (rightFork) {
						eat();
					}
				}
		}
		System.out.println("Philosopher " + name + " stopped");
	}

	private void think() {
		System.out.println("Philosopher " + name + " started thinking");
		try {
			Thread.sleep(THINK_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Philosopher " + name + " has finished thinking and is waiting for eating");
		startWaiting = System.currentTimeMillis();
	}

	private void eat() {
		long waitTime = System.currentTimeMillis() - startWaiting;
		totalWaitTime += waitTime;
		System.out.println("Philosopher " + name + " started eating after " + waitTime + " ms waiting");
		try {
			Thread.sleep(EAT_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Philosopher " + name + " has finished eating");
		eatCount++;
	}

	public void printResults() {
		System.out.println("Philosopher " + name + " total waiting: " + totalWaitTime + " ms; eating: " + eatCount + " times");
	}

	@Override
	public String toString() {
		return name + " " + leftFork + " " + rightFork;
	}

}
