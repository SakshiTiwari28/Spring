package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from Spring container
		Coach myCoach = context.getBean("basketball", Coach.class);
		Coach trackCoach = context.getBean("track",TrackCoach.class);
		Coach baseballcoach = context.getBean("baseball", BaseballCoach.class);
		CricketCoach coach = context.getBean("cricket",CricketCoach.class);
	
		
		//call method on the bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		System.out.println(trackCoach.getDailyWorkout());
	    System.out.println(trackCoach.getDailyFortune());
		System.out.println(baseballcoach.getDailyFortune());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getTeam());
		System.out.println(coach.getEmailAddress());

		context.close();
		
	}

}
