package com.spring;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("Inside CricketCoach no-arg constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do catching Practice";
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getTeam() {
		return team;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Setter Injector");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
