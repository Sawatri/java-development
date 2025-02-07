package com.test.student;

public class Course {
    private String courseName;
    private String tutorName;
    private String courseTiming;
    private Student student;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public String getCourseTiming() {
        return courseTiming;
    }

    public void setCourseTiming(String courseTiming) {
        this.courseTiming = courseTiming;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
