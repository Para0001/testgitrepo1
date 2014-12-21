package frostpeak.game;

public class Fish {

	private String name;
	private int age;
	private FishType type;
	
	public Fish(){
		name = "Frank";
		age = 10;
		type = FishType.STUPID;
	}
	
	public String toString(){
		return "This fish is: " + name +
				". He is " + age + " years old. He is: " + type;
	}
}
