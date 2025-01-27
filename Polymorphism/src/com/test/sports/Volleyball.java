package com.test.sports;

public class Volleyball extends Sports{

    @Override
    public void game(){
        System.out.println(super.getPlay()+" team has six players.");
    }
}
