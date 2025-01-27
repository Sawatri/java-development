package com.test.sports;

public class Football extends Sports{

    @Override
    public void game(){
        System.out.println(super.getPlay()+" team has 11 players.");
    }
}
