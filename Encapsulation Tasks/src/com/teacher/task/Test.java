package com.teacher.task;

public class Test {
    public static void main(String[] args) {
        Teacher tea = new Teacher();
        tea.setName("Teacher");
        tea.setAge(19);
        tea.setGender("Female");
        tea.setPhone(9234564322L);
        tea.setSalary(20000f);

        System.out.println(tea.getName());
        System.out.println(tea.getAge());
        System.out.println(tea.getGender());
        System.out.println(tea.getPhone());
        System.out.println(tea.getSalary());

    }
}
