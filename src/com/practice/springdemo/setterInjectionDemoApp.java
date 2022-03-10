package com.practice.springdemo;

import com.practice.springdemo.inversionOfControl.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterInjectionDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("cricketCoach", Coach.class);

        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());

        context.close();

    }

}
