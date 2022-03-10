package com.practice.springdemo.practice;

import com.practice.springdemo.dependencyInjection.FortuneService;

import java.util.Random;

public class randomFortune implements FortuneService {
    @Override
    public String getFortune() {
        String[] fortuneArray = {"You will get your partner very soon", "Your luck is on the way", "Toady is happy day for you!"};
        int length = fortuneArray.length;
        Random random = new Random();
        int randomNumber = random.nextInt(length);
        return fortuneArray[randomNumber];
    }
}
