package com.test.laptop;

public class Laptop {
    private String companyName;
    private double price;
    private String color;
    private String generation;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName(){
        return companyName;
    }

    public void setPrice(double price){
        this.price  = price;
    }

    public double getPrice(){
        return price;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setGeneration(String generation){
        this.generation = generation;
    }
    public String getGeneration(){
        return generation;
    }

}

