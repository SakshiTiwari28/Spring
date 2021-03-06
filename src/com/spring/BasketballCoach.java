package com.spring;

public class BasketballCoach implements Coach{

	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService fortuneService){
		this.fortuneService =fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes aiming for the basket";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
