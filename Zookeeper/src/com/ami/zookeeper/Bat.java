package com.ami.zookeeper;

public class Bat extends Mammal {
	
	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("The Bat is taking off and lost 50 energy points ");
		this.energyLevel -= 50;
	}
	
	public void eatHuman() {
		System.out.println("The Bat ate a human and got 35 energy points");
		this.energyLevel += 25;
	}
	
	public void attackHuman() {
		System.out.println("The Bat attacked town and lost 100 points");
		this.energyLevel -= 100;
	}
}
