package com.ami.objectmaster;

public class Human {
	
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	
	public int health = 100;

	
	public void attack(Human attackedHuman) {
		attackedHuman.health -= this.strength;
	}
	
	public void displayHealth() {
		System.out.println("Health: " + this.health);
	}

}
