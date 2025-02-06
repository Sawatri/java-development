package com.test.association;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("XYZ");
        s1.setRollNumber("2k/CSM/45");

        Library lib = new Library();
        lib.setLibraryCardNo("Lib/950");
        lib.setBookIssueDate("06-02-2025");

        s1.setLibrary(lib);

        System.out.println("Student Name: "+s1.getName());
        System.out.println("Student Roll Number: "+s1.getRollNumber());
        System.out.println("Library Card No: "+s1.getLibrary().getLibraryCardNo());
        System.out.println("Date of issue: "+s1.getLibrary().getBookIssueDate());
    }
}
