package com.ami.objectmaster;

public class Wizard extends Human {
	public int health = 50;
	public int intelligence = 8;
	
	
	public void heal(Human healedHuman) {
		healedHuman.health += this.intelligence;
	}
	
	public void fireball(Human fireballedHuman) {
		fireballedHuman.health -= this.intelligence * 3;
	}
}
