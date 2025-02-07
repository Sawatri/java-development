package com.test.student;

public class Test {
    public static void main(String[] args) {
        Course c = new Course();
        c.setCourseName("Java Development");
        c.setTutorName("Rahim Bux");
        c.setCourseTiming("8:00 to 9:30PM, Sunday & Monday");

        Student s = new Student();
        s.setName("Alpha");
        s.setAge(25);
        s.setGender("Male");

        c.setStudent(s);

        System.out.println("Course Name: "+c.getCourseName());
        System.out.println("Tutor Name: "+c.getTutorName());
        System.out.println("Course Timing: "+c.getCourseTiming());
        System.out.println("Student Name: "+c.getStudent().getName());
        System.out.println("Age: "+c.getStudent().getAge());
        System.out.println("Geneder: "+c.getStudent().getGender());

    }
}
