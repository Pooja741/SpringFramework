package com.practice.springdemo.dependencyInjection;

import com.practice.springdemo.inversionOfControl.Coach;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String team;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;
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
