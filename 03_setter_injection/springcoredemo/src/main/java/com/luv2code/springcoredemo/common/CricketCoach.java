package com.luv2code.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWork() {
        return "practice fast bowling for 15 minutes!!!!";
    }
}
