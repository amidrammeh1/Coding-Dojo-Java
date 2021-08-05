package com.ami.zookeeper;

public class Gorilla extends Mammal{
	
	public void throwSomething() {
		System.out.println("The Gorilla threw something and lost 5 energy points");
		this.energyLevel -= 5;
	}
	
	public void eatBanannas() {
		System.out.println("The Gorilla ate a bananna & is satisfied and has 10 more energy points");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The Gorilla climbes and lost 10 energy points.");
		this.energyLevel -= 10;
	}

}
