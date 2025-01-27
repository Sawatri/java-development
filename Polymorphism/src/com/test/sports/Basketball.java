package com.test.sports;

public class Basketball extends Sports {

    @Override
    public void game(){
        System.out.println(super.getPlay()+" team has five players");
    }
}
