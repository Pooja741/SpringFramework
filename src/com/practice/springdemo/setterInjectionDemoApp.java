package com.practice.springdemo;

import com.practice.springdemo.dependencyInjection.CricketCoach;
import com.practice.springdemo.inversionOfControl.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterInjectionDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);

        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());

        context.close();

    }

}
