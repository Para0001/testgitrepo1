package frostpeak.game.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Fish {

	private String name;
	private int age;
	private FishType type;
	
	private Random rand = new Random();
	
	public Fish(){
		name = getRandomName();
		age = rand.nextInt(10);
		type = getRandomFishType();
	}
	
	public Fish(String name, int age, FishType type){
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public FishType getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setType(FishType type) {
		this.type = type;
	}
	
	private String getRandomName() {
		try {
			Scanner scan = new Scanner(new File("Names.txt"));
			ArrayList<String> names = new ArrayList<String>();
			
			while(scan.hasNext()){
				names.add(scan.next());
			}
			scan.close();
			
			return names.get(rand.nextInt(names.size()));
		} catch (FileNotFoundException e) {
			return "Bob";
		}
	}
	
	public FishType getRandomFishType() {
		ArrayList<FishType> fishtypes = FishType.getFishTypes();
		return fishtypes.get(rand.nextInt(fishtypes.size()));
	}

	public String toString(){
		return "This fish's name is " + name +
				". He is " + age + " years old. He is of type " + type + ".";
	}
}
