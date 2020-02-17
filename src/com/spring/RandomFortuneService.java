package com.spring;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] data = {"Get up Early in the morning" , "The journey is the reward" ,"Diligence is important"};
	
	public String getFortune() {
		Random myRandom = new Random();
		int index = myRandom.nextInt(data.length);
		String theData = data[index];
		return theData;
	}

}
