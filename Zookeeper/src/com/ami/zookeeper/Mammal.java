package com.ami.zookeeper;

public class Mammal {

	public int energyLevel = 100;
	
	
	public int displayEnergy() {
		System.out.println("Energy Level: " + this.energyLevel);
		return this.energyLevel;
	}

}


