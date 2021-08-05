package com.ami.objectmaster;

public class Samurai extends Human{
	
	private static int totalSamurais = 0;
	
	public Samurai() {
		health = 200;
		totalSamurais++;
	}
	
	
	public void deathBlow(Human blownHuman) {
		blownHuman.health = 0;
		this.health /= 2;
		
	}
	
	public void mediatate() {
		this.health += this.health/ 2;
	}
	
	public int howMany() {
		return totalSamurais;
	}

}
