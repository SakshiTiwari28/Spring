package com.spring;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "run for 5 km";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
