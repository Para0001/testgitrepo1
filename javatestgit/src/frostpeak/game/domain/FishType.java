package frostpeak.game.domain;

import java.util.ArrayList;

public enum FishType {
	GOLDFISH,
	BASS,
	TROUT,
	RAINBOW,
	STUPID;
	
	public static ArrayList<FishType> getFishTypes(){
		ArrayList<FishType> fishtypes = new ArrayList<FishType>();
		for(FishType fishtype : FishType.values()){
			fishtypes.add(fishtype);
		}
		return fishtypes;
	}
}

