package frostpeak.game.domain;

import java.util.ArrayList;
import java.util.Random;

public class School {

	private ArrayList<Fish> school = new ArrayList<Fish>();
	private Random rand = new Random();

	
	
	public School(int numFish){
		
		int index = 0;
		while(index <= numFish){
			school.add(new Fish());
			index++;
		}
		
	}
	
	public void catchFish(){
		int index = rand.nextInt(school.size());
		Fish tempFish = school.get(index);
		System.out.println(tempFish.toString() + " He is dead now.");
		school.remove(index);
	}
}
