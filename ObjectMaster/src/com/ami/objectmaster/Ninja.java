package com.ami.objectmaster;

public class Ninja extends Human{
	
	public int stealth = 10;
	
	
	public void steal(Human stolenHuman) {
		stolenHuman.health -= this.stealth;
		this.health += this.stealth;
	}
	
	public void runAway() {
		this.health -= 10;
		
	}

}
