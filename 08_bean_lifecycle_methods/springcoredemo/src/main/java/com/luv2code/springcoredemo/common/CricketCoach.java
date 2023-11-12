package com.luv2code.springcoredemo.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStartUpStuff(){
        System.out.println("In doMyStartUpStuff: "+ getClass().getSimpleName());
    }
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("In doMyCleantUpStuff: "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWork() {

        return "practice fast bowling for 15 minutes!";
    }
}
