package com.ami.objectmaster;

public class HumanTest {
	
	public static void main(String[] args) {
		
		Human ami = new Human();
		Human jess = new Human();
		
		ami.attack(jess);
		jess.displayHealth();
		
		jess.attack(ami);
		jess.attack(ami);
		
		ami.displayHealth();
	}

}
