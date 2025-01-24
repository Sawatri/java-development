package com.teacher.task;

public class Teacher {
    private String name;
    private int age;
    private String gender;
    private long phone;
    private float salary;

   public void setName(String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }
   public void setAge(int age){
       if(age <= 18){
           System.out.println("Sorry! You are not eligible for job.");
           this.age = age;
       }else {
           System.out.println("You are eligible for job.");
           this.age = age;
       }
   }
   public int getAge(){
       return age;
   }
   public void setGender(String gender){
       this.gender = gender;
   }
   public String getGender(){
       return gender;
   }
   public void setPhone(long phone){
       this.phone = phone;
   }
   public long getPhone(){
       return phone;
   }
   public void setSalary(float salary){
       if(salary >= 15000 && salary <= 20000){
           float tax =(salary * 5)/100;
           this.salary = salary + tax;
       } else if (salary >= 25000 && salary<=35000) {
           float tax = (salary * 10)/100;
           this.salary = salary + tax;
       }else {
           float tax = (salary * 15)/100;
           this.salary = salary + tax;
       }
   }
   public float getSalary(){
       return salary;
   }

}

