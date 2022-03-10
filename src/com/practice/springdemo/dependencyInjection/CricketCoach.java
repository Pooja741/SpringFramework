package com.practice.springdemo.dependencyInjection;

import com.practice.springdemo.inversionOfControl.Coach;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
